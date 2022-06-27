package modelo;

import java.util.ArrayList;

import modelo.aspectos.Locacion;

/** 
* @author Grupo 7
 * <br> 
* Clase Singleton que funciona como recurso compartido para la busqueda y la agregacion de TicketSimplificado <br>
*/

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

	/**
     * Metodo sincronizado que sirve para que un empleado busque un ticket simplificado.<br>
     * Si hay un ticket con el rubro deseado, comprueba que tambien sea con la locacion que busca.<br>
     * Al encontrar un ticket de su agrado, remueve el ticket del recurso compartido y notifica a los demas hilos<br>
     *<b>Pre</b>: empleado, rubro y locacion deben ser distintos de null.<br>
     *@param empleado : Empleado que busca el ticket.<br>
     *@param rubro: Rubro deseado por el empleado.<br>
     *@param loc: Locacion deseada por el empleado. <br>
     *
     */
	public synchronized void buscaTicket(Empleado empleado, int rubro, Locacion loc) {
		int i = 0;
		double puntCoincidencia;

		while (i < tickets.size() && tickets.get(i).getRubro() != rubro) {
			i++;
		}

		TicketSimplificado ticket = (i < tickets.size()) ? tickets.get(i) : null;

		if (ticket != null && ticket.getRubro() == rubro) {
			empleado.notificador(empleado.getNya() + " encontro ticket de su satisfaccion pero va a consultar locacion.");
			puntCoincidencia = loc.enfrentar(ticket.getLocacion());
			if (puntCoincidencia > 0) {
				empleado.notificador(empleado.getNya() + " tomo el ticket: " + ticket);
				empleado.setTicketSimp(ticket);
				ticket.getEmpleador().setCantPuestosAct(ticket.getEmpleador().getCantPuestosAct() - 1);
				tickets.remove(ticket);
				notifyAll();
			} else {
				empleado.notificador(empleado.getNya() + " no cumple con el requisito de locacion.");
			}

		} else {
			empleado.notificador(empleado.getNya() + " no encontro un ticket de su rubro.");
		}
	}

	/**
     * Metodo sincronizado que sirve para que un empleador agregue tickets al recurso compartido.<br>
     * El empleador puede agregar como maximo 3 puestos de trabajo, de lo contrario debe esperar y liberar el recurso compartido.<br>
     *<b>Pre</b>: empleador y locacion deben ser distintos de null.<br>
     * @param empleador : Empleador que crea puestos de trabajo.<br>
     * @param locacion : Locacion deseada por el empleador. <br>
     *
     */
	public synchronized void agregaTicket(Empleador empleador, Locacion locacion) {
		while (empleador.getCantPuestosAct() == 3) {
			try {
				empleador.notificador("Empleador " + empleador.getNombre() + " ya creo 3 tickets y debe esperar.");
				wait();
			} catch (InterruptedException e) {
			}
		}
		empleador.notificador("Empleador " + empleador.getNombre() + " agrego su ticket con exito a la bolsa.");
		this.tickets.add(new TicketSimplificado(empleador.getRubro(), locacion, empleador));
	}

}
