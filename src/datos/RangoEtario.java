package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;

public class RangoEtario extends Aspecto {

	private static RangoEtario instance= null;

	/**
	* Constructor privado debido a la implementación del patrón SINGLETON al calcular los puntajes.
	*/
	private RangoEtario() {
	}

	public static RangoEtario getInstance() {
	    if(instance==null) {
	    	RangoEtario.instance=new RangoEtario();
	    	RangoEtario.matriz = MatrizFactory.getMatriz("RangoEtario");
	    }
	    return RangoEtario.instance;
	}

	@Override
	public double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso) {	
		int i = ti.getFormulario().getRangoEtario();
		int j = tj.getFormulario().getRangoEtario();
		return peso.getRangoEtario()*RangoEtario.matriz[i][j];
	}
}
