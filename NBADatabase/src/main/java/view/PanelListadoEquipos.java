package view;

import model.Entities.Equipo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class PanelListadoEquipos extends JPanel {

    private JTable equipoTable;
    private DefaultTableModel tableModel;

    public PanelListadoEquipos(List<Equipo> equipos) {

        tableModel = new DefaultTableModel();
        equipoTable = new JTable(tableModel);

        // Agregar las columnas al modelo
        tableModel.addColumn("Nombre Completo");
        tableModel.addColumn("Abreviatura");
        tableModel.addColumn("Ciudad");
        tableModel.addColumn("Conferencia");
        tableModel.addColumn("División");

        // Crear un JScrollPane y agregar la tabla al JScrollPane
        JScrollPane scrollPane = new JScrollPane(equipoTable);

        tableModel.setRowCount(0);
        add(scrollPane);

        for (Equipo equipo : equipos) {
            Object[] rowData = {
                    equipo.getNombreCompleto(),
                    equipo.getAbreviatura(),
                    equipo.getCiudad(),
                    equipo.getConferencia(),
                    equipo.getDivision(),
            };
            tableModel.addRow(rowData);
        }
        setVisible(true);
    }
}
