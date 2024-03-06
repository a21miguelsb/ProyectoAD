package view;

import model.JugadorDto;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class PanelInfoJugador extends JPanel {

    private JLabel nombreJugador;
    private JLabel equipoJugador;
    private JLabel posicionJugador;
    private JLabel alturaJugador;
    private JLabel pesoJugador;
    private JLabel numeroJugador;
    private JLabel fechaDraftJugador;
    private JLabel procedenciaJugador;



    public PanelInfoJugador(JugadorDto jugadorDto) {

        setLayout(new GridLayout(8,1));
        nombreJugador = new JLabel("Nombre: "+jugadorDto.getNombreCompleto());
        equipoJugador = new JLabel("Equipo: "+jugadorDto.getNombreEquipo());
        posicionJugador = new JLabel("Posicion: "+jugadorDto.getPosicion());
        alturaJugador = new JLabel("Altura: "+jugadorDto.getAltura());
        pesoJugador = new JLabel("Peso: "+jugadorDto.getPeso());
        numeroJugador = new JLabel("Numero: "+jugadorDto.getNumero());
        fechaDraftJugador = new JLabel("Fecha Draft: "+jugadorDto.getFechaDraft());
        procedenciaJugador = new JLabel("Pais procedencia: "+jugadorDto.getProcedencia());

        setBounds(20, 20, 400, 400);
        addGB(nombreJugador, 0, 0);
        addGB(equipoJugador, 0, 1);
        addGB(posicionJugador, 0, 2);
        addGB(alturaJugador, 0, 3);
        addGB(pesoJugador, 0, 4);
        addGB(numeroJugador, 0, 5);
        addGB(fechaDraftJugador, 0, 6);
        addGB(procedenciaJugador, 0, 7);


    }

    public void addGB(Component component, int x, int y) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(component, gbc);
    }
}
