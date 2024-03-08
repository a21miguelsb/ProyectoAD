package view;

import controller.EquiposController;
import model.Dtos.EquipoInfoDto;

import javax.swing.*;
import java.awt.*;

public class FrameEquipo extends JFrame {
    private EquiposController equiposController;
    private PanelDatosEquipo panelInfoEquipo;
    private PanelHistorialPartidos tablaHistorialPartidos;

    public FrameEquipo(String nombreEquipo) {
        super();
        setTitle("Información");
        equiposController = new EquiposController();
        EquipoInfoDto equipo = equiposController.buscarEquipoPorNombre(nombreEquipo);
        panelInfoEquipo = new PanelDatosEquipo(equipo);
        tablaHistorialPartidos = new PanelHistorialPartidos(equipo.getIdEquipo());

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.add(panelInfoEquipo);
        scrollPane.add(tablaHistorialPartidos);







        setPreferredSize(new Dimension(400, 400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();

        setResizable(false);
        setVisible(true);
    }

}
