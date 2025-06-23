package DataPengguna;

import DataPengguna.UbahPassword;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import Database.CRUDUserInfo;

public class Verifikasi extends javax.swing.JFrame {

    private String email;

    public Verifikasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        kodeVerifikasi = new javax.swing.JPasswordField();
        PanelAtas = new javax.swing.JPanel();
        sVGIcon1 = new pomofocus.SVGIcon();
        JudulTugas3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        button2 = new pomofocus.Button();
        emailVerifikasi = new javax.swing.JTextField();
        JudulTugas5 = new javax.swing.JLabel();
        JudulTugas6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(248, 244, 225));
        MainPanel.setPreferredSize(new java.awt.Dimension(375, 812));

        kodeVerifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeVerifikasiActionPerformed(evt);
            }
        });

        PanelAtas.setBackground(new java.awt.Color(255, 174, 57));
        PanelAtas.setForeground(new java.awt.Color(102, 0, 102));

        sVGIcon1.setText("sVGIcon1");

        javax.swing.GroupLayout PanelAtasLayout = new javax.swing.GroupLayout(PanelAtas);
        PanelAtas.setLayout(PanelAtasLayout);
        PanelAtasLayout.setHorizontalGroup(
            PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtasLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(sVGIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        PanelAtasLayout.setVerticalGroup(
            PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtasLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(sVGIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JudulTugas3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JudulTugas3.setForeground(new java.awt.Color(0, 0, 153));
        JudulTugas3.setText("Kode Verifikasi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("VERIFIKASI");

        jPanel1.setBackground(new java.awt.Color(255, 174, 57));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        button2.setText("Verifikasi");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        emailVerifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailVerifikasiActionPerformed(evt);
            }
        });

        JudulTugas5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JudulTugas5.setForeground(new java.awt.Color(0, 0, 153));
        JudulTugas5.setText("Email");

        JudulTugas6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JudulTugas6.setForeground(new java.awt.Color(255, 174, 57));
        JudulTugas6.setText("Kirim kode ke email");
        JudulTugas6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JudulTugas6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JudulTugas6)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kodeVerifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JudulTugas3)
                                .addComponent(emailVerifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JudulTugas5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(PanelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JudulTugas5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailVerifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JudulTugas6)
                .addGap(18, 18, 18)
                .addComponent(JudulTugas3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(kodeVerifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeVerifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeVerifikasiActionPerformed

    }//GEN-LAST:event_kodeVerifikasiActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        String kodeVerifikasiUser = new String(kodeVerifikasi.getPassword());

        if (kodeVerifikasiUser.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan kode verifikasi.");
            return;
        }

        try {
            CRUDUserInfo crud = CRUDUserInfo.getInstance();
            if (crud.verifytCode(email, kodeVerifikasiUser)) {
                JOptionPane.showMessageDialog(this, "Kode verifikasi valid. Silakan buat password baru.");
                    UbahPassword ubahPanel = new UbahPassword();
                    ubahPanel.setVerifiedEmail(email);
                    ubahPanel.setVisible(true);
                    this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Kode verifikasi salah. Coba cek kembali email Anda.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void emailVerifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailVerifikasiActionPerformed

    }//GEN-LAST:event_emailVerifikasiActionPerformed

    private void JudulTugas6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JudulTugas6MouseClicked
        String email = emailVerifikasi.getText().trim();

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email wajib diisi.");
            return;
        }

        try {
            CRUDUserInfo crud = CRUDUserInfo.getInstance();
            if (crud == null) {
                JOptionPane.showMessageDialog(this, "Koneksi database gagal.");
                return;
            }

            if (!crud.checkEmailExist(email)) {
                JOptionPane.showMessageDialog(this, "Email tidak terdaftar.");
                return;
            }

            boolean kode = crud.sendResetCodeToEmail(email);
            JOptionPane.showMessageDialog(this, "Kode verifikasi telah dikirim ke email Anda.");

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mengirim kode.");
        }
        
        emailVerifikasi.setEditable(false);  
        this.email = email;
    }//GEN-LAST:event_JudulTugas6MouseClicked

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
            java.util.logging.Logger.getLogger(Verifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verifikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verifikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JudulTugas3;
    private javax.swing.JLabel JudulTugas5;
    private javax.swing.JLabel JudulTugas6;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PanelAtas;
    private pomofocus.Button button2;
    private javax.swing.JTextField emailVerifikasi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField kodeVerifikasi;
    private pomofocus.SVGIcon sVGIcon1;
    // End of variables declaration//GEN-END:variables
}
