package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;

public class Locacion extends Aspecto {

	private static Locacion instance= null;
	
	/**
	* Constructor privado debido a la implementación del patrón SINGLETON al calcular los puntajes.
	*/
	private Locacion() {
	}

	public static Locacion getInstance() {
	    if(instance==null) {
	    	Locacion.instance=new Locacion();
	    	Locacion.matriz = MatrizFactory.getMatriz("Locacion");
	    }
	    return Locacion.instance;
	}

	@Override
	public double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso) {	
		int i = ti.getFormulario().getLocacion();
		int j = tj.getFormulario().getLocacion();
		return peso.getLocacion()*Locacion.matriz[i][j];
	}
}
