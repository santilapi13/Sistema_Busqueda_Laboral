package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
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

	@Override
	public String toString() {
		return "\n\tfecha: " + fecha.getTime() + "\n";
	}

}
