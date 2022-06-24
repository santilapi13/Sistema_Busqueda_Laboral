package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.IVistaUsuario;

public class ControladorUsuario implements ActionListener {
	private IVistaUsuario vista = null;

	public ControladorUsuario(IVistaUsuario vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
