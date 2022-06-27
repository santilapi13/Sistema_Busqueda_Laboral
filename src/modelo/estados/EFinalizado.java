package modelo.estados;

import java.io.Serializable;

import modelo.Ticket;

@SuppressWarnings("serial")
public class EFinalizado implements IEstadoTicket,Serializable {
	private Ticket ticket;

	public EFinalizado(Ticket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void activarse() {
	}

	@Override
	public void cancelarse() {
	}

	@Override
	public void suspenderse() {
	}

	@Override
	public void finalizarse() {
	}
	
	@Override
	public boolean isActivo() {
		return false;
	}
	
	@Override
	public String toString() {
		return "finalizado";
	}
	
}
