package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class VRegistroEmpleado extends JFrame implements IVistaLogin, KeyListener{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnRegistrar;
	private JLabel lblNewLabel_1;
	private JTextField textNombre;
	private JLabel lblTipoDePersona;
	private JLabel lblNewLabel_2;
	private JTextField textTel;
	private JTextField textFecha;
	private JLabel lblNewLabel_3;
	private JTextField textUsername;
	private JLabel lblNewLabel_4;
	private ActionListener actionListener;
	private JPasswordField textPassword;

	public VRegistroEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 396);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.lblNewLabel = new JLabel("REGISTRO EMPLEADO");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.contentPane.add(this.lblNewLabel, BorderLayout.NORTH);
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(10, 0, 0, 0));
		
		lblNewLabel_3 = new JLabel("USERNAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblNewLabel_3);
		
		textUsername = new JTextField();
		this.textUsername.addKeyListener(this);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		lblNewLabel_4 = new JLabel("PASSWORD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblNewLabel_4);
		
		this.textPassword = new JPasswordField();
		this.textPassword.addKeyListener(this);
		this.panel.add(this.textPassword);
		
		this.lblNewLabel_1 = new JLabel("NOMBRE");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblNewLabel_1);
		
		this.textNombre = new JTextField();
		this.textNombre.addKeyListener(this);
		this.textNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.textNombre);
		this.textNombre.setColumns(10);
		
		this.lblTipoDePersona = new JLabel("TELEFONO");
		this.lblTipoDePersona.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblTipoDePersona);
		
		this.textTel = new JTextField();
		this.textTel.addKeyListener(this);
		this.textTel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.textTel);
		this.textTel.setColumns(10);
		
		this.lblNewLabel_2 = new JLabel("FECHA DE NACIMIENTO");
		this.lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblNewLabel_2);
		
		this.textFecha = new JTextField();
		this.textFecha.addKeyListener(this);
		this.textFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.textFecha);
		this.textFecha.setColumns(10);
		
		this.btnRegistrar = new JButton("Registrar");
		this.btnRegistrar.setEnabled(false);
		this.contentPane.add(this.btnRegistrar, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btnRegistrar.addActionListener(actionListener);
		this.actionListener = actionListener;
	}

	@Override
	public String getUsername() {
		return this.textUsername.getText();
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getPassword() {
		return this.textPassword.getText();
	}

	@Override
	public String getFecha() {
		return this.textFecha.getText();
	}

	@Override
	public String getNombre() {
		return this.textNombre.getText();
	}

	@Override
	public int getRubro() {
		return -1;
	}

	@Override
	public String getTipo() {
		return "Empleado";
	}
	
	@Override
	public void cerrarse() {
		this.dispose();
	}

	@Override
	public String getTelefono() {
		return this.textTel.getText();
	}

	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		btnRegistrar.setEnabled(validar());
	}
	public void keyTyped(KeyEvent e) {
	}
	
	@SuppressWarnings("deprecation")
	private boolean validar() {
		boolean resp=false;
		resp= textUsername.getText()!=null && !textUsername.getText().isEmpty() 
				&& textPassword.getText()!=null && !textPassword.getText().isEmpty()
				&& textNombre.getText()!=null && !textNombre.getText().isEmpty()
				&& textTel.getText()!=null && !textTel.getText().isEmpty()
				&& textFecha.getText()!=null && !textFecha.getText().isEmpty();
		return resp;
	}
}
