package modelo.aspectos;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Remuneracion implements Enfrentable,Serializable {
	protected double sueldoComision;

	public double getSueldoComision() {
		return sueldoComision;
	}
	
}
