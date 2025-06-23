package Tugas;

import Database.Koneksi;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class PanelDaftarTugas extends JPanel {

    public PanelDaftarTugas() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(248, 244, 225));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        loadData();
    }

    private void loadData() {
        removeAll();

        try (Connection conn = Koneksi.configDB();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM tugas ORDER BY tanggal_deadline ASC, jam_deadline ASC")) {

            while (rs.next()) {
                int id = rs.getInt("id_tugas");
                String nama = rs.getString("nama_tugas");
                String tanggal = rs.getString("tanggal_deadline");
                String jam = rs.getString("jam_deadline");
                String status = rs.getString("status");

                DaftarTugas tugasPanel = new DaftarTugas(id, nama, tanggal, jam, status);
                tugasPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
                add(tugasPanel);
                add(Box.createVerticalStrut(10));
            }

        } catch (Exception e) {
            add(new JLabel("Gagal memuat data: " + e.getMessage()));
            e.printStackTrace();
        }

        revalidate();
        repaint();
    }
}
