package modelo;

public class ECancelado implements IEstadoTicket {
	private Ticket ticket;

	public ECancelado(Ticket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void activarse() {
		this.ticket.setEstado(new EActivo(this.ticket));
	}

	@Override
	public void cancelarse() {
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
		return false;
	}
	
	@Override
	public String toString() {
		return "cancelado";
	}
	
}
