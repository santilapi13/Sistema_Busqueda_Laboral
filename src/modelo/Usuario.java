package modelo;

import java.io.Serializable;
import java.util.Observable;

/**
 * @author Grupo 7 <br>
 *         Clase abstracta que alberga las caracterï¿½sticas comunes de un
 *         usuario del sistema, de ella se extienden las clases Admin y Admin.
 *
 */

@SuppressWarnings("serial")
public abstract class Usuario extends Observable implements Serializable {

	private String username;
	private String password;

	/**
	 * Constructor con dos parï¿½metros para crear un usuario, con su respectivo
	 * nombre de usuario y contraseï¿½a.<br>
	 * 
	 * @param username : Parï¿½metro de tipo String, serï¿½ el nombre para logueo
	 *                 del usuario.
	 * @param password : Parï¿½metro de tipo String, serï¿½ la contraseï¿½a de
	 *                 logueo del usuario.
	 *
	 */

	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return username;
	}

	public void notificador(String arg) {

		this.setChanged();
		this.notifyObservers(arg);
	}

}
