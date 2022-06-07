package modelo;

import java.io.Serializable;

/**
 * @author Grupo 7
 * <br>
 *Clase abstracta que alberga las caracter�sticas comunes de un usuario del sistema, de ella se extienden 
 *las clases Admin y Admin.
 *
 */



@SuppressWarnings("serial")
public abstract class Usuario implements Serializable {

	private String username;
	private String password;

	/**
	*Constructor con dos par�metros para crear un usuario, con su respectivo nombre de usuario y contrase�a.<br>
	*@param username : Par�metro de tipo String, ser� el nombre para logueo del usuario.
	*@param password : Par�metro de tipo String, ser� la contrase�a de logueo del usuario.
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
	
	
}
