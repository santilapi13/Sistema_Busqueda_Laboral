package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;

public class CargaHoraria extends Aspecto {

	private static CargaHoraria instance= null;

	/**
	* Constructor privado debido a la implementación del patrón SINGLETON al calcular los puntajes.
	*/

	private CargaHoraria() {
	}

	public static CargaHoraria getInstance() {
	    if(instance==null) {
	        CargaHoraria.instance=new CargaHoraria();
	        CargaHoraria.matriz = MatrizFactory.getMatriz("CargaHoraria");
	    }
	    return CargaHoraria.instance;
	}

	@Override
	public double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso) {	
		int i = ti.getFormulario().getCargaHr();
		int j = tj.getFormulario().getCargaHr();
		return peso.getCargaHoraria()*CargaHoraria.matriz[i][j];
	}
	
}
