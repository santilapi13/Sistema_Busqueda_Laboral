package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;

public class ExpPrevia extends Aspecto {

	private static ExpPrevia instance= null;

	/**
	* Constructor privado debido a la implementación del patrón SINGLETON al calcular los puntajes.
	*/
	private ExpPrevia() {
	}

	public static ExpPrevia getInstance() {
	    if(instance==null) {
	    	ExpPrevia.instance=new ExpPrevia();
	    	ExpPrevia.matriz = MatrizFactory.getMatriz("ExpPrevia");
	    }
	    return ExpPrevia.instance;
	}

	@Override
	public double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso) {	
		int i = ti.getFormulario().getExpPrevia();
		int j = tj.getFormulario().getExpPrevia();
		return peso.getExpPrevia()*ExpPrevia.matriz[i][j];
	}

}
