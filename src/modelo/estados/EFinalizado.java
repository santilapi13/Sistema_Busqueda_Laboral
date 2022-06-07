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
		this.ticket.setEstado(new EActivo(this.ticket));
	}

	@Override
	public void cancelarse() {
		this.ticket.setEstado(new ECancelado(this.ticket));
	}

	@Override
	public void suspenderse() {
		this.ticket.setEstado(new ESuspendido(this.ticket));
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
