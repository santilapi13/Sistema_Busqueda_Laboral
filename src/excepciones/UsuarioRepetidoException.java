package excepciones;

@SuppressWarnings("serial")

/**
*Excepcion que indica que el nombre de usuario a crear ya esta en uso y no se puede repetir.<br>
*/

public class UsuarioRepetidoException extends Exception {

	public UsuarioRepetidoException(String msg) {
		super(msg);
	}
	
}
