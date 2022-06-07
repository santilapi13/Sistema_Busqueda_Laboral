package modelo.estados;

public interface IEstadoTicket {
	void activarse();
	void cancelarse();
	void suspenderse();
	void finalizarse();
	boolean isActivo();
}
