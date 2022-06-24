package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import excepciones.UsuarioRepetidoException;
import modelo.Agencia;
import modelo.Empleado;
import vista.IVistaLogin;
import vista.VLogin;
import vista.VRegistroAdmin;
import vista.VRegistroEmpleado;
import vista.VRegistroEmpleador;

public class ControladorLogin implements ActionListener {
	private IVistaLogin vista = null;

	public ControladorLogin() {
		this.vista = new VLogin();
		this.vista.setActionListener(this);

	}

	public IVistaLogin getVista() {
		return vista;
	}

	public void setVista(IVistaLogin vista) {
		this.vista = vista;
		this.vista.setActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equalsIgnoreCase("Ingresar")) {
			// validar
			String user = this.vista.getUsername();
			String pass = this.vista.getPassword();
			String tipo = this.vista.getTipo();
		} else if (comando.equalsIgnoreCase("Registrarse")) {
			
			String tipo = this.vista.getTipo();

			// abir ventana que corresponda
			switch (tipo) {
			case "ADMIN":
				this.vista.cerrarse();
				this.vista = new VRegistroAdmin();
				this.vista.setActionListener(this);
				break;
			case "EMPLEADOR":
				this.vista.cerrarse();
				this.vista = new VRegistroEmpleador();
				this.vista.setActionListener(this);
				break;
			case "EMPLEADO":
				this.vista.cerrarse();
				this.vista = new VRegistroEmpleado();
				this.vista.setActionListener(this);
				break;
			}

		} else if (comando.equalsIgnoreCase("Registrar")) {
			String user = this.vista.getUsername();
			String pass = this.vista.getPassword();
			String tipo = this.vista.getTipo();
			try {
				if (tipo.equalsIgnoreCase("Empleado")) {
					String nya = this.vista.getNombre();
					String telefono = this.vista.getTelefono();
					String fechaNacimiento = this.vista.getFecha();
					Agencia.getInstance().addEmpleado(new Empleado(user,pass,nya,telefono,fechaNacimiento));
				}
			} catch (UsuarioRepetidoException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage());
			}
		}
	}
}
