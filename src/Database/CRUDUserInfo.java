package Database;

import Database.Koneksi;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CRUDUserInfo {

    private final Connection con;

    public CRUDUserInfo() throws Exception {
        con = Koneksi.configDB();
    }

    public static CRUDUserInfo getInstance() {
        try {
            return new CRUDUserInfo();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean validatePassword(String password) {
        if (password == null || password.length() < 8) return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
        }

        return hasUpper && hasLower && hasDigit;
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 not supported", e);
        }
    }

    public void insertUser(UserInfoGetSet user) throws SQLException {
        if (!validatePassword(user.getPassword())) {
            throw new IllegalArgumentException("Password minimal terdiri dari 8 karakter, mengandung huruf besar, huruf kecil, dan angka.");
        }

        String hashedPassword = hashPassword(user.getPassword());

        PreparedStatement p = con.prepareStatement(
            "INSERT INTO pengguna (nama_pengguna, email, password) VALUES (?, ?, ?)",
            Statement.RETURN_GENERATED_KEYS
        );
        p.setString(1, user.getUserName());
        p.setString(2, user.getEmail());
        p.setString(3, hashedPassword);
        p.execute();

        ResultSet r = p.getGeneratedKeys();
        if (r.next()) {
            user.setUserID(r.getInt(1));
        }
        r.close();
        p.close();
    }

    public boolean checkDuplicateUser(String user) throws SQLException {
        PreparedStatement p = con.prepareStatement("SELECT id_pengguna FROM pengguna WHERE nama_pengguna=? LIMIT 1");
        p.setString(1, user);
        ResultSet r = p.executeQuery();
        boolean duplicate = r.next();
        r.close();
        p.close();
        return duplicate;
    }

    public boolean checkDuplicateEmail(String email) throws SQLException {
        PreparedStatement p = con.prepareStatement("SELECT id_pengguna FROM pengguna WHERE email=? LIMIT 1");
        p.setString(1, email);
        ResultSet r = p.executeQuery();
        boolean duplicate = r.next();
        r.close();
        p.close();
        return duplicate;
    }
    
    public boolean checkEmailExist(String email) throws SQLException {
    PreparedStatement p = con.prepareStatement("SELECT id_pengguna FROM pengguna WHERE email=? LIMIT 1");
    p.setString(1, email);
    ResultSet r = p.executeQuery();
    boolean exists = r.next();
    r.close();
    p.close();
    return exists;
    }
    
    private boolean checckDuplicateResetCode(String code) throws SQLException {
        PreparedStatement p = con.prepareStatement("SELECT id_pengguna FROM pengguna WHERE kode_reset=? LIMIT 1");
        p.setString(1, code);
        ResultSet r = p.executeQuery();
        boolean exists = r.next();
        r.close();
        p.close();
        return exists;
    }

    private String generateResetCode() throws SQLException {
        DecimalFormat df = new DecimalFormat("000000");
        Random ran = new Random();
        String code;
        do {
            code = df.format(ran.nextInt(1000000));
        } while (checckDuplicateResetCode(code));
        return code;
    }

    public String sendVerificationCode(String email) throws SQLException {
        String code = generateResetCode();

        PreparedStatement p = con.prepareStatement("UPDATE pengguna SET kode_reset=? WHERE email=? LIMIT 1");
        p.setString(1, code);
        p.setString(2, email);
        p.executeUpdate();
        p.close();

        return code;
    }

    public boolean verifytCode(String email, String code) throws SQLException {
        PreparedStatement p = con.prepareStatement("SELECT id_pengguna FROM pengguna WHERE email=? AND kode_reset=? LIMIT 1");
        p.setString(1, email);
        p.setString(2, code);
        ResultSet r = p.executeQuery();
        boolean valid = r.next();
        r.close();
        p.close();
        return valid;
    }

    public boolean resetPassword(String email, String newPassword) throws SQLException {
        if (!validatePassword(newPassword)) {
            throw new IllegalArgumentException("Password minimal terdiri dari 8 karakter, mengandung huruf besar, huruf kecil, dan angka.");
        }

        String hashedPassword = hashPassword(newPassword);

        PreparedStatement p = con.prepareStatement("UPDATE pengguna SET password=?, kode_reset='' WHERE email=? LIMIT 1");
        p.setString(1, hashedPassword);
        p.setString(2, email);
        int updated = p.executeUpdate();
        p.close();
        return updated > 0;
    }
    
    public UserInfoGetSet loginByUsername(String username, String password) throws SQLException {
    String hashedPassword = hashPassword(password);

    PreparedStatement p = con.prepareStatement(
        "SELECT id_pengguna, nama_pengguna, email FROM pengguna WHERE nama_pengguna=? AND password=? LIMIT 1"
    );
    p.setString(1, username);
    p.setString(2, hashedPassword);

    ResultSet r = p.executeQuery();

    if (r.next()) {
        UserInfoGetSet user = new UserInfoGetSet();
        user.setUserID(r.getInt("id_pengguna"));
        user.setUserName(r.getString("nama_pengguna"));
        user.setEmail(r.getString("email"));
        return user;
    }

    return null;
    }
    
    public boolean sendResetCodeToEmail(String email) throws SQLException {
        if (!checkEmailExist(email)) return false;

        String code = generateResetCode();
        
        PreparedStatement p = con.prepareStatement("UPDATE pengguna SET kode_reset=? WHERE email=? LIMIT 1");
        p.setString(1, code);
        p.setString(2, email);
        p.executeUpdate();
        p.close();
        
        final String senderEmail = "juara1nihbossss@gmail.com";
        final String senderPassword = "yrni kplw btow gqmm";
        String subject = "KODE VERIFIKASI";
        String body = "Kode reset password Anda adalah: " + code;

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });


        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail, "PomoFocus"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean updateUserData(int userID, String newUsername, String newEmail) throws SQLException {
    String sql = "UPDATE pengguna SET nama_pengguna = ?, email = ? WHERE id_pengguna = ?";
    PreparedStatement stmt = con.prepareStatement(sql);
    stmt.setString(1, newUsername);
    stmt.setString(2, newEmail);
    stmt.setInt(3, userID);
    return stmt.executeUpdate() > 0;
}

}
