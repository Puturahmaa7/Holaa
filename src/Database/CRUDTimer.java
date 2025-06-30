package Database;

import Timer.Progress;
import Timer.TimerSession;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.*;

public class CRUDTimer {

    private final Connection con;

    public CRUDTimer() throws Exception {
        con = Koneksi.configDB();
    }
    
        public int tambahTujuan(int idPengguna, String judul, int durasi) throws SQLException {
        PreparedStatement p = con.prepareStatement(
            "INSERT INTO tujuan (id_pengguna, judul_tujuan, durasi_tujuan, persentase_progres, total_waktu_belajar) VALUES (?, ?, ?, 0, 0)",
            Statement.RETURN_GENERATED_KEYS
        );
        p.setInt(1, idPengguna);
        p.setString(2, judul);
        p.setInt(3, durasi);
        p.executeUpdate();

        ResultSet r = p.getGeneratedKeys();
        int idTujuan = -1;
        if (r.next()) {
            idTujuan = r.getInt(1);
        }
        r.close();
        p.close();

        generateSesi(idTujuan, durasi);
        return idTujuan;
    }

    public void generateSesi(int idTujuan, int durasiTotal) throws SQLException {
        final int FOKUS = 25;
        final int ISTIRAHAT_PENDEK = 5;
        final int ISTIRAHAT_PANJANG = 15;

        PreparedStatement insert = con.prepareStatement(
            "INSERT INTO pomodoro_sesi (id_tujuan, urutan, jenis, durasi) VALUES (?, ?, ?, ?)"
        );

        int sisa = durasiTotal;
        int urutan = 0;
        int countFokus = 0;

        while (sisa >= FOKUS) {
            // Fokus
            insert.setInt(1, idTujuan);
            insert.setInt(2, urutan++);
            insert.setString(3, "Fokus");
            insert.setInt(4, FOKUS);
            insert.executeUpdate();
            sisa -= FOKUS;
            countFokus++;

            // Istirahat
            if (countFokus % 4 == 0 && sisa >= ISTIRAHAT_PANJANG) {
                insert.setInt(1, idTujuan);
                insert.setInt(2, urutan++);
                insert.setString(3, "Istirahat Panjang");
                insert.setInt(4, ISTIRAHAT_PANJANG);
                insert.executeUpdate();
                sisa -= ISTIRAHAT_PANJANG;
            } else if (sisa >= ISTIRAHAT_PENDEK) {
                insert.setInt(1, idTujuan);
                insert.setInt(2, urutan++);
                insert.setString(3, "Istirahat Pendek");
                insert.setInt(4, ISTIRAHAT_PENDEK);
                insert.executeUpdate();
                sisa -= ISTIRAHAT_PENDEK;
            }
        }

        if (sisa > 0) {
            insert.setInt(1, idTujuan);
            insert.setInt(2, urutan);
            insert.setString(3, "Sisa Waktu");
            insert.setInt(4, sisa);
            insert.executeUpdate();
        }

        insert.close();
    }


    public List<TimerSession> getSesiByTujuan(int idTujuan) throws SQLException {
        PreparedStatement p = con.prepareStatement(
            "SELECT * FROM pomodoro_sesi WHERE id_tujuan = ? ORDER BY urutan ASC"
        );
        p.setInt(1, idTujuan);
        ResultSet r = p.executeQuery();

        List<TimerSession> sesiList = new ArrayList<>();
        while (r.next()) {
            TimerSession s = new TimerSession(
                r.getInt("id_sesi"),
                r.getString("jenis"),
                r.getInt("durasi"),
                r.getBoolean("selesai")
            );
            sesiList.add(s);
        }

        r.close();
        p.close();
        return sesiList;
    }

    // Simpan progress saat pause
    public void simpanProgress(int idTujuan, int idSesi, int sisaDetik) throws SQLException {
        PreparedStatement p1 = con.prepareStatement("DELETE FROM pomodoro_progress WHERE id_tujuan = ?");
        p1.setInt(1, idTujuan);
        p1.executeUpdate();
        p1.close();

        PreparedStatement p2 = con.prepareStatement(""
            + "INSERT INTO pomodoro_progress (id_tujuan, id_sesi, waktu_tersisa) VALUES (?, ?, ?)"
        );
        p2.setInt(1, idTujuan);
        p2.setInt(2, idSesi);
        p2.setInt(3, sisaDetik);
        p2.executeUpdate();
        p2.close();
    }

    // Ambil progress terakhir untuk resume
    public Progress ambilProgress(int idTujuan) throws SQLException {
        PreparedStatement p = con.prepareStatement(""
            + "SELECT * FROM pomodoro_progress WHERE id_tujuan = ? LIMIT 1"
        );
        p.setInt(1, idTujuan);
        ResultSet r = p.executeQuery();

        if (r.next()) {
            return new  Progress(
                r.getInt("id_progress"),
                r.getInt("id_tujuan"),
                r.getInt("id_sesi"),
                r.getInt("waktu_tersisa")
            );
        }

        return null;
    }

    // Tandai sesi selesai
    public void tandaiSesiSelesai(int idSesi) throws SQLException {
        PreparedStatement p = con.prepareStatement("UPDATE pomodoro_sesi SET selesai = TRUE WHERE id_sesi = ?");
        p.setInt(1, idSesi);
        p.executeUpdate();
        p.close();
    }

    // Update progres dan waktu berjalan
    public void updateProgressDanWaktu(int idTujuan, int tambahanMenit) throws SQLException {
        PreparedStatement p = con.prepareStatement(
            "UPDATE tujuan SET waktu_berjalan = waktu_berjalan + ?, persentase_progres = ROUND((waktu_berjalan + ?) * 100.0 / durasi_tujuan) WHERE id_tujuan = ?"
        );
        p.setInt(1, tambahanMenit);
        p.setInt(2, tambahanMenit);
        p.setInt(3, idTujuan);
        p.executeUpdate();
        p.close();
    }

    // Hapus progress saat semua sesi selesai
    public void hapusProgress(int idTujuan) throws SQLException {
        PreparedStatement p = con.prepareStatement("DELETE FROM pomodoro_progress WHERE id_tujuan = ?");
        p.setInt(1, idTujuan);
        p.executeUpdate();
        p.close();
    }
}


