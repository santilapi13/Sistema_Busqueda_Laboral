package modelo;

/**
 * @author Grupo 7
 * <br>
 * Clase que representa el ticket de un empleador, se instancia cuando un empleador oferta al sistema puestos de trabajo. 
 * Almacenar� un formulario con las instrucciones de qu� tipo de puesto de trabajo busca, y para cada aspecto un peso asignado 
 * el cual indicar� puntualmente qu� rasgo anhela mas.
 *
 */



@SuppressWarnings("serial")
public class TicketEmpleo extends Ticket {
	
	private String resultado;

	/**
	*Constructor con dos parametros para incluir en el ticket de empleo un formulario y los pesos asignados para cada 
	*aspecto del formulario, el resultado del ticket se setea inicialmente como �pendiente<br>
	*@param formulario : parametro de tipo Formulario (objeto) que contiene las caracteristicas del mismo 
	*@param peso : parametro de tipo Peso (objeto) que contiene los pesos de cada aspecto del formulario.
	*/

	
	public TicketEmpleo(Formulario formulario, Peso peso) {
		super(formulario,peso);
		this.resultado = "pendiente";
	}
	
	public void modificar(String locacion, String remuneracion, String cargaHoraria,String puestoLaboral, String rangoEtario,String expPrevia,String estudios,Peso pesos) {
		FormularioFactory f = new FormularioFactory();
		this.formulario = f.getFormulario(locacion, remuneracion, cargaHoraria, puestoLaboral, rangoEtario, expPrevia, estudios);
		this.peso = pesos;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getResultado() {
		return resultado;
	}


	@Override
	public double calculaPuntajeEncuentro(ITicket ticket) {	// Compara preferencias de este ticket (buscando un empleador) con las preferencias del ticket de empleado pasado por par�metro
		return Agencia.getInstance().calculaPuntajeEncuentro((TicketEmpleado)ticket,this,this.peso);
	}
	
}
