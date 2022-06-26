package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import excepciones.UsuariosInsuficientesException;
import modelo.Agencia;
import modelo.Contrato;
import modelo.Empleado;
import modelo.Empleador;
import modelo.NoAdmin;
import modelo.TicketEmpleado;
import persistencia.AgenciaDTO;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;
import persistencia.UtilAgencia;
import vista.IVistaUsuario;
import vista.VFormulario;
import vista.VLogin;

public class ControladorUsuario implements ActionListener, Observer {
	private IVistaUsuario vista = null;
	private static ControladorUsuario instance = null;
	ControladorFormulario controladorFormulario = null;

	private ControladorUsuario() {
	}

	public static ControladorUsuario getInstance() {
		if (instance == null)
			instance = new ControladorUsuario();
		return instance;
	}

	public void setVista(IVistaUsuario vista) {
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

			} else if (comando.equalsIgnoreCase("CONTRATOS")) {
				if (Agencia.getInstance().getContratos().size() == 0)
					this.vista.informar("No se consumo ningun contrato.");
				else {
					for (Contrato contratoAct : Agencia.getInstance().getContratos())
						this.vista.informar(contratoAct.toString());
				}
			} else if (comando.equalsIgnoreCase("INICIAR RONDA DE CONTRATACION")) {
				this.vista.informar("Recopilando elecciones de empleados y empleadores");
				Agencia.getInstance().iniciaRondaElecciones();
				this.vista.informar("Iniciando ronda de contrataciones");
				Agencia.getInstance().iniciaRondaContrataciones();

				this.vista.informar("Ronda de contrataciones finalizada");

			} else if (comando.equalsIgnoreCase("SALIR")) {
				this.vista.cerrarse();
				ControladorLogin.getInstance().setVista(new VLogin());
				IPersistencia<Serializable> persistencia = new PersistenciaBIN();

				persistencia.abrirOutput("Agencia.bin");
				AgenciaDTO aDTO = UtilAgencia.AgenciaToAgenciaDTO(Agencia.getInstance());
				persistencia.escribir(aDTO);
				persistencia.cerrarOutput();

			} else if (comando.equalsIgnoreCase("BUSCAR"))
				ControladorFormulario.getInstance().setVista(new VFormulario());

			else if (comando.equalsIgnoreCase("GESTIONAR")) {

				String tipo = Agencia.getInstance().getTipoUsuarioLogueado();
				if (tipo.equalsIgnoreCase("EMPLEADO")) {
					Empleado empleado = (Empleado) Agencia.getInstance().getUsuarioLogueado();
					if (empleado != null)
						this.vista.actualizarTicket(empleado.getTicket());
				} else {
					Empleador empleador = (Empleador) Agencia.getInstance().getUsuarioLogueado();
					if (empleador != null)
						this.vista.actualizarSoliEmpleados(Agencia.getInstance().getEmpleadores());
				}

			} else if (comando.equalsIgnoreCase("LISTA ASIGNACION")) {

				NoAdmin noAdmin = (NoAdmin) Agencia.getInstance().getUsuarioLogueado();
				if (noAdmin != null)
					this.vista.actualizarListaAsignacion(noAdmin.getListaAsignacion());

			} else if (comando.equalsIgnoreCase("RESULTADO")) {

			} else if (comando.equalsIgnoreCase("MODIFICAR")) {
				String tipo = Agencia.getInstance().getTipoUsuarioLogueado();
				if (tipo.equalsIgnoreCase("EMPLEADO")) {
					ControladorFormulario.getInstance().setVista(new VFormulario());
				} else {
					Empleador empleador = (Empleador) Agencia.getInstance().getUsuarioLogueado();
					empleador.getTickets().remove((int) a.getSource());
					ControladorFormulario.getInstance().setVista(new VFormulario());
				}
			} else if (comando.equalsIgnoreCase("SUSPENDER")) {
				this.vista.getTicketSeleccionado().suspenderse();

			} else if (comando.equalsIgnoreCase("CANCELAR")) {
				this.vista.getTicketSeleccionado().cancelarse();

			} else if (comando.equalsIgnoreCase("ELEGIR")) {
				String tipo = Agencia.getInstance().getTipoUsuarioLogueado();
				if (tipo.equalsIgnoreCase("EMPLEADO")) {
					Empleado empleado = (Empleado) Agencia.getInstance().getUsuarioLogueado();
					System.out.println();
					empleado.setTicketElegido((TicketEmpleado) this.vista.getTicketSeleccionado());
				} else {
					Empleador empleador = (Empleador) Agencia.getInstance().getUsuarioLogueado();
					TicketEmpleado ticketElegido = (TicketEmpleado) this.vista.getTicketSeleccionado();
					Empleado empleadoElegido = (Empleado) this.vista.getElemLASeleccionado().getUsuario();
					System.out.println(empleadoElegido + " elegido para " + ticketElegido);
					empleador.eligeEmpleado(empleadoElegido, ticketElegido);
				}
			}

		} catch (UsuariosInsuficientesException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}
