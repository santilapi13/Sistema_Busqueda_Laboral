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

			// CREACION DE TICKETS (locacion, remuneracion, carga horaria, puesto laboral,
			// (rango etario), experiencia previa, estudios)
			e1.emiteFormulario(agencia,
					e1.creaFormulario("Presencial", "Alta", "Completa", "Senior", "Media", "Terciario"),
					new Peso(1, 0.2, 0.4, 1, 0.2, 1, 0.8));
			e2.emiteFormulario(agencia,
					e2.creaFormulario("HomeOffice", "Baja", "Extendida", "Managment", "Media", "Terciario"),
					new Peso(1, 0.5, 0.4, 1, 0.2, 1, 0.8));

			er1.creaFormulario("HomeOffice", "Media", "Media", "Senior", "Edad Temprana", "Media", "Terciario",
					new Peso(1, 1, 1, 1, 1, 1, 1), 2); // indice 0

			er2.creaFormulario("Presencial", "Alta", "Media", "Managment", "Edad Media", "Media", "Primario",
					new Peso(0.3, 0.5, 1, 1, 0.1, 1, 1));

			ControladorLogin login = new ControladorLogin();

		} catch (PesoInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (UsuarioRepetidoException e) {
			System.out.println(e.getMessage());

		}
	}
}