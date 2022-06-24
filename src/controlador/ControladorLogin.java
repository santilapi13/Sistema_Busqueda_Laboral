package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import excepciones.UsuarioRepetidoException;
import modelo.Admin;
import modelo.Agencia;
import modelo.Empleado;
import modelo.Empleador;
import vista.IVistaLogin;
import vista.VAdmin;
import vista.VEmpleado;
import vista.VEmpleador;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equalsIgnoreCase("Ingresar")) {
			ControladorUsuario controladorUsuario = null;
			String user = this.vista.getUsername();
			String pass = this.vista.getPassword();
			String tipo = this.vista.getTipo();
			switch (tipo) {
			case "ADMINISTRADOR":
				if (Agencia.getInstance().loguearAdmin(user, pass)) {
					this.vista.cerrarse();
					controladorUsuario= new ControladorUsuario(new VAdmin(user));
				} else
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
				break;
			case "EMPLEADO":
				if (Agencia.getInstance().loguearEmpleado(user, pass)) {
					controladorUsuario= new ControladorUsuario(new VEmpleado(user));
				} else
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
				break;
			case "EMPLEADOR":
				if (Agencia.getInstance().loguearEmpleador(user, pass)) {
					controladorUsuario= new ControladorUsuario(new VEmpleador(user));
				} else
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
				break;
			}
		} else if (comando.equalsIgnoreCase("Registrarse")) {

			String tipo = this.vista.getTipo();

			// abir ventana que corresponda
			switch (tipo) {
			case "ADMINISTRADOR":
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
					Agencia.getInstance().addEmpleado(new Empleado(user, pass, nya, telefono, fechaNacimiento));
				} else if (tipo.equalsIgnoreCase("Administrador")) {
					Agencia.getInstance().addAdmin(new Admin(user, pass));
				} else {
					// empleador
					String nombre = this.vista.getNombre();
					int rubro = this.vista.getRubro();
					int tipoaux = tipo == "FISICA" ? 0 : 1;
					Agencia.getInstance().addEmpleador(new Empleador(user, pass, nombre, tipoaux, rubro));
				}
				this.vista.cerrarse();
				this.vista = new VLogin();
				this.vista.setActionListener(this);

			} catch (UsuarioRepetidoException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage());
			}
		}
	}
}
