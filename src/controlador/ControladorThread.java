package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Agencia;
import modelo.Empleado;
import modelo.Empleador;
import vista.VSimulacion;

public class ControladorThread implements ActionListener {

	private VSimulacion vista = null;

	public ControladorThread() {
		this.vista = new VSimulacion();
		this.vista.setActionListener(this);
		vista.setVisible(true);

	}

	public void actionPerformed(ActionEvent ev) {
		String comando = ev.getActionCommand();

		if (comando.equalsIgnoreCase("Iniciar")) {
			this.vista.setEnabledFalse();

			for (int i = 0; i < Agencia.getInstance().getEmpleados().size(); i++) {
				Empleado e = Agencia.getInstance().getEmpleados().get(i);
				Thread h = new Thread(e);
				h.start();
				vista.agregoListaEmpleado(e);
			}

			for (int i = 0; i < Agencia.getInstance().getEmpleadores().size(); i++) {
				Empleador er = Agencia.getInstance().getEmpleadores().get(i);
				Thread h = new Thread(er);
				h.start();
				vista.agregoListaEmpleadores(er);
			}
		}

	}
}
