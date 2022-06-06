package modelo;

public class ESuspendido implements IEstadoTicket {
	private Ticket ticket;

	public ESuspendido(Ticket ticket) {
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
		return "suspendido";
	}
	
}
