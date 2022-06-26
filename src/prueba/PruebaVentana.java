package prueba;

import java.io.IOException;
import java.io.Serializable;

import javax.swing.JOptionPane;

import controlador.ControladorFormulario;
import controlador.ControladorLogin;
import controlador.ControladorUsuario;
import modelo.Agencia;
import persistencia.AgenciaDTO;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;
import persistencia.UtilAgencia;

public class PruebaVentana {

	public static void main(String[] args) {

		try {
			IPersistencia<Serializable> persistencia = new PersistenciaBIN();
			persistencia.abrirInput("Agencia.bin");
            AgenciaDTO adto=(AgenciaDTO) persistencia.leer();
            UtilAgencia.AgenciaDTOToAgencia(adto,Agencia.getInstance());
            persistencia.cerrarInput();

		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        } finally {
        	ControladorLogin login = ControladorLogin.getInstance();
        	ControladorUsuario usuario = ControladorUsuario.getInstance();
        	ControladorFormulario formulario = ControladorFormulario.getInstance();
        }
	}
}