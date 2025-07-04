package Database;

public class UserInfoGetSet {
    private int userID;
    private String userName;
    private String email;
    private String password;
    private String resetCode;

    public UserInfoGetSet() {
}

    public UserInfoGetSet(int userID, String userName, String email, String password, String resetCode) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.resetCode = resetCode;
    }

    public int getUserID() {
        return userID;
    }
    

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getResetCode() {
        return resetCode;
    }

}
