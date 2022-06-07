package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/** 
* @author Grupo 7
*/
@SuppressWarnings("serial")
public class Empleado extends NoAdmin {
	private String nya;
	private String telefono;
	private LocalDate fechaNacimiento;
    private TicketEmpleo ticket;
    private TicketEmpleado ticketElegido;
	
    
    /**
    * Constructor de la clase Empleado. <br>
    * <b>Pre</b>: username y password deben ser distintos de null, edad debe ser mayor a 18. <br>
    * <b>Post</b>: La instancia de Empleado tendr� sus atributos cargados correctamente<br>
    * @param username:  String que representa el nombre de usuario que utilizar� el Empleado. <br>
    * @param password: String que representa la contrase�a que utilizar� el Empleado. <br>
    * @param nya:  String que representa el nombre y apellido del Empleado. <br>
    * @param telefono: String que representa el telefono del Empleado. <br>
    * @param fechaNac: String con dia, mes y ano de nacimiento en formato dd/MM/yyyy. 
    */
	public Empleado(String username,String password,String nya, String telefono,String fechaNac) {
		super(username,password);
		this.nya = nya;
		this.telefono = telefono;
		this.fechaNacimiento = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.ticketElegido = null;
	}
	
	public Ticket getTicketElegido() {
		return ticketElegido;
	}
	public void setTicketElegido(TicketEmpleado eleccion) {
		this.ticketElegido = eleccion;
	}
	public String getNya() {
		return nya;
	}
	public String getTelefono() {
		return telefono;
	}
	public int getEdad() {
		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		return periodo.getYears();
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public TicketEmpleo getTicket() {
		return ticket;
	}
	

	/**
	* Crea un formulario de b�squeda en base a las condiciones pasadas por par�metro. <br>
	* @return Objeto de tipo Formulario con sus atributos cargados de acuerdo a las condiciones indicadas en los par�metros. 
	*/
	public Formulario creaFormulario(String locacion,String remuneracion,String cargaHoraria,String puestoLaboral,String expPrevia,String estudios) {
		String rangoEtario;
		if (this.getEdad() < 40)
			rangoEtario = "Edad Temprana";
		else if (this.getEdad() < 50)
			rangoEtario = "Edad Media";
		else
			rangoEtario = "Edad Avanzada";
		FormularioFactory factory = new FormularioFactory();
		return factory.getFormulario(locacion,remuneracion,cargaHoraria,puestoLaboral,rangoEtario,expPrevia,estudios);
	}
	
	
	/**
	* Crea un ticket de empleo enviando el formulario y los pesos a la agencia mediante el patr�n de dise�o Double Dispatch. <br>
	* <b>Pre</b>: Todos los par�metros deben ser distintos de null. <br>
	* <b>Post</b>: El atributo ticket contendr� la referencia al objeto TicketEmpleo correspondiente a su solicitud de trabajo. <br>
	* @param agencia:  Representa un elemento que implemente la interfaz IAgencia. <br>
	* @param f: Representa un formulario cargado con las condiciones del Empleado. <br>
	* @param p: Representa la importancia que le da el empleado a cada aspecto del formulario. 
	*/
	@Override
	public void emiteFormulario(IAgencia agencia,Formulario f,Peso peso) {
		this.ticket = agencia.recibeFormEmpleado(f,peso);
	}
	
	/**
	* Modifica el estado del ticket del empleado y penaliza al mismo en su puntaje<br>
	* <b>Post</b>: El atributo ticket contendr� la referencia al objeto TicketEmpleo correspondiente a su solicitud de trabajo y el puntaje de la aplicaci�n estar� decrementado en 1. 
	*/
	public void cancelaTicket() {
		this.ticket.cancelarse();
		this.incrPuntajeApp(-1);
	}
	
}
