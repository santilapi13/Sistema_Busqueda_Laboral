package prueba;

import controlador.ControladorLogin;
import excepciones.PesoInvalidoException;
import excepciones.UsuarioRepetidoException;
import modelo.Admin;
import modelo.Agencia;
import modelo.Empleado;
import modelo.Empleador;
import modelo.Peso;

public class PruebaVentana {

	public static void main(String[] args) {

		try {
			Agencia agencia = Agencia.getInstance();
			Admin a1 = new Admin("admin", "admin");
			agencia.addAdmin(a1);

			Empleado e1 = new Empleado("santisosa", "saso123", "Santiago Sosa", "223585835", "01/01/2002");
			agencia.addEmpleado(e1);
			Empleado e2 = new Empleado("lauluna", "lau123", "Lautaro Luna", "223897563", "01/01/2001");
			agencia.addEmpleado(e2);
			Empleador er1 = new Empleador("santilapiSA", "123", "Santiago Lapiana", 1, 0);
			agencia.addEmpleador(er1);
			Empleador er2 = new Empleador("wenchoSRL", "123", "Wenceslao Avalos", 0, 2);
			agencia.addEmpleador(er2);

	
			ControladorLogin login = new ControladorLogin();

		} catch (UsuarioRepetidoException e) {
			System.out.println(e.getMessage());

		}
	}
}