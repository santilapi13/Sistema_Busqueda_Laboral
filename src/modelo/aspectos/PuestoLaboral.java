package modelo.aspectos;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class PuestoLaboral implements Enfrentable,Serializable{
	protected double tasaComision;

	public double getTasaComision() {
		return tasaComision;
	}

}
