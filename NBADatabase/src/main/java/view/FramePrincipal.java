package view;

import javax.swing.*;
import java.awt.*;

public class FramePrincipal extends JFrame {
    FormBusquedaJugador formBusquedaJugador;
    public FramePrincipal() {
        setTitle("NBA Database");
        formBusquedaJugador = new FormBusquedaJugador();


        add(formBusquedaJugador, BorderLayout.NORTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

}
