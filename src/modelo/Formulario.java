package modelo;

import java.io.Serializable;

import modelo.aspectos.CargaHoraria;
import modelo.aspectos.Estudios;
import modelo.aspectos.ExpPrevia;
import modelo.aspectos.Locacion;
import modelo.aspectos.PuestoLaboral;
import modelo.aspectos.RangoEtario;
import modelo.aspectos.Remuneracion;

@SuppressWarnings("serial")
public class Formulario implements Serializable {
	private Locacion locacion;
	private Remuneracion remuneracion;
	private CargaHoraria cargaHoraria;
	private PuestoLaboral puestoLaboral;
	private RangoEtario rangoEtario;
	private ExpPrevia expPrevia;
	private Estudios estudios;

	public Formulario(Locacion locacion, Remuneracion remuneracion, CargaHoraria cargaHoraria,
			PuestoLaboral puestoLaboral, RangoEtario rangoEtario, ExpPrevia expPrevia, Estudios estudios) {
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
	 * Permite comparar 2 formularios y determinar si tienen todos los campos
	 * iguales.<br>
	 * <b>Pre</b>: obj !=null. <b>Post</b>: se realizo la comparacion correctamente.
	 * Se retorna true o false<br>
	 * 
	 * @param obj : formulario con el cual se desea comparar el valor de los campos.
	 * @return true: si los 2 formularios tienen todos los campos iguales. false: si
	 *         los formularios difieren en el valor de 1 o m�s campos.
	 */
	public boolean equals(Object obj) {
		Formulario f = (Formulario) obj;
		return this.cargaHoraria.getClass().getSimpleName().equals(f.getCargaHoraria().getClass().getSimpleName())
				&& this.locacion.getClass().getSimpleName().equals(f.getLocacion().getClass().getSimpleName())
				&& this.remuneracion.getClass().getSimpleName().equals(f.getRemuneracion().getClass().getSimpleName())
				&& this.puestoLaboral.getClass().getSimpleName().equals(f.getPuestoLaboral().getClass().getSimpleName())
				&& this.rangoEtario.getClass().getSimpleName().equals(f.getRangoEtario().getClass().getSimpleName())
				&& this.expPrevia.getClass().getSimpleName().equals(f.getExpPrevia().getClass().getSimpleName())
				&& this.estudios.getClass().getSimpleName().equals(f.getEstudios().getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "locacion: " + locacion + ", remuneracion: " + remuneracion + ", cargaHr: " + cargaHoraria
				+ ", puestoLaboral: " + puestoLaboral + ", rangoEtario: " + rangoEtario + ", expPrevia: " + expPrevia
				+ ", estudios: " + estudios;
	}

}
