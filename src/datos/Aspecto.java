package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;
/**
 * @author Grupo 7
 * <br>
 *Clase abstracta de la cual se extienden todos los aspectos del formulario. En ella se aplica el patr�n template, 
 *en el cual se emplea un algoritmo com�n de pasos con una implementaci�n que depender� de la clase extendida que se utilice.
 *
 */


public abstract class Aspecto {
	
	protected static double[][] matriz;
	
	public Aspecto() {
	}

	public abstract double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso);
	
}
