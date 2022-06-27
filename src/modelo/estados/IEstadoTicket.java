package modelo.estados;

/**
 * @author Grupo 7<br>
 * Interface utilizada para por el patron State<br>
 */
public interface IEstadoTicket {
	void activarse();
	void cancelarse();
	void suspenderse();
	void finalizarse();
	boolean isActivo();
}
