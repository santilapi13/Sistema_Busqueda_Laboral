package modelo;

import java.util.ArrayList;

import modelo.aspectos.Locacion;

@SuppressWarnings("deprecation")
public class BolsaDeTrabajo {
	
	private ArrayList<TicketSimplificado> tickets = new ArrayList<TicketSimplificado>();
	private static BolsaDeTrabajo instance = null;
	
	private BolsaDeTrabajo() {
	}
	
	public static BolsaDeTrabajo getInstance() {
		if (instance == null)
			instance = new BolsaDeTrabajo();
		return instance;
	}
	
	public synchronized void buscaTicket(Empleado empleado, int rubro,Locacion loc) {
		int i=0;
		double puntCoincidencia;
		
		while (i<tickets.size() && tickets.get(i).getRubro() != rubro) {
			i++;
		}
				
		TicketSimplificado ticket = (i<tickets.size()) ? tickets.get(i) : null;
		
		if (ticket != null && ticket.getRubro() == rubro) {
			System.out.println(empleado.getNya() + " encontro ticket de su satisfaccion pero va a consultar locacion.");
			puntCoincidencia = loc.enfrentar(ticket.getLocacion());
			if (puntCoincidencia > 0) {
				System.out.println(empleado.getNya() + " tomo el ticket: " + ticket);
				empleado.setTicketSimp(ticket);
				ticket.getEmpleador().setCantPuestosAct(ticket.getEmpleador().getCantPuestosAct()-1);;
				notifyAll();
			} else
				System.out.println(empleado.getNya() + " no cumple con el requisito de locacion.");
		} else
			System.out.println(empleado.getNya() + " no encontro un ticket de su rubro.");
	}
	
	public synchronized void agregaTicket(Empleador empleador, Locacion locacion) {
		while (empleador.getCantPuestosAct() == 3) {
			try {
				System.out.println("Empleador " + empleador.getNombre() + " ya creo 3 tickets y debe esperar.");
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Empleador " + empleador.getNombre() + " agrego su ticket con exito.");
		this.tickets.add(new TicketSimplificado(empleador.getRubro(),locacion,empleador));
	}
	
	
}
