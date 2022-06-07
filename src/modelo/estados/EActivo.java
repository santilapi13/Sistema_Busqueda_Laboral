package modelo.estados;


import java.io.Serializable;

import modelo.Ticket;

@SuppressWarnings("serial")
public class EActivo implements IEstadoTicket,Serializable{
	private Ticket ticket;

	public EActivo(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public void activarse() {
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
		this.ticket.setEstado(new EFinalizado(this.ticket));
	}

	@Override
	public boolean isActivo() {
		return true;
	}

	@Override
	public String toString() {
		return "activo";
	}
	
}
