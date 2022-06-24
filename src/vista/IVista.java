package vista;

import java.awt.event.ActionListener;

public interface IVista {

	void setActionListener(ActionListener actionListener);
	
	String getUsername();
	
	String getPassword();
	
	String getFecha();
	
	String getNombre();
	
	String getRubro();
	
	String getTipo();
	
}
