package modelo;

import java.util.ArrayList;

import excepciones.UsuariosInsuficientesException;

/** 
* @author Grupo 7
 * <br> 
* Clase que sirve para representar a los usuarios que tienen mas acceso a los metodos del sistema. <br>
 * Todos sus metodos delegan la funcionalidad a la agencia.
*/
@SuppressWarnings("serial")
public class Admin extends Usuario {

	public Admin(String username, String password) {
		super(username, password);
	}

	public void iniciaRondaEncuentros() throws UsuariosInsuficientesException {
		Agencia.getInstance().iniciaRondaEncuentros();
	}
	
	public void iniciaRondaElecciones() {
		Agencia.getInstance().iniciaRondaElecciones();
	}
	
	public void iniciaRondaContrataciones() {
		Agencia.getInstance().iniciaRondaContrataciones();
	}
	
	public ArrayList<Contrato> getContratos() {
		return Agencia.getInstance().getContratos();
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return Agencia.getInstance().getEmpleados();
	}
	
	public ArrayList<Empleador> getEmpleadores() {
		return Agencia.getInstance().getEmpleadores();
	}
}
