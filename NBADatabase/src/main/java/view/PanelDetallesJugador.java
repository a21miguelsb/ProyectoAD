package view;

import model.Classes.Draft;
import model.Dtos.JugadorDetallesDto;
import model.Dtos.JugadorDto;

import javax.swing.*;
import java.awt.*;

public class PanelDetallesJugador extends JPanel {
    private JLabel nombreJugador;
    private JPanel panelDatosJugador;
    private JPanel panelDraftJugador;


    public PanelDetallesJugador(JugadorDto jugadorDto) {
        setLayout(new GridLayout(3,1));
        JugadorDetallesDto jugadorDetallesDto = new JugadorDetallesDto(jugadorDto.getNombreEquipo(), jugadorDto.getPosicion(), jugadorDto.getAltura(), jugadorDto.getPeso(), jugadorDto.getProcedencia());
        panelDatosJugador = new PanelInfoJugador(jugadorDetallesDto);
        panelDraftJugador = new PanelInfoDraft(new Draft(jugadorDto.getFechaDraft(), jugadorDto.getRondaDraft(), jugadorDto.getNumeroDraft()));

        nombreJugador = new JLabel(jugadorDto.getNombreCompleto());
        nombreJugador.setFont(new Font("Arial", Font.BOLD, 20));
        addGB(nombreJugador, 0, 0);
        addGB(panelDatosJugador, 0, 1);
        addGB(panelDraftJugador, 0, 2);

        setBounds(20, 20, 400, 400);

    }
    public void addGB(Component component, int x, int y) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.fill = GridBagConstraints.BOTH;
        add(component, gbc);
    }

}
