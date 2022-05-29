package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;

public class Remuneracion extends Aspecto {

	private static Remuneracion instance= null;

	/**
	* Constructor privado debido a la implementación del patrón SINGLETON al calcular los puntajes.
	*/
	private Remuneracion() {
	}

	public static Remuneracion getInstance() {
	    if(instance==null) {
	    	Remuneracion.instance=new Remuneracion();
	    	Remuneracion.matriz = MatrizFactory.getMatriz("Remuneracion");
	    }
	    return Remuneracion.instance;
	}

	@Override
	public double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso) {	
		int i = ti.getFormulario().getRemuneracion();
		int j = tj.getFormulario().getRemuneracion();
		return peso.getRemuneracion()*Remuneracion.matriz[i][j];
	}

}
