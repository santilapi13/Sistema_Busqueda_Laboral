package modelo;

import modelo.aspectos.Locacion;

public class TicketSimplificado {

	private int rubro;		// 0: Salud ; 1: Comercio Local ; 2: Comercio Internacional
	private Locacion locacion;
	private Empleador empleador;
	
	
	public TicketSimplificado(int rubro, Locacion locacion, Empleador empleador) {
		this.rubro = rubro;
		this.locacion = locacion;
		this.empleador = empleador;
	}
	
	public int getRubro() {
		return rubro;
	}
	public Locacion getLocacion() {
		return locacion;
	}
	public Empleador getEmpleador() {
		return empleador;
	}

	@Override
	public String toString() {
		return "rubro: " + Util.rubros[rubro] + ", locacion: " + locacion + ", empleador: " + empleador;
	}
	
	
	
}
