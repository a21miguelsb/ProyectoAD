package view;

import controller.EquiposController;
import model.Entities.Equipo;

import javax.swing.*;
import java.util.List;

public class PanelBotonesFunciones extends JPanel {
    private JButton botonBuscarJugador;
    private JButton botonListadoEquipos;
    private EquiposController equiposController;
    private PanelListadoEquipos frameListadoEquipos;
    private PanelBusquedaJugador panelBusquedaJugador;


    public PanelBotonesFunciones() {
        botonBuscarJugador = new JButton("Buscar Jugador");
        botonListadoEquipos = new JButton("Listado Equipos");

        add(botonBuscarJugador);
        add(botonListadoEquipos);

        botonListadoEquipos.addActionListener(e -> {

            if (frameListadoEquipos != null) {
                remove(frameListadoEquipos);
                revalidate();
            }
            if (panelBusquedaJugador != null) {
                remove(panelBusquedaJugador);
                revalidate();
            }
            equiposController = new EquiposController();
            List<Equipo> equipos = equiposController.buscarEquipos();


            frameListadoEquipos = new PanelListadoEquipos(equipos);
            add(frameListadoEquipos);
            revalidate();
        });

        botonBuscarJugador.addActionListener(e -> {
            if (frameListadoEquipos != null) {
                remove(frameListadoEquipos);
                revalidate();
            }
            if (panelBusquedaJugador != null) {
                remove(panelBusquedaJugador);
                revalidate();
            }
            panelBusquedaJugador = new PanelBusquedaJugador();
            add(panelBusquedaJugador);
            revalidate();
        });




    }
}
