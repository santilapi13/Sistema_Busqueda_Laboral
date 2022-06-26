package modelo;

/**
 * @author Grupo 7
 * <br>
 * Clase que representa el ticket de un empleado, se instancia cuando un empleado se postula para un puesto de trabajo.
 * Almacenar� un formulario con las instrucciones de qu� tipo de puesto de trabajo busca, y para cada aspecto 
 * un peso asignado el cual indicar� puntualmente en qu� caracter�stica de trabajo se destaca o prefiere.
 *
 */


@SuppressWarnings("serial")
public class TicketEmpleado extends Ticket {
	
	private int cantPuestos;
	
	/**
	*Constructor con dos par�metros para incluir en el ticket de empleado un formulario y los pesos asignados para 
	*cada aspecto del formulario.<br>
	*@param f : par�metro de tipo Formulario (objeto) que contiene las caracter�sticas del mismo 
	*@param peso : par�metro de tipo Peso (objeto) que contiene los pesos de cada aspecto del formulario.
	*
	*/
	
	public TicketEmpleado(Formulario formulario, Peso peso, int cantPuestos) {
		super(formulario,peso);
		this.cantPuestos = cantPuestos;
	}
	
	public void modificar(String locacion, String remuneracion, String cargaHoraria,String puestoLaboral, String rangoEtario,String expPrevia,String estudios,Peso pesos,int cantPuestos) {
		FormularioFactory f = new FormularioFactory();
		this.formulario = f.getFormulario(locacion, remuneracion, cargaHoraria, puestoLaboral, rangoEtario, expPrevia, estudios);
		this.peso = pesos;
		this.cantPuestos = cantPuestos;
	}

	@Override
	public double calculaPuntajeEncuentro(ITicket ticket) {	// Compara preferencias de este ticket (buscando un empleado) con las preferencias del ticket de empleo (buscando empleador) pasado por par�metro
		return Agencia.getInstance().calculaPuntajeEncuentro(this,(TicketEmpleo)ticket,this.peso);
	}

	public int getCantPuestos() {
		return cantPuestos;
	}

	public void setCantPuestos(int cantPuestos) {
		this.cantPuestos = cantPuestos;
	}

}
