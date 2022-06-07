package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

import modelo.estados.EActivo;
import modelo.estados.IEstadoTicket;

/**
 * @author Grupo 7 <br>
 *         Clase que representa el ticket de un usuario, es una clase abstracta
 *         debido que la instanciaci�n de un ticket depender� de su tipo, ya sea
 *         de empleado o de empleador.
 *
 */

@SuppressWarnings("serial")
public abstract class Ticket implements ITicket, Serializable {

	private Formulario formulario;
	private Calendar fecha;
	private IEstadoTicket estado;

	protected Peso peso;

	/**
	 * Constructor con dos par�metros para incluir en el ticket un formulario y los
	 * pesos asignados para cada aspecto del formulario<br>
	 * 
	 * @param f    : par�metro de tipo Formulario (objeto) que contiene las
	 *             caracter�sticas del mismo
	 * @param peso : par�metro de tipo Peso (objeto) que contiene los pesos de cada
	 *             aspecto del formulario.
	 *
	 */
	public Ticket(Formulario formulario, Peso peso) {
		super();
		this.formulario = formulario;
		this.estado = new EActivo(this);
		this.fecha = GregorianCalendar.getInstance();
		this.peso = peso;
	}

	public Formulario getFormulario() {
		return formulario;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setEstado(IEstadoTicket estado) {
		this.estado = estado;
	}

	public Peso getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "fecha: " + fecha.getTime() + ", estado: " + estado;
	}

	/**
	 * Sobreescribe el metodo equals, para comparar cada atributo especifico de los
	 * objetos Ticket<br>
	 * 
	 * @return boolean que indica si los objetos de tipo Ticket poseen mismo
	 *         atributos(true) o no(false).
	 */

	public void cancelarse() {
		this.estado.cancelarse();
	}

	public void suspenderse() {
		this.estado.suspenderse();
	}

	public void finalizarse() {
		this.estado.finalizarse();
	}

	public void activarse() {
		this.estado.activarse();
	}

	public boolean isActivo() {
		return this.estado.isActivo();
	}

	@Override
	public boolean equals(Object obj) {
		Ticket t = (Ticket) obj;
		return t.getFormulario().equals(this.formulario) && t.getPeso().equals(this.peso);
	}

}
