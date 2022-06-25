package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VFormulario;

public class ControladorFormulario implements ActionListener {
	private VFormulario vista = null;

	public ControladorFormulario(VFormulario vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
