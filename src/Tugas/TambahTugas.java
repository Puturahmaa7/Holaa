package Tugas;

import Database.CRUDTugas;
import Database.Session;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class TambahTugas extends javax.swing.JFrame {

    public TambahTugas() {
        initComponents();
        sVGIcon11.setSVGIcon("SVGIcon/NewBack.svg", 50, 50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        JudulTugasTambah = new javax.swing.JTextField();
        DeskripsiTugas = new javax.swing.JScrollPane();
        DescTugasTambah = new javax.swing.JTextArea();
        DeadlineTugasTambah = new com.toedter.calendar.JDateChooser();
        WaktuTanggalDeadline = new javax.swing.JLabel();
        WaktuTanggalDeadline1 = new javax.swing.JLabel();
        WaktuTanggalDeadline2 = new javax.swing.JLabel();
        WaktuTanggalDeadline3 = new javax.swing.JLabel();
        PanelAtas2 = new javax.swing.JPanel();
        JudulTugas1 = new javax.swing.JLabel();
        sVGIcon11 = new Instance.SVGIcon();
        button1 = new Instance.Button();
        WaktuDeadlineTugasTambah = new lu.tudor.santec.jtimechooser.JTimeChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(248, 244, 225));
        MainPanel.setPreferredSize(new java.awt.Dimension(375, 812));

        JudulTugasTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JudulTugasTambahActionPerformed(evt);
            }
        });

        DescTugasTambah.setColumns(20);
        DescTugasTambah.setRows(5);
        DeskripsiTugas.setViewportView(DescTugasTambah);

        WaktuTanggalDeadline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WaktuTanggalDeadline.setForeground(new java.awt.Color(0, 0, 153));
        WaktuTanggalDeadline.setText("Waktu Deadline");

        WaktuTanggalDeadline1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WaktuTanggalDeadline1.setForeground(new java.awt.Color(0, 0, 153));
        WaktuTanggalDeadline1.setText("Judul Tugas");

        WaktuTanggalDeadline2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WaktuTanggalDeadline2.setForeground(new java.awt.Color(0, 0, 153));
        WaktuTanggalDeadline2.setText("Tanggal Deadline");

        WaktuTanggalDeadline3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WaktuTanggalDeadline3.setForeground(new java.awt.Color(0, 0, 153));
        WaktuTanggalDeadline3.setText("Deskripsi Tugas");

        PanelAtas2.setBackground(new java.awt.Color(255, 174, 57));
        PanelAtas2.setForeground(new java.awt.Color(102, 0, 102));

        JudulTugas1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JudulTugas1.setForeground(new java.awt.Color(0, 0, 153));
        JudulTugas1.setText("Tambah Tugas");

        sVGIcon11.setText("sVGIcon1");
        sVGIcon11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sVGIcon11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelAtas2Layout = new javax.swing.GroupLayout(PanelAtas2);
        PanelAtas2.setLayout(PanelAtas2Layout);
        PanelAtas2Layout.setHorizontalGroup(
            PanelAtas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtas2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(sVGIcon11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JudulTugas1)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        PanelAtas2Layout.setVerticalGroup(
            PanelAtas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtas2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(PanelAtas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JudulTugas1)
                    .addComponent(sVGIcon11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        button1.setText("Tambah Tugas");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAtas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WaktuDeadlineTugasTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JudulTugasTambah)
                            .addComponent(DeskripsiTugas)
                            .addComponent(DeadlineTugasTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                        .addComponent(WaktuTanggalDeadline, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(WaktuTanggalDeadline1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(WaktuTanggalDeadline2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(WaktuTanggalDeadline3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(PanelAtas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WaktuTanggalDeadline1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JudulTugasTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WaktuTanggalDeadline2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeadlineTugasTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WaktuTanggalDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WaktuDeadlineTugasTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WaktuTanggalDeadline3)
                .addGap(18, 18, 18)
                .addComponent(DeskripsiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JudulTugasTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JudulTugasTambahActionPerformed

    }//GEN-LAST:event_JudulTugasTambahActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String namaTugas = JudulTugasTambah.getText().trim();
        Calendar tanggalCal = DeadlineTugasTambah.getCalendar();
        String deskripsi = DescTugasTambah.getText().trim();

        int jam = WaktuDeadlineTugasTambah.getHours();
        int menit = WaktuDeadlineTugasTambah.getMinutes();
        int detik = 0;

        if (namaTugas.isEmpty() || tanggalCal == null) {
            JOptionPane.showMessageDialog(this, "Semua field wajib diisi.");
            return;
        }

        Calendar gabung = Calendar.getInstance();
        gabung.set(
            tanggalCal.get(Calendar.YEAR),
            tanggalCal.get(Calendar.MONTH),
            tanggalCal.get(Calendar.DAY_OF_MONTH),
            jam,
            menit,
            detik
        );

        java.sql.Date sqlTanggal = new java.sql.Date(gabung.getTimeInMillis());
        java.sql.Time sqlWaktu = new java.sql.Time(gabung.getTimeInMillis());

        try {
            int idLogin = Session.currentUser.getUserID();
            CRUDTugas crud = CRUDTugas.getInstance();
            boolean sukses = crud.tambahTugas(namaTugas, sqlTanggal, sqlWaktu, deskripsi, idLogin);
            
            if (sukses) {
                JOptionPane.showMessageDialog(this, "Tugas berhasil ditambahkan.");
                JudulTugasTambah.setText("");
                DeadlineTugasTambah.setDate(null);
                DescTugasTambah.setText("");

                Calendar kosong = Calendar.getInstance();
                kosong.set(Calendar.HOUR_OF_DAY, 0);
                kosong.set(Calendar.MINUTE, 0);
                kosong.set(Calendar.SECOND, 0);
                WaktuDeadlineTugasTambah.setTime(kosong.getTime());
                new Tugas().setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan tugas.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void sVGIcon11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sVGIcon11MouseClicked
        new Tugas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sVGIcon11MouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahTugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DeadlineTugasTambah;
    private javax.swing.JTextArea DescTugasTambah;
    private javax.swing.JScrollPane DeskripsiTugas;
    private javax.swing.JLabel JudulTugas1;
    private javax.swing.JTextField JudulTugasTambah;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PanelAtas2;
    private lu.tudor.santec.jtimechooser.JTimeChooser WaktuDeadlineTugasTambah;
    private javax.swing.JLabel WaktuTanggalDeadline;
    private javax.swing.JLabel WaktuTanggalDeadline1;
    private javax.swing.JLabel WaktuTanggalDeadline2;
    private javax.swing.JLabel WaktuTanggalDeadline3;
    private Instance.Button button1;
    private Instance.SVGIcon sVGIcon11;
    // End of variables declaration//GEN-END:variables
}
