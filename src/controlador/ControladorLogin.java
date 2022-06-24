package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.IVista;
import vista.VLogin;
import vista.VRegistroEmpleado;
import vista.VRegistroEmpleador;

public class ControladorLogin implements ActionListener {
	private IVista vista = null;

	
	public ControladorLogin() {
		this.vista = new VLogin();
		this.vista.setActionListener(this);
		
	}

	public IVista getVista() {
		return vista;
	}

	public void setVista(IVista vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equalsIgnoreCase("Ingresar")) {
			//validar
			String user= this.vista.getUsername();
			String pass=this.vista.getPassword();
			String tipo= this.vista.getTipo();
			
			/*if (Agencia.getInstance().existeUser(user,tipo)) {
				
			}*/
		}
		else if (comando.equalsIgnoreCase("Registrarse")) {
			
			//validar que no haya uno registrado igual
			String user= this.vista.getUsername();
			String pass=this.vista.getPassword();
			String tipo= this.vista.getTipo();
			
			//if (!Agencia.getInstance().existeUser(user,tipo)) {
			if (true) {
				//abir ventana que corresponda
				switch(tipo) {
				case "ADMIN":
					//sin ventana
					
						break;
				case "EMPLEADO":
					VRegistroEmpleador regEmpleador= new VRegistroEmpleador();
					regEmpleador.setVisible(true);									
					break;
				case "EMPLEADOR":
					VRegistroEmpleado regEmpleado= new VRegistroEmpleado();
					regEmpleado.setVisible(true);	
					break;
				}
			}
				
		}
	}
}
