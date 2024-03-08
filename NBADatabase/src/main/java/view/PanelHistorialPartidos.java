package view;

import javax.swing.*;

public class PanelHistorialPartidos extends JPanel {
    public PanelHistorialPartidos(long idEquipo) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Historial de partidos");
        add(label);

    }
}
