package pomofocus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Navbar extends JPanel {
    private SVGIcon sVGIcon1, sVGIcon2, sVGIcon3, sVGIcon4;

    public Navbar() {
        initComponents();
        setPreferredSize(new Dimension(375, 80));
        setMaximumSize(new Dimension(Short.MAX_VALUE, 80));

        sVGIcon1.setSVGIcon("SVGIcon/NewBeranda.svg", 50, 50);
        sVGIcon2.setSVGIcon("SVGIcon/NewTugas.svg", 50, 50);
        sVGIcon3.setSVGIcon("SVGIcon/NewTimer.svg", 50, 50);
        sVGIcon4.setSVGIcon("SVGIcon/NewStatistik.svg", 50, 50);

        sVGIcon1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                new Dashboard().setVisible(true);
                SwingUtilities.getWindowAncestor(Navbar.this).dispose();
            }
        });

        sVGIcon2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                new Tugas().setVisible(true);
                SwingUtilities.getWindowAncestor(Navbar.this).dispose();
            }
        });

        sVGIcon3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                new Timer().setVisible(true);
                SwingUtilities.getWindowAncestor(Navbar.this).dispose();
            }
        });

        sVGIcon4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                new Statistik().setVisible(true);
                SwingUtilities.getWindowAncestor(Navbar.this).dispose();
            }
        });
    }

    private void initComponents() {
        sVGIcon1 = new SVGIcon();
        sVGIcon2 = new SVGIcon();
        sVGIcon3 = new SVGIcon();
        sVGIcon4 = new SVGIcon();

        setBackground(new Color(255, 174, 57));

        GroupLayout layout = new GroupLayout(this);
this.setLayout(layout);

layout.setHorizontalGroup(
    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
        .addGap(30)
        .addComponent(sVGIcon1, 50, 50, 50)
        .addGap(40)
        .addComponent(sVGIcon2, 50, 50, 50)
        .addGap(40)
        .addComponent(sVGIcon3, 50, 50, 50)
        .addGap(40)
        .addComponent(sVGIcon4, 50, 50, 50)
        .addGap(30))
);

layout.setVerticalGroup(
    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
        .addGap(15)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(sVGIcon1, 50, 50, 50)
            .addComponent(sVGIcon2, 50, 50, 50)
            .addComponent(sVGIcon3, 50, 50, 50)
            .addComponent(sVGIcon4, 50, 50, 50))
        .addGap(15))
);
    }
}
