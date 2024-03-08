package view;

import javax.swing.*;

public class FramePrincipal extends JFrame {
    PanelBotonesFunciones panelBotones;
    public FramePrincipal() {
        setTitle("NBA App");
        panelBotones = new PanelBotonesFunciones();


        add(panelBotones);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setResizable(false);
        setVisible(true);
    }

}
