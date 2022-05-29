package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;
/**
 * @author Grupo 7
 * <br>
 *Clase abstracta de la cual se extienden todos los aspectos del formulario. En ella se aplica el patrón template, 
 *en el cual se emplea un algoritmo común de pasos con una implementación que dependerá de la clase extendida que se utilice.
 *
 */


public abstract class Aspecto {
	
	protected static double[][] matriz;
	
	public Aspecto() {
	}

	public abstract double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso);
	
}
