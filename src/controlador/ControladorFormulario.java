package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.IVistaFormulario;

public class ControladorFormulario implements ActionListener{
	private IVistaFormulario vista = null;

	public ControladorFormulario(IVistaFormulario vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
