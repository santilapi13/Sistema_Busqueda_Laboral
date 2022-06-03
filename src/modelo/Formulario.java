package modelo;

import modelo.aspectos.CargaHoraria;
import modelo.aspectos.Estudios;
import modelo.aspectos.ExpPrevia;
import modelo.aspectos.Locacion;
import modelo.aspectos.PuestoLaboral;
import modelo.aspectos.RangoEtario;
import modelo.aspectos.Remuneracion;

public class Formulario {
	private Locacion locacion;		
	private Remuneracion remuneracion;	
	private CargaHoraria cargaHoraria;		
	private PuestoLaboral puestoLaboral;	
	private RangoEtario rangoEtario;	
	private ExpPrevia expPrevia;		
	private Estudios estudios;		
	
	public Formulario(Locacion locacion,Remuneracion remuneracion,CargaHoraria cargaHoraria,PuestoLaboral puestoLaboral, RangoEtario rangoEtario, ExpPrevia expPrevia, Estudios estudios) {
		super();
		this.locacion = locacion;
		this.remuneracion = remuneracion;
		this.cargaHoraria = cargaHoraria;
		this.puestoLaboral = puestoLaboral;
		this.rangoEtario = rangoEtario;
		this.expPrevia = expPrevia;
		this.estudios = estudios;
	}
	
	
	public Locacion getLocacion() {
		return locacion;
	}

	public Remuneracion getRemuneracion() {
		return remuneracion;
	}

	public CargaHoraria getCargaHoraria() {
		return cargaHoraria;
	}

	public PuestoLaboral getPuestoLaboral() {
		return puestoLaboral;
	}


	public RangoEtario getRangoEtario() {
		return rangoEtario;
	}

	public ExpPrevia getExpPrevia() {
		return expPrevia;
	}

	public Estudios getEstudios() {
		return estudios;
	}

	@Override
	/**
	 * Permite comparar 2 formularios y determinar si tienen todos los campos iguales.<br>
	 * <b>Pre</b>: obj !=null.
	 * <b>Post</b>: se realizó la comparación correctamente. Se retornó true o false<br>
	 * @param obj : formulario con el cual se desea comparar el valor de los campos.
	 * @return true: si los 2 formularios tienen todos los campos iguales. false: si los formularios difieren en el valor de 1 o más campos.
	 */
	public boolean equals(Object obj) {
		Formulario f = (Formulario) obj;
		return this.cargaHoraria.equals(f.getCargaHoraria()) && this.locacion.equals(f.getLocacion()) && this.remuneracion.equals(f.getRemuneracion()) && this.puestoLaboral.equals(f.getPuestoLaboral()) && this.rangoEtario.equals(f.getRangoEtario()) && this.expPrevia.equals(f.getExpPrevia()) && this.estudios.equals(f.getEstudios());
	}


	@Override
	public String toString() {
		return "locacion: " + locacion + ", remuneracion: " + remuneracion + ", cargaHr: " + cargaHoraria
				+ ", puestoLaboral: " + puestoLaboral + ", rangoEtario: " + rangoEtario + ", expPrevia: " + expPrevia
				+ ", estudios: " + estudios;
	}
	
	
	
}
