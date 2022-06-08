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
	public String toString() {
		return "locacion: " + locacion + ", remuneracion: " + remuneracion + ", cargaHr: " + cargaHoraria
				+ ", puestoLaboral: " + puestoLaboral + ", rangoEtario: " + rangoEtario + ", expPrevia: " + expPrevia
				+ ", estudios: " + estudios;
	}

}
