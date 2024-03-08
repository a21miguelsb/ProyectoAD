package view;

import controller.EquiposController;
import model.Classes.ButtonEditor;
import model.Classes.ButtonRenderer;
import model.Classes.EquipoTableModel;
import model.Entities.Equipo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class PanelListadoEquipos extends JPanel {

    private JTable equipoTable;
    private DefaultTableModel tableModel;
    private JButton botonInfoEquipo;

    public PanelListadoEquipos() {
        EquiposController equiposController = new EquiposController();
        setLayout(new BorderLayout());
        botonInfoEquipo = new JButton("Más Info");

        List<Equipo> equipos = equiposController.buscarEquipos();
        tableModel = new EquipoTableModel(equipos);
        equipoTable = new JTable(tableModel);

        // Agregar las columnas al modelo
        tableModel.addColumn("Nombre Completo");
        tableModel.addColumn("Ciudad");
        tableModel.addColumn("");

        equipoTable.setDefaultRenderer(JButton.class,new ButtonRenderer());
        equipoTable.setDefaultEditor(JButton.class, new ButtonEditor());
        // Crear un JScrollPane y agregar la tabla al JScrollPane
        JScrollPane scrollPane = new JScrollPane(equipoTable);

        tableModel.setRowCount(0);


        add(scrollPane, BorderLayout.CENTER);

        for (Equipo equipo : equipos) {
            Object[] rowData = {
                    equipo.getNombreCompleto(),
                    equipo.getCiudad(),


            };
            tableModel.addRow(rowData);


        }



        setVisible(true);
    }
}
