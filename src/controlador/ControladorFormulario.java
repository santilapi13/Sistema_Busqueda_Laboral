package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import excepciones.PesoInvalidoException;
import modelo.Agencia;
import modelo.Empleado;
import modelo.Empleador;
import modelo.Peso;
import vista.VFormulario;

public class ControladorFormulario implements ActionListener {
	private VFormulario vista = null;

	public ControladorFormulario() {
		this.vista = new VFormulario();
		this.vista.setActionListener(this);
		if (Agencia.getInstance().getTipoUsuarioLogueado().equalsIgnoreCase("EMPLEADOR"))
			this.vista.isEmpleador();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();
		String locacion = this.vista.getLocacion();
		String remuneracion = this.vista.getRemuneracion();
		String cargaH = this.vista.getCargaHoraria();
		String puesto = this.vista.getPuestoLaboral();
		String experiencia = this.vista.getExperienciaPrevia();
		String estudios = this.vista.getEstudios();
		String tipo = Agencia.getInstance().getTipoUsuarioLogueado();
		try {
			Peso pesos = new Peso(vista.getTextPLocacion(), vista.getTextPRemuneracion(), vista.getTextPCargaH(),
					vista.getTextPPuesto(), vista.getTextPRangoE(), vista.getTextPExperiencia(),
					vista.getTextPEstudios());

			if (comando.equalsIgnoreCase("ENVIAR")) {

				if (tipo.equalsIgnoreCase("EMPLEADO")) {

					Empleado empleado = (Empleado) Agencia.getInstance().getUsuarioLogueado();
					empleado.creaFormulario(locacion, remuneracion, cargaH, puesto, tipo, estudios, pesos);

				} else if (tipo.equalsIgnoreCase("EMPLEADOR")) {
					Empleador empleador = (Empleador) Agencia.getInstance().getUsuarioLogueado();
					int cant = this.vista.getTextCant();
					if (cant > 1) {
						empleador.creaFormulario(locacion, remuneracion, cargaH, puesto, experiencia, tipo, estudios,
								pesos, cant);
					} else {
						empleador.creaFormulario(locacion, remuneracion, cargaH, puesto, experiencia, tipo, estudios,
								pesos);
					}
				}
				this.vista.cerrarse();

			} else if (comando.equalsIgnoreCase("MODIFICAR")) {
				if (tipo.equalsIgnoreCase("EMPLEADO")) {
					Empleado empleado = (Empleado) Agencia.getInstance().getUsuarioLogueado();
					empleado.getTicket().modificar(locacion, remuneracion, cargaH, puesto, experiencia, tipo, estudios, pesos);
				} else {
					Empleador empleador = (Empleador) Agencia.getInstance().getUsuarioLogueado();
					int cant = this.vista.getTextCant();
					
				}
			}
		} catch (PesoInvalidoException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage());
		}

	}

}
