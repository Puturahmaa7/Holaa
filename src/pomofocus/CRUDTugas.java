package pomofocus;

import java.sql.*;
import java.util.*;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Time;
import java.sql.SQLException;
import java.sql.*;

public class CRUDTugas {
    private static CRUDTugas instance;
    private Connection conn;

    private CRUDTugas() throws SQLException, Exception {
        conn = Koneksi.configDB();
    }

    public static CRUDTugas getInstance() throws SQLException, Exception {
        if (instance == null) instance = new CRUDTugas();
        return instance;
    }

    public boolean tambahTugas(String nama, Date tgl, Time jam, String deskripsi) throws SQLException {
        String sql = "INSERT INTO tugas (nama_tugas, tanggal_deadline, jam_deadline, deskripsi) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nama);
        stmt.setDate(2, tgl);
        stmt.setTime(3, jam);
        stmt.setString(4, deskripsi);
        return stmt.executeUpdate() > 0;
    }


    public List<TugasGetSet> ambilSemuaTugas() throws SQLException {
        List<TugasGetSet> list = new ArrayList<>();
        String sql = "SELECT * FROM tugas ORDER BY tanggal_deadline ASC";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            list.add(new TugasGetSet(
                rs.getInt("id_tugas"),
                rs.getString("nama_tugas"),
                rs.getString("tanggal_deadline"),
                rs.getString("jam_deadline"),
                rs.getString("deskripsi"),
                rs.getString("status")
            ));
        }
        return list;
    }

    public boolean updateTugas(int id, String nama, String tgl, String jam, String deskripsi) throws SQLException {
        String sql = "UPDATE tugas SET nama_tugas=?, tanggal_deadline=?, jam_deadline=?, deskripsi=? WHERE id_tugas=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nama);
        stmt.setString(2, tgl);
        stmt.setString(3, jam);
        stmt.setString(4, deskripsi);
        stmt.setInt(5, id);
        return stmt.executeUpdate() > 0;
    }

    public boolean hapusTugas(int id) throws SQLException {
        String sql = "DELETE FROM tugas WHERE id_tugas=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        return stmt.executeUpdate() > 0;
    }

    public boolean tandaiSelesai(int id) throws SQLException {
        String sql = "UPDATE tugas SET status='selesai' WHERE id_tugas=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        return stmt.executeUpdate() > 0;
    }
    
    public List<TugasGetSet> ambilTugasTerdekat(int hariKeDepan) throws SQLException {
        List<TugasGetSet> list = new ArrayList<>();
        String sql = "SELECT * FROM tugas WHERE tanggal_deadline BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL ? DAY) ORDER BY tanggal_deadline ASC, jam_deadline ASC";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, hariKeDepan);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            list.add(new TugasGetSet(
                rs.getInt("id_tugas"),
                rs.getString("nama_tugas"),
                rs.getString("tanggal_deadline"),
                rs.getString("jam_deadline"),
                rs.getString("deskripsi"),
                rs.getString("status")
            ));
        }
        return list;
    }

    public TugasGetSet getTugasById(int idTugas) throws SQLException {
    String query = "SELECT * FROM tugas WHERE id_tugas = ?";
    try (PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setInt(1, idTugas);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return new TugasGetSet(
                rs.getInt("id_tugas"),
                rs.getString("nama_tugas"),
                rs.getString("tanggal_deadline"),
                rs.getString("jam_deadline"),
                rs.getString("deskripsi"),
                rs.getString("status")  
            );
        }
    }
    return null;
}
}
