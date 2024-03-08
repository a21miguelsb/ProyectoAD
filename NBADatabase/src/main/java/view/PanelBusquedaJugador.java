package view;

import controller.JugadoresController;
import model.EMF;
import model.Dtos.JugadorDto;

import javax.swing.*;
import java.awt.*;

public class PanelBusquedaJugador extends JPanel {
    private JPanel panelBusqueda;
    private JTextField buscadorNombre;
    private JButton botonBusqueda;
    PanelDetallesJugador panelInfoJugador;
    public PanelBusquedaJugador() {
        setLayout(new FlowLayout());
        panelBusqueda = new JPanel();
        buscadorNombre = new JTextField(20);
        botonBusqueda = new JButton("Buscar");

        panelBusqueda.add(buscadorNombre);
        panelBusqueda.add(botonBusqueda);
        add(panelBusqueda);


        botonBusqueda.addActionListener(e -> {
            String nombre = buscadorNombre.getText();
            JugadoresController jugadoresController = new JugadoresController(EMF.get().createEntityManager());
            JugadorDto jugadorDto= jugadoresController.buscarJugadorporNombre(nombre);

            if(panelInfoJugador != null){
                remove(panelInfoJugador);
            }
            panelInfoJugador = new PanelDetallesJugador(jugadorDto);


            System.out.println(jugadorDto.getNombreCompleto());
            add(panelInfoJugador);
            panelInfoJugador.setVisible(true);
            revalidate();

        });



    }
}
