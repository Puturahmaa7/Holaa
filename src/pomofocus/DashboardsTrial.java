package pomofocus;

import DataPengguna.Login;
import DataPengguna.Profile;
import Database.Session;
import Tugas.PanelDaftarTugasHariIni;
import javax.swing.JOptionPane;

public class DashboardsTrial extends javax.swing.JFrame {

    public DashboardsTrial() {
        initComponents();
        PanelDaftarTugasHariIni daftarPanel = new PanelDaftarTugasHariIni();
        jScrollPane1.setViewportView(daftarPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        PanelAtas = new javax.swing.JPanel();
        PanelAtas1 = new javax.swing.JPanel();
        sVGIcon10 = new Instance.SVGIcon();
        sVGIcon11 = new Instance.SVGIcon();
        TugasHariIni = new javax.swing.JPanel();
        HeadTugasHariIni = new javax.swing.JLabel();
        TanggalHariIni = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StatistikPanelUtama = new javax.swing.JPanel();
        HeadJudulStatistik = new javax.swing.JLabel();
        ReminderPanel = new javax.swing.JPanel();
        PanelTugas1Remind = new java.awt.Panel();
        TanggalWaktuDeadlineTugasRemind1 = new javax.swing.JLabel();
        JudulTugasRemind1 = new javax.swing.JLabel();
        PanelTugasRemind2 = new java.awt.Panel();
        JudulTugasRemind2 = new javax.swing.JLabel();
        TanggalWaktuDeadlineRemind2 = new javax.swing.JLabel();
        HeadReminder = new javax.swing.JLabel();
        TanggalStart = new javax.swing.JLabel();
        TanggalEnd = new javax.swing.JLabel();
        PenghubungTanggal = new javax.swing.JLabel();
        navbar1 = new Instance.Navbar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(248, 244, 225));
        MainPanel.setPreferredSize(new java.awt.Dimension(375, 812));

        PanelAtas.setBackground(new java.awt.Color(255, 174, 57));
        PanelAtas.setForeground(new java.awt.Color(102, 0, 102));

        PanelAtas1.setBackground(new java.awt.Color(255, 174, 57));
        PanelAtas1.setForeground(new java.awt.Color(102, 0, 102));

        sVGIcon10.setText("sVGIcon1");

        sVGIcon11.setText("sVGIcon1");
        sVGIcon11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sVGIcon11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelAtas1Layout = new javax.swing.GroupLayout(PanelAtas1);
        PanelAtas1.setLayout(PanelAtas1Layout);
        PanelAtas1Layout.setHorizontalGroup(
            PanelAtas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtas1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sVGIcon10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(sVGIcon11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelAtas1Layout.setVerticalGroup(
            PanelAtas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtas1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelAtas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sVGIcon11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sVGIcon10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelAtasLayout = new javax.swing.GroupLayout(PanelAtas);
        PanelAtas.setLayout(PanelAtasLayout);
        PanelAtasLayout.setHorizontalGroup(
            PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAtasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelAtas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelAtasLayout.setVerticalGroup(
            PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
            .addGroup(PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAtasLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(PanelAtas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        TugasHariIni.setBackground(new java.awt.Color(250, 227, 143));

        HeadTugasHariIni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeadTugasHariIni.setForeground(new java.awt.Color(0, 0, 153));
        HeadTugasHariIni.setText("Tugas Hari Ini");

        TanggalHariIni.setForeground(new java.awt.Color(0, 0, 153));
        TanggalHariIni.setText("DD-MM-YY");

        javax.swing.GroupLayout TugasHariIniLayout = new javax.swing.GroupLayout(TugasHariIni);
        TugasHariIni.setLayout(TugasHariIniLayout);
        TugasHariIniLayout.setHorizontalGroup(
            TugasHariIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TugasHariIniLayout.createSequentialGroup()
                .addGroup(TugasHariIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TugasHariIniLayout.createSequentialGroup()
                        .addGroup(TugasHariIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TugasHariIniLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(HeadTugasHariIni))
                            .addGroup(TugasHariIniLayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(TanggalHariIni)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(TugasHariIniLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        TugasHariIniLayout.setVerticalGroup(
            TugasHariIniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TugasHariIniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeadTugasHariIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TanggalHariIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        StatistikPanelUtama.setBackground(new java.awt.Color(250, 227, 143));

        HeadJudulStatistik.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeadJudulStatistik.setForeground(new java.awt.Color(0, 0, 153));
        HeadJudulStatistik.setText("Statistik Belajar");

        javax.swing.GroupLayout StatistikPanelUtamaLayout = new javax.swing.GroupLayout(StatistikPanelUtama);
        StatistikPanelUtama.setLayout(StatistikPanelUtamaLayout);
        StatistikPanelUtamaLayout.setHorizontalGroup(
            StatistikPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatistikPanelUtamaLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(HeadJudulStatistik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StatistikPanelUtamaLayout.setVerticalGroup(
            StatistikPanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatistikPanelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeadJudulStatistik)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        ReminderPanel.setBackground(new java.awt.Color(250, 227, 143));

        PanelTugas1Remind.setBackground(new java.awt.Color(255, 252, 235));

        TanggalWaktuDeadlineTugasRemind1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        TanggalWaktuDeadlineTugasRemind1.setForeground(new java.awt.Color(0, 0, 102));
        TanggalWaktuDeadlineTugasRemind1.setText("Deadlie Pegumpulan");

        JudulTugasRemind1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        JudulTugasRemind1.setForeground(new java.awt.Color(0, 0, 102));
        JudulTugasRemind1.setText("Judul Tugas");

        javax.swing.GroupLayout PanelTugas1RemindLayout = new javax.swing.GroupLayout(PanelTugas1Remind);
        PanelTugas1Remind.setLayout(PanelTugas1RemindLayout);
        PanelTugas1RemindLayout.setHorizontalGroup(
            PanelTugas1RemindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTugas1RemindLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTugas1RemindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JudulTugasRemind1)
                    .addComponent(TanggalWaktuDeadlineTugasRemind1))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelTugas1RemindLayout.setVerticalGroup(
            PanelTugas1RemindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTugas1RemindLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JudulTugasRemind1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TanggalWaktuDeadlineTugasRemind1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelTugasRemind2.setBackground(new java.awt.Color(255, 252, 235));

        JudulTugasRemind2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        JudulTugasRemind2.setForeground(new java.awt.Color(0, 0, 102));
        JudulTugasRemind2.setText("Judul Tugas");

        TanggalWaktuDeadlineRemind2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        TanggalWaktuDeadlineRemind2.setForeground(new java.awt.Color(0, 0, 102));
        TanggalWaktuDeadlineRemind2.setText("Deadlie Pegumpulan");

        javax.swing.GroupLayout PanelTugasRemind2Layout = new javax.swing.GroupLayout(PanelTugasRemind2);
        PanelTugasRemind2.setLayout(PanelTugasRemind2Layout);
        PanelTugasRemind2Layout.setHorizontalGroup(
            PanelTugasRemind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTugasRemind2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTugasRemind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JudulTugasRemind2)
                    .addComponent(TanggalWaktuDeadlineRemind2))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelTugasRemind2Layout.setVerticalGroup(
            PanelTugasRemind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTugasRemind2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JudulTugasRemind2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TanggalWaktuDeadlineRemind2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        HeadReminder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeadReminder.setForeground(new java.awt.Color(0, 0, 153));
        HeadReminder.setText("Reminder Deadline");

        TanggalStart.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TanggalStart.setForeground(new java.awt.Color(0, 0, 153));
        TanggalStart.setText("DD-MM-YY");

        TanggalEnd.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TanggalEnd.setForeground(new java.awt.Color(0, 0, 153));
        TanggalEnd.setText("DD-MM-YY");

        PenghubungTanggal.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        PenghubungTanggal.setForeground(new java.awt.Color(0, 0, 153));
        PenghubungTanggal.setText("-");

        javax.swing.GroupLayout ReminderPanelLayout = new javax.swing.GroupLayout(ReminderPanel);
        ReminderPanel.setLayout(ReminderPanelLayout);
        ReminderPanelLayout.setHorizontalGroup(
            ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReminderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTugas1Remind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTugasRemind2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReminderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(HeadReminder)
                    .addGroup(ReminderPanelLayout.createSequentialGroup()
                        .addComponent(TanggalStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PenghubungTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TanggalEnd)))
                .addGap(104, 104, 104))
        );
        ReminderPanelLayout.setVerticalGroup(
            ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReminderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeadReminder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TanggalEnd)
                    .addComponent(TanggalStart)
                    .addComponent(PenghubungTanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReminderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTugasRemind2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTugas1Remind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(navbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TugasHariIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReminderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatistikPanelUtama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(PanelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TugasHariIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReminderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatistikPanelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
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

    private void sVGIcon11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sVGIcon11MouseClicked
        if (Session.currentUser == null) {
            JOptionPane.showMessageDialog(this, "Silakan login terlebih dahulu.");
            new Login().setVisible(true);
            this.dispose();
            return;
        }
        new Profile().setVisible(true);
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
            java.util.logging.Logger.getLogger(DashboardsTrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardsTrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardsTrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardsTrial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardsTrial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeadJudulStatistik;
    private javax.swing.JLabel HeadReminder;
    private javax.swing.JLabel HeadTugasHariIni;
    private javax.swing.JLabel JudulTugasRemind1;
    private javax.swing.JLabel JudulTugasRemind2;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PanelAtas;
    private javax.swing.JPanel PanelAtas1;
    private java.awt.Panel PanelTugas1Remind;
    private java.awt.Panel PanelTugasRemind2;
    private javax.swing.JLabel PenghubungTanggal;
    private javax.swing.JPanel ReminderPanel;
    private javax.swing.JPanel StatistikPanelUtama;
    private javax.swing.JLabel TanggalEnd;
    private javax.swing.JLabel TanggalHariIni;
    private javax.swing.JLabel TanggalStart;
    private javax.swing.JLabel TanggalWaktuDeadlineRemind2;
    private javax.swing.JLabel TanggalWaktuDeadlineTugasRemind1;
    private javax.swing.JPanel TugasHariIni;
    private javax.swing.JScrollPane jScrollPane1;
    private Instance.Navbar navbar1;
    private Instance.SVGIcon sVGIcon10;
    private Instance.SVGIcon sVGIcon11;
    // End of variables declaration//GEN-END:variables
}
