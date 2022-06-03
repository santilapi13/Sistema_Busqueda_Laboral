package datos;

import modelo.Empleado;

public abstract class Comisiones {
	
	private static double [][] matriz = {{60,70,80},{80,90,100}}; 

	public Comisiones() {
	}
	
	public static double calculaTasa(int fila, int columna, double puntaje) {
		return (matriz[fila][columna] - puntaje) < 0 ? 0.05: (matriz[fila][columna] - puntaje)/100;		// como minimo cobra una comision del 5%
	}

	public static double calculaTasa(Empleado empleado) {
		double tasaEmpleadoBruto = empleado.getTicket().getFormulario().getPuestoLaboral().getTasaComision();
		return (tasaEmpleadoBruto - empleado.getPuntajeApp()) < 0 ? 0.05 : (tasaEmpleadoBruto - empleado.getPuntajeApp())/100;		// como minimo cobra una comision del 5%
	}
}
