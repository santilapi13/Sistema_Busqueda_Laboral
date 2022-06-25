package vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Empleado;
import modelo.Empleador;
import modelo.ListaAsignacion;
import modelo.TicketEmpleo;

public interface IVistaUsuario {
	void setActionListener(ActionListener actionListener);

	void cerrarse();

	void actualizarListaEmpleados(ArrayList<Empleado> empleados);

	void actualizarListaEmpleadores(ArrayList<Empleador> empleadores);

	void actualizarListaAsignacion(ListaAsignacion listaAsignacion);

	void informar(String s);

	void actualizarSoliEmpleo(ArrayList<Empleado> empleados);

	void actualizarSoliEmpleados(ArrayList<Empleador> empleadores);

	void actualizarTicket(TicketEmpleo ticket);

	String getUsername();

}
