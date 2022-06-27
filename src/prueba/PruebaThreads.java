package prueba;

import java.util.ArrayList;

import controlador.ControladorThread;
import excepciones.UsuarioRepetidoException;
import modelo.Agencia;
import modelo.Empleado;
import modelo.Empleador;

public class PruebaThreads {

	public static void main(String[] args) {
		Agencia agencia = Agencia.getInstance();
		ArrayList<Thread> hilos = new ArrayList<Thread>();
		Empleado empleadoAct;
		
		try {
			for (int i=0;i<10;i++) {
				empleadoAct = new Empleado("empleado "+i,"asd","empleado "+i,"123","01/01/2002");
				agencia.addEmpleado(empleadoAct);
			}
			
			Empleador er1 = new Empleador("santilapi SA", "contrase�a", "Santiago Lapiana", 1, 0);
			agencia.addEmpleador(er1);
			Thread t1 = new Thread(er1);
			
			Empleador er2 = new Empleador("wencho SRL", "contrase�a2", "Wenceslao Avalos", 0, 2);
			agencia.addEmpleador(er2);
			Thread t2 = new Thread(er2);
			
			ControladorThread Simulacion = new ControladorThread();
			
		} catch (UsuarioRepetidoException e) {
			e.printStackTrace();
		}
		
	}

}
