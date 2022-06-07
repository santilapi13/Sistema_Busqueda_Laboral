package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("serial")
public class ListaAsignacion implements Serializable {

	private SortedSet<ElemLA> usuarios = new TreeSet<ElemLA>();
	private Calendar fecha;

	public ListaAsignacion() {
		this.fecha = GregorianCalendar.getInstance();
	}

	public Calendar getFecha() {
		return fecha;
	}

	public SortedSet<ElemLA> getUsuarios() {
		return usuarios;
	}

	/**
	 * Determina si un ticket id�ntico (el mismo valor en todos los campos) ya se
	 * encuentra en la lista de asignaci�n de cierto usuario. Esto se realiza para
	 * luego no agregar tickets repetidos.<br>
	 * <b>Pre</b>: ticket y usuario deben ser distinto de null. <b>Post</b>: se
	 * verific� si el ticket est� en la lista de asignaci�n correctamente. Se
	 * retorn� true o false<br>
	 * 
	 * @param ticket  : ticket del cual se busca determinar si ya se encuentra en la
	 *                lista de asignaci�n.
	 * @param usuario : usuario del cual se aalizar� su lista de asignaci�n.
	 * @return true: si el ticket se encuentra en el la lista de asignaci�n. false:
	 *         si el ticket no est� en la lista de asignaci�n.
	 */
	public boolean ticketRepetido(Ticket ticket, NoAdmin usuario) {
		boolean esta = false;
		ElemLA elemAct;
		Iterator<ElemLA> iterator = this.usuarios.iterator();
		while (iterator.hasNext() && !esta) {
			elemAct = iterator.next();
			esta = ticket.getFormulario().equals(elemAct.getTicket().getFormulario())
					&& elemAct.getUsuario() == usuario;
		}
		return esta;
	}

	@Override
	public String toString() {
		return "\n\tfecha: " + fecha.getTime() + "\n";
	}

}
