package modelo.estados;

import java.io.Serializable;

import modelo.Ticket;

@SuppressWarnings("serial")
public class ECancelado implements IEstadoTicket,Serializable {
	private Ticket ticket;

	public ECancelado(Ticket ticket) {
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
		return "cancelado";
	}
	
}
