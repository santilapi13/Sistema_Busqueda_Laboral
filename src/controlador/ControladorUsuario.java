package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import excepciones.UsuariosInsuficientesException;
import modelo.Agencia;
import modelo.Contrato;
import modelo.Empleado;
import modelo.Empleador;
import vista.IVistaUsuario;
import vista.VFormulario;

public class ControladorUsuario implements ActionListener {
	private IVistaUsuario vista = null;

	public ControladorUsuario(IVistaUsuario vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		try {
			String comando = a.getActionCommand();
			if (comando.equalsIgnoreCase("EMPLEADOS")) {
				this.vista.actualizarListaEmpleados(Agencia.getInstance().getEmpleados());

			} else if (comando.equalsIgnoreCase("EMPLEADORES")) {
				this.vista.actualizarListaEmpleadores(Agencia.getInstance().getEmpleadores());

			} else if (comando.equalsIgnoreCase("SOLICITUDES DE EMPLEO")) {
				this.vista.actualizarSoliEmpleo(Agencia.getInstance().getEmpleados());
				
			} else if (comando.equalsIgnoreCase("SOLICITUDES DE EMPLEADO")) {
				this.vista.actualizarSoliEmpleados(Agencia.getInstance().getEmpleadores());
				
			} else if (comando.equalsIgnoreCase("COMISIONES")) {
				for (Empleador empleadorAct : Agencia.getInstance().getEmpleadores())
					this.vista.informar("Username: " + empleadorAct.getUsername() + " debe pagar "
							+ empleadorAct.getComisionAPagar());
				for (Empleado empleadoAct : Agencia.getInstance().getEmpleados())
					this.vista.informar("Username: " + empleadoAct.getUsername() + " debe pagar "
							+ empleadoAct.getComisionAPagar());
				
			} else if (comando.equalsIgnoreCase("INICIAR RONDA DE ENCUENTROS")) {
				Agencia.getInstance().iniciaRondaEncuentros();
				this.vista.informar("Ronda de encuentros finalizada");

			} else if (comando.equalsIgnoreCase("INICIAR RONDA DE CONTRATACION")) {
				this.vista.informar("Recopilando elecciones de empleados y empleadores");
				Agencia.getInstance().iniciaRondaElecciones();
				this.vista.informar("Iniciando ronda de contrataciones");
				Agencia.getInstance().iniciaRondaContrataciones();

				// mostrar los contratos
				for (Contrato contratoAct : Agencia.getInstance().getContratos())
					this.vista.informar(contratoAct.toString());

				this.vista.informar("Ronda de contrataciones finalizada");

			} else if (comando.equalsIgnoreCase("SALIR")) {
				this.vista.cerrarse();
				new ControladorLogin();
				
			} else if (comando.equalsIgnoreCase("BUSCAR EMPLEO")) {
				ControladorFormulario controlador = new ControladorFormulario(new VFormulario());

			} else if (comando.equalsIgnoreCase("GESTIONAR")) {
				Empleado empleado = getEmpleado(this.vista.getUsername());
				if (empleado != null)
					this.vista.actualizarTicket(empleado.getTicket());

			} else if (comando.equalsIgnoreCase("LISTA DE EMPLEADORES")) {
				Empleado empleado = getEmpleado(this.vista.getUsername());
				if (empleado != null)
					this.vista.actualizarListaAsignacion(empleado.getListaAsignacion());
				
			} else if (comando.equalsIgnoreCase("RESULTADO")) {

			} else if (comando.equalsIgnoreCase("MODIFICAR")) {
				
			} else if (comando.equalsIgnoreCase("SUSPENDER")) {
				this.vista.getTicketSeleccionado().suspenderse();
			} else if (comando.equalsIgnoreCase("CANCELAR")) {
				this.vista.getTicketSeleccionado().cancelarse();
			}

		} catch (UsuariosInsuficientesException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private Empleado getEmpleado(String username) {
		ArrayList<Empleado> empleados = Agencia.getInstance().getEmpleados();
		int i = 0;
		Empleado empleado = null;
		while (i < empleados.size() && !empleados.get(i).getUsername().equalsIgnoreCase(username))
			i++;
		if (i < empleados.size())
			empleado = empleados.get(i);
		return empleado;
	}

}
