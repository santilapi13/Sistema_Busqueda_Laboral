package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;

public class TipoPuesto extends Aspecto {

	private static TipoPuesto instance= null;

	/**
	* Constructor privado debido a la implementación del patrón SINGLETON al calcular los puntajes.
	*/
	private TipoPuesto() {
	}

	public static TipoPuesto getInstance() {
	    if(instance==null) {
	    	TipoPuesto.instance=new TipoPuesto();
	    	TipoPuesto.matriz = MatrizFactory.getMatriz("TipoPuesto");
	    }
	    return TipoPuesto.instance;
	}

	@Override
	public double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso) {	
		int i = ti.getFormulario().getPuestoLaboral();
		int j = tj.getFormulario().getPuestoLaboral();
		return peso.getTipoPuesto()*TipoPuesto.matriz[i][j];
	}

}
