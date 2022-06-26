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

	public synchronized void buscaTicket(Empleado empleado, int rubro, Locacion loc) {
		int i = 0;
		double puntCoincidencia;

		while (i < tickets.size() && tickets.get(i).getRubro() != rubro) {
			i++;
		}

		TicketSimplificado ticket = (i < tickets.size()) ? tickets.get(i) : null;

		if (ticket != null && ticket.getRubro() == rubro) {
			empleado.notificador(
					empleado.getNya() + " encontro ticket de su satisfaccion pero va a consultar locacion.");
			System.out.println(empleado.getNya() + " encontro ticket de su satisfaccion pero va a consultar locacion.");
			puntCoincidencia = loc.enfrentar(ticket.getLocacion());
			if (puntCoincidencia > 0) {
				empleado.notificador(empleado.getNya() + " tomo el ticket: " + ticket);
				System.out.println(empleado.getNya() + " tomo el ticket: " + ticket);
				empleado.setTicketSimp(ticket);
				ticket.getEmpleador().setCantPuestosAct(ticket.getEmpleador().getCantPuestosAct() - 1);
				tickets.remove(ticket);
				notifyAll();
			} else {
				empleado.notificador(empleado.getNya() + " no cumple con el requisito de locacion.");
				System.out.println(empleado.getNya() + " no cumple con el requisito de locacion.");
			}

		} else {
			empleado.notificador(empleado.getNya() + " no encontro un ticket de su rubro.");
			System.out.println(empleado.getNya() + " no encontro un ticket de su rubro.");
		}
	}

	public synchronized void agregaTicket(Empleador empleador, Locacion locacion) {
		while (empleador.getCantPuestosAct() == 3) {
			try {
				empleador.notificador("Empleador " + empleador.getNombre() + " ya creo 3 tickets y debe esperar.");
				System.out.println("Empleador " + empleador.getNombre() + " ya creo 3 tickets y debe esperar.");
				wait();
			} catch (InterruptedException e) {
			}
		}
		empleador.notificador("Empleador " + empleador.getNombre() + " agrego su ticket con exito a la bolsa.");
		System.out.println("Empleador " + empleador.getNombre() + " agrego su ticket con exito a la bolsa.");
		this.tickets.add(new TicketSimplificado(empleador.getRubro(), locacion, empleador));
	}

}
