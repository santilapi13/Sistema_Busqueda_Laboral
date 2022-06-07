package modelo;

import java.io.Serializable;

/** 
* @author Grupo 7
 * <br> 
* Clase que sirve para representar a los elementos que se almacenar�n en la lista de asignaci�n de cada usuario. <br>
*Implementa la interfaz Comparable 
*/

@SuppressWarnings("serial")
public class ElemLA implements Comparable<ElemLA>, Serializable {

    private NoAdmin usuario;
	private double puntEntrevista;
    private Ticket ticket;

    /**
    * Constructor de la clase ElemLA. <br>
    * <b>Pre</b>: usuario, puntaje y ticket deben ser distinto de null.<br>
    * <b>Post</b>: La instancia de ElemLA tendr� sus atributos cargados correctamente<br>
    * @param usuario: Objeto NoAdmin que fue asignado a la lista de asignaci�n. <br>
    * @param puntaje: Almacena el puntaje de la entrevista entre el Empleador y el Empleado. <br>
    * @param ticket: Almacena el ticket con el que se compar� en la entrevista entre Empleador y Empleado. 
    */
	public ElemLA(NoAdmin usuario, double puntaje, Ticket ticket) {
		this.usuario = usuario;
		this.puntEntrevista = puntaje;
		this.ticket = ticket;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public NoAdmin getUsuario() {
		return usuario;
	}

	public double getPuntEntrevista() {
		return puntEntrevista;
	}
	
	/**
	* Sobreescritura del metodo compareTo( ) definido en la interfaz Comparable. <br>
	*Establece que el criterio de comparaci�n entre los elementos de la lista de asignaci�n sea en base al puntaje de cada entrevista Empleado - Empleador. <br>
	* <b>Pre</b>: Tanto el par�metro �o� como el objeto que llame al m�todo deben tener un puntaje de entrevista distinto de null. <br>
	* <b>Post</b>: ElemLA ser� comparable<br>
	* @param o: Elemento de la lista de asignaci�n con el que se desea comparar al elemento que hace la llamada al m�todo. <br>
	* @return Resultado de la comparaci�n, -1 si el puntaje del elemento pasado como par�metro es menor y 1 si es mayor o igual.
	*/
	@Override
	public int compareTo(ElemLA o) {
		int resultado=0;
		if (this.puntEntrevista>o.getPuntEntrevista()) {
			resultado = -1;      
		}
		else if (this.puntEntrevista<o.getPuntEntrevista()) {    
			resultado = 1;      
		}
		else if (this.puntEntrevista == o.getPuntEntrevista())
			resultado = 1;
		return resultado;
	}

	@Override
	public String toString() {
		return "username: " + usuario.getUsername() + ", puntaje: " + puntEntrevista;
	}

	
}
