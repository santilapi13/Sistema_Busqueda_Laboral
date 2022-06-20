package modelo;

/** 
* @author Grupo 7
*/
import java.util.ArrayList;

import modelo.aspectos.HomeOffice;
import modelo.aspectos.LocIndistinta;
import modelo.aspectos.Locacion;
import modelo.aspectos.Presencial;

@SuppressWarnings("serial")
public class Empleador extends NoAdmin {

	private String nombre;
	private int tipoPersona; // 0: Fisica ; 1: Juridica
	private int rubro; // 0: Salud ; 1: Comercio Local ; 2: Comercio Internacional
	private ArrayList<TicketEmpleado> tickets = new ArrayList<TicketEmpleado>();
	private ArrayList<Empleado> empleadosElegidos = new ArrayList<Empleado>();
	private ArrayList<TicketEmpleado> ticketsAsignados = new ArrayList<TicketEmpleado>();
	private int cantPuestosAct = 0;
	
	/**
	 * Constructor de la clase Empleador. <br>
	 * <b>Pre</b>: username y password deben ser distintos de null. <br>
	 * rubro y tipoPersona deben aceptar valores limitados a 0, 1 o 2 , y 0 o 1
	 * respectivamente. <b>Post</b>: La instancia de Empleador tendr� sus atributos
	 * cargados correctamente<br>
	 * 
	 * @param username:    String que representa el nombre de usuario que utilizar�
	 *                     el empleador. <br>
	 * @param password:    String que representa la contrase�a que utilizar� el
	 *                     empleador. <br>
	 * @param nombre:      String que representa el nombre del empleador. <br>
	 * @param tipoPersona: Indica si se trata de una persona f�sica (0) o una
	 *                     persona jur�dica (1). <br>
	 * @param rubro:       indica el rubro al que se dedica el empleador, pudiendo
	 *                     ser salud(0), comercio local (1), comercio internacional
	 *                     (2).
	 */
	public Empleador(String username, String password, String nombre, int tipoPersona, int rubro) {
		super(username, password);
		this.nombre = nombre;
		this.tipoPersona = tipoPersona;
		this.rubro = rubro;
	}

	/**
	 * Elige un empleado para un ticket determinado que emiti� el empleador. Se
	 * agrega el empleado al ArrayList de empleados elegidos y el ticket al
	 * ArrayList de tickets asignados <br>
	 * <b>Pre</b>: Los par�metros empleado y ticket deben ser distinto de null. Los
	 * ArrayList empleadosElegidos y ticketsAsignados deben estar inicializados.
	 * <br>
	 * <b>Post</b>: El empleado se agreg� en el ArrayList de empleados elegidos y su
	 * ticket en el ArrayList de tickets asignados <br>
	 * 
	 * @param empleado : Empleado que se desea aelegir para el ticket pasado por
	 *                 par�metro.
	 * @param ticket   : Ticket para el cual se eligi� al empleado.
	 */
	public void eligeEmpleado(Empleado empleado, TicketEmpleado ticket) {
		this.empleadosElegidos.add(empleado);
		this.ticketsAsignados.add(ticket);
	}

	public ArrayList<TicketEmpleado> getTicketsAsignados() {
		return ticketsAsignados;
	}

