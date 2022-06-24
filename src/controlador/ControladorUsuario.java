package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import excepciones.UsuariosInsuficientesException;
import modelo.Agencia;
import modelo.Contrato;
import vista.IVistaUsuario;

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

			} else if (comando.equalsIgnoreCase("SOLICITUDES DE EMPLEADO")) {

			} else if (comando.equalsIgnoreCase("COMISIONES")) {

			} else if (comando.equalsIgnoreCase("INICIAR RONDA DE ENCUENTROS")) {
				Agencia.getInstance().iniciaRondaEncuentros();
				this.vista.informar("Ronda de encuentros finalizada");

			} else if (comando.equalsIgnoreCase("INICIAR RONDA DE CONTRATACION")) {
				this.vista.informar("Recopilando elecciones de empleados y empleadores");
				Agencia.getInstance().iniciaRondaElecciones();
				this.vista.informar("Iniciando ronda de contrataciones");
				Agencia.getInstance().iniciaRondaContrataciones();

				/*//mostrar los contratos
				for (Contrato contratoAct : Agencia.getInstance().getContratos())
					this.vista.informar(contratoAct.toString());
				*/
				this.vista.informar("Ronda de contrataciones finalizada");

			} else

			if (comando.equalsIgnoreCase("SALIR")) {

			}
		} catch (UsuariosInsuficientesException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
