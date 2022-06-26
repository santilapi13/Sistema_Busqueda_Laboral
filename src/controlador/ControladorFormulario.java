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
	private static ControladorFormulario instance = null;

	private ControladorFormulario() {
		
	}
	
	public static ControladorFormulario getInstance() {
		if (instance == null)
			instance = new ControladorFormulario();
		return instance;
	}

	public void setVista(VFormulario vista) {
		this.vista = vista;
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
					empleado.creaFormulario(locacion, remuneracion, cargaH, puesto, experiencia, estudios, pesos);

				} else if (tipo.equalsIgnoreCase("EMPLEADOR")) {
					Empleador empleador = (Empleador) Agencia.getInstance().getUsuarioLogueado();
					String rangoEtario = this.vista.getRangoEtario();
					int cant = this.vista.getTextCant();
					empleador.creaFormulario(locacion, remuneracion, cargaH, puesto, rangoEtario, experiencia, estudios, pesos, cant);
				}
				this.vista.cerrarse();
			}
		} catch (PesoInvalidoException exc) {
			JOptionPane.showMessageDialog(null, exc.getMessage());
		}
	}

}
