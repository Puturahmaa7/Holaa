package Timer;

import Database.CRUDTimer;
import Database.Session;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Target extends javax.swing.JFrame {

    public Target() {
        initComponents();
        sVGIcon11.setSVGIcon("SVGIcon/NewBack.svg", 50, 50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        JudulTarget = new javax.swing.JTextField();
        WaktuTanggalDeadline = new javax.swing.JLabel();
        WaktuTanggalDeadline1 = new javax.swing.JLabel();
        WaktuTanggalDeadline3 = new javax.swing.JLabel();
        PanelAtas2 = new javax.swing.JPanel();
        JudulTugas1 = new javax.swing.JLabel();
        sVGIcon11 = new Instance.SVGIcon();
        TambahTujuan = new Instance.Button();
        WaktuTujuan = new lu.tudor.santec.jtimechooser.JTimeChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(248, 244, 225));
        MainPanel.setPreferredSize(new java.awt.Dimension(375, 812));

        JudulTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JudulTargetActionPerformed(evt);
            }
        });

        WaktuTanggalDeadline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WaktuTanggalDeadline.setForeground(new java.awt.Color(0, 0, 153));
        WaktuTanggalDeadline.setText("Waktu Tujuan");

        WaktuTanggalDeadline1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WaktuTanggalDeadline1.setForeground(new java.awt.Color(0, 0, 153));
        WaktuTanggalDeadline1.setText("Judul Target");

        WaktuTanggalDeadline3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        WaktuTanggalDeadline3.setForeground(new java.awt.Color(0, 0, 153));

        PanelAtas2.setBackground(new java.awt.Color(255, 174, 57));
        PanelAtas2.setForeground(new java.awt.Color(102, 0, 102));

        JudulTugas1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JudulTugas1.setForeground(new java.awt.Color(0, 0, 153));
        JudulTugas1.setText("Target");

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
                .addGap(76, 76, 76)
                .addComponent(JudulTugas1)
                .addContainerGap(143, Short.MAX_VALUE))
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

        TambahTujuan.setText("Tambah Tujuan");
        TambahTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahTujuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAtas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(WaktuTujuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JudulTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WaktuTanggalDeadline, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WaktuTanggalDeadline1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(WaktuTanggalDeadline3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(TambahTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(PanelAtas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(WaktuTanggalDeadline1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JudulTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(WaktuTanggalDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WaktuTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(WaktuTanggalDeadline3)
                .addGap(52, 52, 52)
                .addComponent(TambahTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
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

    private void JudulTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JudulTargetActionPerformed

    }//GEN-LAST:event_JudulTargetActionPerformed

    private void sVGIcon11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sVGIcon11MouseClicked

    }//GEN-LAST:event_sVGIcon11MouseClicked

    private void TambahTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahTujuanActionPerformed
        String judulTujuan = JudulTarget.getText().trim();

        
        if (judulTujuan.isEmpty() || WaktuTujuan == null) {
            JOptionPane.showMessageDialog(this, "Judul dan durasi wajib diisi.");
            return;
        }
        
        int jam = WaktuTujuan.getHours();
        int menit = WaktuTujuan.getMinutes();
        int detik = 0;
        int totalMenit = (jam * 60) + menit;
        
        if (totalMenit <= 0) {
            JOptionPane.showMessageDialog(this, "Durasi harus lebih dari 0 menit.");
            return;
        }
        try {
        int idLogin = Session.currentUser.getUserID();
        CRUDTimer crud = new CRUDTimer();
        crud.tambahTujuan(idLogin, judulTujuan, totalMenit);

        JOptionPane.showMessageDialog(this, "Tujuan berhasil ditambahkan.");
        JudulTarget.setText("");
        Calendar reset = Calendar.getInstance();
        reset.set(Calendar.HOUR_OF_DAY, 0);
        reset.set(Calendar.MINUTE, 0);
        WaktuTujuan.setTime(reset.getTime());

        new Timer().setVisible(true);
        this.dispose();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }

    }//GEN-LAST:event_TambahTujuanActionPerformed

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
            java.util.logging.Logger.getLogger(Target.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Target.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Target.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Target.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Target().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JudulTarget;
    private javax.swing.JLabel JudulTugas1;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PanelAtas2;
    private Instance.Button TambahTujuan;
    private javax.swing.JLabel WaktuTanggalDeadline;
    private javax.swing.JLabel WaktuTanggalDeadline1;
    private javax.swing.JLabel WaktuTanggalDeadline3;
    private lu.tudor.santec.jtimechooser.JTimeChooser WaktuTujuan;
    private Instance.SVGIcon sVGIcon11;
    // End of variables declaration//GEN-END:variables
}
