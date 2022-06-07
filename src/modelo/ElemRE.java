package modelo;

import java.io.Serializable;

/** 
* @author Grupo 7
 * <br> 
* Clase que sirve para representar las elecciones que llevan a cabo tanto los empleados como los empleadores. 
*/

@SuppressWarnings("serial")
public class ElemRE implements Serializable {

    private NoAdmin usuarioActual;
    private NoAdmin usuarioElegido;
	private int indiceTicket;	// Si esta en arrayList de empleadores, indica el ticket de esa eleccion. Si esta en hashMap de empleados, indica ticket del empleador elegido.
	
	/**
	* Constructor de la clase ElemRE. <br>
	* <b>Pre</b>: usuarioActual, usuarioElegido e indiceTicket deben ser distinto de null.<br>
	* <b>Post</b>: La instancia de ElemRE tendr� sus atributos cargados correctamente<br>
	* @param usuarioActual: Representa al usuario NoAdmin que lleva a cabo la elecci�n (elige empleado o trabajo, en el caso de ser un usuario Empleador o Empleado respectivamente). <br>
	* @param usuarioElegido: Representa al usuario que fue elegido. <br>
	* @param indiceTicket: Representa el �ndice absoluto del ticket almacenado en el arreglo de tickets de Empleadores.
	*/
	public ElemRE(NoAdmin usuarioActual, NoAdmin usuarioElegido, int indiceTicket) {
		this.usuarioActual = usuarioActual;
		this.usuarioElegido = usuarioElegido;
		this.indiceTicket = indiceTicket;
	}

	public NoAdmin getUsuarioActual() {
		return usuarioActual;
	}
	public NoAdmin getUsuarioElegido() {
		return usuarioElegido;
	}
	public int getIndiceTicket() {
		return indiceTicket;
	}

	@Override
	public String toString() {
		return usuarioActual.getUsername() + ", puntaje: " + usuarioActual.getPuntajeApp() + "  eligio a  " + usuarioElegido.getUsername()+ ", puntaje: " + usuarioElegido.getPuntajeApp();
	}

	
}