	public ArrayList<Empleado> getEmpleadosElegidos() {
		return empleadosElegidos;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTipoPersona() {
		return tipoPersona;
	}

	public int getRubro() {
		return rubro;
	}

	public int getCantPuestosAct() {
		return cantPuestosAct;
	}
	
	public void setCantPuestosAct(int cantPuestosAct) {
		this.cantPuestosAct = cantPuestosAct;
	}

	public ArrayList<TicketEmpleado> getTickets() {
		return tickets;
	}

	/**
	 * Crea el formulario del empleador con los datos establecidos en los
	 * par�metros. Adem�s, se asigna el peso se le di� previamanete a cada
	 * componente del formulario.<br>
	 * <b>Pre</b>: Los par�metros del formulario deben ser 0,1 o 2. peso !=null<br>
	 * <b>Post</b>: El formulario se cre� correctamente y se agreg� al ArrayList de
	 * formularios. Se agreg� el peso al ArrayList de pesos <br>
	 * 
	 * @param locacion:      locaci�n que el empleador busca para el el empleo.
	 *                       0=Home Office, 1=presencial, 2= indistinto.
	 * @param remuneracion:  remuneraci�n que el empleador ofrece pagar para el
	 *                       empleo. 0=hasta 50k, 1= entre 50k y 100k, 2=+100k
	 * @param cargaHr:       carga horaria que el empleado busca para el empleo.
	 *                       0=media, 1=completa, 2=extendida.
	 * @param puestoLaboral: tipo de puesto que el empleador ofrece para el trabajo.
	 *                       0=junior, 1=senior, 2=managment
	 * @param rangoEtario:   rango etario que el empleador busca para el empleo.
	 *                       0=menos de 40, 1= entre 40 y 50, 2=m�s de 50.
	 * @param expPrevia:     experiencia previa que el empleador busca para el
	 *                       empleo. 0= nada, 1=media, 2=mucha.
	 * @param estudios:      estudios cursados que el empleador desea que el
	 *                       empleado tenga. 1=primario, 2=secundario, 3=terciario.
	 * @param peso:          importancia que el empleador le da a cada una de las
	 *                       caracter�sticas del empleo. peso !=null.
	 */
	public void creaFormulario(String locacion, String remuneracion, String cargaHoraria, String puestoLaboral, String rangoEtario, String expPrevia, String estudios, Peso peso) {
		FormularioFactory factory = new FormularioFactory();
		Formulario f = factory.getFormulario(locacion, remuneracion, cargaHoraria, puestoLaboral, rangoEtario,
				expPrevia, estudios);
		this.emiteFormulario(f, peso, 1);
	}

	public void creaFormulario(String locacion, String remuneracion, String cargaHoraria, String puestoLaboral, String rangoEtario, String expPrevia, String estudios, Peso peso, int cantPuestos) {
		FormularioFactory factory = new FormularioFactory();
		Formulario f = factory.getFormulario(locacion, remuneracion, cargaHoraria, puestoLaboral, rangoEtario,
				expPrevia, estudios);
		this.emiteFormulario(f, peso, cantPuestos);
	}

	/**
	 * Emite un formulario que recibir� la agencia, la cual devolver� un ticket (con
	 * el formulario y peso). El ticket se carga al arreglo de tickets. Se utiliza
	 * el patr�n de dise�o double dispatch. <br>
	 * <b>Pre</b>: Los par�metros formulario, agencia y peso deben ser distinto de
	 * null. El ArrayList de tickets debe estar inicializado. <br>
	 * <b>Post</b>: Se agreg� correctamente el ticket al ArrayList de tickets del
	 * empleador. <br>
	 * 
	 * @param agencia    : se encargar�, mediante double dispatch, de devolver el
	 *                   ticket con el formulario y peso establecidos.
	 * @param formulario : formulario del cual se desea crear un ticket. Formar�
	 *                   parte del ticket.
	 * @param peso       : reune los pesos que el empleador le da a cada campo del
	 *                   formulario. Formar� parte del ticket.
	 */
	public void emiteFormulario(Formulario f, Peso peso, int cantPuestos) {
		this.tickets.add(Agencia.getInstance().recibeFormEmpleador(f, peso, cantPuestos));
	}

	/**
	 * Establece como cancelado el estado del ticket de la posici�n i del ArrayList
	 * de tickets del empleador.<br>
	 * <b>Pre</b>: ArrayList de tickets !=null. i < tickets.getsize()<br>
	 * <b>Post</b>: El estado del ticket es "cancelado".<br>
	 * 
	 * @param agencia : posici�n en la que se encuentra el ticket en el arreglo de
	 *                tickets del empleador.
	 */
	public void cancelaTicket(int i) {
		this.tickets.get(i).cancelarse();
	}

	@Override
	public void run() {
		int i = 0;
		Locacion loc = null;
		String locacion = null;
		switch (Util.r.nextInt(0, 3)) {
		case 0:
			loc = new HomeOffice();
			locacion = "HomeOffice";
			break;
		case 1:
			loc = new Presencial();
			locacion = "Presencial";
			break;
		case 2:
			loc = new LocIndistinta();
			locacion = "Indistinta";
			break;
		}
		while (i < 4) {
			Util.espera();
			System.out.println(this.nombre + " quiere agregar un ticket para " + Util.rubros[this.rubro] + " y locacion " + locacion);
			BolsaDeTrabajo.getInstance().agregaTicket(this, loc);
			i++;
		}
	}

}
