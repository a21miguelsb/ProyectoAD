package model.Classes;

import model.Entities.Equipo;
import view.FrameEquipo;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEditor extends AbstractCellEditor implements
        TableCellEditor {
    private JButton botonInfo;
    private FrameEquipo frameEquipo;

    public ButtonEditor() {
// inicializar o JComboBox cos valores da clase EmploymentCategory
        botonInfo = new JButton("Más Info");

    }
    @Override
    public Object getCellEditorValue() {
        return botonInfo;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
// value é o valor actual da cela a ser renderizada

        botonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frameEquipo != null) {
                    frameEquipo.dispose();


                }
                frameEquipo = new FrameEquipo(table.getValueAt(row, 0).toString());

            }
        });
        return botonInfo;
    }
}
