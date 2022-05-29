package excepciones;

@SuppressWarnings("serial")

/**
*Excepci�n que indica que el nombre de usuario a crear ya est� en uso y no se puede repetir.<br>
*/

public class UsuarioRepetidoException extends Exception {

	public UsuarioRepetidoException(String msg) {
		super(msg);
	}
	
}
