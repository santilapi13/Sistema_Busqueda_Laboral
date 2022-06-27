package excepciones;

/**
*Excepcion que indica que el peso es invalido, debido a que sus atributos deben tener un valor entre 0 y 1. <br>
*/

@SuppressWarnings("serial")
public class PesoInvalidoException extends Exception {

	public PesoInvalidoException(String msg) {
		super(msg);
	}
}
