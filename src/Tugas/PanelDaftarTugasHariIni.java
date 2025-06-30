package Tugas;

import Database.Session;
import Database.CRUDTugas;
import Database.TugasGetSet;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelDaftarTugasHariIni extends JPanel {
    public PanelDaftarTugasHariIni() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(250,227,143));
        setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        loadData();
    }

    private void loadData() {
        removeAll();

        try {
            int idPengguna = Session.currentUser.getUserID(); // ambil ID user login
            CRUDTugas crud = CRUDTugas.getInstance();
            List<TugasGetSet> daftarTugasHariIni = crud.ambilTugasHariIni(idPengguna);

            for (TugasGetSet tugas : daftarTugasHariIni) {
                DaftarTugasHariIni tugasPanel = new DaftarTugasHariIni(
                    tugas.getIdTugas(),
                    tugas.getNamaTugas(),
                    tugas.getTanggalDeadline(),
                    tugas.getJamDeadline(),
                    tugas.getStatus()
                );
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
