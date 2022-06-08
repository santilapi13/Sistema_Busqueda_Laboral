package modelo;

import java.util.ArrayList;

import modelo.aspectos.Locacion;

@SuppressWarnings("deprecation")
public class BolsaDeTrabajo {
	private ArrayList<TicketSimplificado> tickets = new ArrayList<TicketSimplificado>();

	public synchronized void buscaTicket(int rubro,Locacion loc) {
		int i=0;
		while (i<tickets.size() && tickets.get(i).getRubro() != rubro)
			i++;
		
	}
	
	public synchronized void agregaTicket(Empleador empleador, Locacion locacion) {
		while (empleador.getCantPuestosAct() == 3) {
			try {
				System.out.println("Empleador " + empleador.getNombre());
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.tickets.add(new TicketSimplificado(empleador.getRubro(),locacion,empleador));
	}
	
	
}
