package datos;

import modelo.Peso;
import modelo.TicketEmpleado;
import modelo.TicketEmpleo;

public class EstudiosCursados extends Aspecto {

	private static EstudiosCursados instance = null;

	/**
	* Constructor privado debido a la implementación del patrón SINGLETON al calcular los puntajes.
	*/
	private EstudiosCursados() {
	}

	public static EstudiosCursados getInstance() {
		if (instance == null) {
			EstudiosCursados.instance = new EstudiosCursados();
			EstudiosCursados.matriz = MatrizFactory.getMatriz("EstudiosCursados");
		}
		return EstudiosCursados.instance;
	}

	@Override
	public double calculaPuntaje(TicketEmpleado ti,TicketEmpleo tj,Peso peso) {	
		int i = ti.getFormulario().getEstudios();
		int j = tj.getFormulario().getEstudios();
		return peso.getEstudiosCursados()*EstudiosCursados.matriz[i][j];
	}

}
