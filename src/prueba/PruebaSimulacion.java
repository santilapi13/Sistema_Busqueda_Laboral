package prueba;

import java.io.IOException;
import java.io.Serializable;

import javax.swing.JOptionPane;

import controlador.ControladorLogin;
import controlador.ControladorThread;
import excepciones.PesoInvalidoException;
import excepciones.UsuarioRepetidoException;
import modelo.Admin;
import modelo.Agencia;
import modelo.Empleado;
import modelo.Empleador;
import modelo.Peso;
import persistencia.AgenciaDTO;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;
import persistencia.UtilAgencia;

public class PruebaSimulacion {

	public static void main(String[] args) {
		
		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		Agencia agencia = Agencia.getInstance();
		try {
			persistencia.abrirInput("Agencia.bin");
			AgenciaDTO adto = (AgenciaDTO) persistencia.leer();
			UtilAgencia.AgenciaDTOToAgencia(adto, agencia);
			persistencia.cerrarInput();

			ControladorThread Simulacion = new ControladorThread();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
}
