package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import excepciones.UsuarioRepetidoException;
import modelo.Admin;
import modelo.Agencia;
import modelo.Empleado;
import modelo.Empleador;
import persistencia.AgenciaDTO;
import persistencia.IPersistencia;
import persistencia.PersistenciaBIN;
import persistencia.UtilAgencia;
import vista.IVistaLogin;
import vista.VAdmin;
import vista.VEmpleado;
import vista.VEmpleador;
import vista.VLogin;
import vista.VRegistroAdmin;
import vista.VRegistroEmpleado;
import vista.VRegistroEmpleador;

public class ControladorLogin implements ActionListener, Observer {
	
	private IVistaLogin vista = null;
	private static ControladorLogin instance = null;

	private ControladorLogin() {
		Agencia.getInstance().setUsuarioLogueado(null, null);
		this.vista = new VLogin();
		this.vista.setActionListener(this);
		Agencia.getInstance().addObserver(this);
	}
	
	public static ControladorLogin getInstance() {
		if (instance == null)
			instance = new ControladorLogin();
		return instance;
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
			
			String user = this.vista.getUsername();
			String pass = this.vista.getPassword();
			String tipo = this.vista.getTipo();
			Agencia.getInstance().loguear(user,pass,tipo);
			
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
			default:
				JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo para registrarse.");
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
				} else {	// empleador
					String nombre = this.vista.getNombre();
					int rubro = this.vista.getRubro();
					int tipoaux = tipo == "FISICA" ? 0 : 1;
					Agencia.getInstance().addEmpleador(new Empleador(user, pass, nombre, tipoaux, rubro));
				}
				this.vista.cerrarse();
				this.vista = new VLogin();
				this.vista.setActionListener(this);
				Agencia.getInstance().setUsuarioLogueado(null, null);
				
				IPersistencia<Serializable> persistencia = new PersistenciaBIN();
				
				persistencia.abrirOutput("Agencia.bin");
				AgenciaDTO aDTO = UtilAgencia.AgenciaToAgenciaDTO(Agencia.getInstance());
				persistencia.escribir(aDTO);
				persistencia.cerrarOutput();
				
			} catch (UsuarioRepetidoException exc) {
				JOptionPane.showMessageDialog(null, exc.getMessage());
			} catch (IOException exc) {
				JOptionPane.showMessageDialog(null, exc.getLocalizedMessage());
			}
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o != Agencia.getInstance())
			throw new InvalidParameterException();
		if (arg.toString().contentEquals("ADMINISTRADOR")) {
			this.vista.cerrarse();
			ControladorUsuario.getInstance().setVista(new VAdmin(Agencia.getInstance().getUsuarioLogueado().getUsername()));
		} else if (arg.toString().contentEquals("EMPLEADO")) {
			this.vista.cerrarse();
			ControladorUsuario.getInstance().setVista(new VEmpleado(Agencia.getInstance().getUsuarioLogueado().getUsername()));
		} else if (arg.toString().contentEquals("EMPLEADOR")) {
			this.vista.cerrarse();
			ControladorUsuario.getInstance().setVista(new VEmpleador(Agencia.getInstance().getUsuarioLogueado().getUsername()));
		} else if (arg.toString().contentEquals("INCORRECTO"))
			JOptionPane.showMessageDialog(null, "Usuario o contrasena incorrecta");
	}
}
