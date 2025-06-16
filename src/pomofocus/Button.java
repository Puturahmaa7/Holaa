package pomofocus;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Button extends JButton {

    public Button() {
        super("Tombol");
        setForeground(new Color(0, 0, 153));         
        setBackground(new Color(250,227,143));       
        setFocusPainted(false);
        setFont(new Font("Segoe UI", Font.BOLD, 16));
    }
}

