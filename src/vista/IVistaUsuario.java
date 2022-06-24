package vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Empleado;
import modelo.Empleador;

public interface IVistaUsuario {
	void setActionListener(ActionListener actionListener);

	void cerrarse();

	void actualizarListaEmpleados(ArrayList<Empleado> empleados);
	
	void actualizarListaEmpleadores(ArrayList<Empleador> empleadores);
	
	void informar(String s);

}
