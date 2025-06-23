package Tugas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Database.CRUDTugas;
import Database.Session;
import Database.TugasGetSet;

public class DaftarTugas extends JPanel {

    private JLabel JudulTugas;
    private JLabel JudulDeadline;
    private JLabel TanggalDeadline;
    private JLabel Pembatas;
    private JLabel JamDeadline;
    private JLabel TombolEdit;
    private JCheckBox CheckBox;

    private int idTugas;

    public DaftarTugas(int idTugas, String judul, String tanggal, String jam, String status) {
        this.idTugas = idTugas;
        initComponents();

        JudulTugas.setText(judul);
        TanggalDeadline.setText(tanggal);
        JamDeadline.setText(jam);
        CheckBox.setSelected("selesai".equalsIgnoreCase(status));
    }

    private void initComponents() {
        JudulTugas = new JLabel();
        JudulDeadline = new JLabel("Deadline:");
        TanggalDeadline = new JLabel();
        Pembatas = new JLabel("|");
        JamDeadline = new JLabel();
        TombolEdit = new JLabel("Edit");
        CheckBox = new JCheckBox();

        setBackground(new Color(250, 227, 143));
        setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 1, true));

        JudulTugas.setFont(new Font("Segoe UI", Font.BOLD, 14));
        JudulTugas.setForeground(new Color(0, 0, 153));
        JudulDeadline.setForeground(new Color(0, 0, 153));
        TanggalDeadline.setForeground(new Color(0, 0, 153));
        Pembatas.setForeground(new Color(0, 0, 153));
        JamDeadline.setForeground(new Color(0, 0, 153));
        TombolEdit.setFont(new Font("Segoe UI", Font.BOLD, 12));
        TombolEdit.setForeground(new Color(0, 0, 153));
        TombolEdit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        setPreferredSize(new Dimension(350, 77));
        setMaximumSize(new Dimension(350, 77));
        setMinimumSize(new Dimension(350, 77));


        CheckBox.addActionListener(evt -> checkboxAction());
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    
                    TugasGetSet tugas = new TugasGetSet();
                    tugas.setIdTugas(idTugas);

                    Session.currentTugas = tugas;

                    new EditTugas().setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10)
                    .addComponent(CheckBox)
                    .addGap(10)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(JudulTugas)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JudulDeadline)
                            .addGap(4)
                            .addComponent(TanggalDeadline)
                            .addGap(4)
                            .addComponent(Pembatas)
                            .addGap(4)
                            .addComponent(JamDeadline)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TombolEdit)
                    .addGap(15))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(7)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(CheckBox)
                        .addComponent(JudulTugas))
                    .addGap(4)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(JudulDeadline)
                        .addComponent(TanggalDeadline)
                        .addComponent(Pembatas)
                        .addComponent(JamDeadline))
                    .addGap(4)
                    .addComponent(TombolEdit)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void checkboxAction() {
        if (CheckBox.isSelected()) {
            try {
                CRUDTugas.getInstance().tandaiSelesai(idTugas);
                JOptionPane.showMessageDialog(this, "Tugas ditandai selesai!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal menandai selesai: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
