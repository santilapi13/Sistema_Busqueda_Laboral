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

public class VRegistroEmpleado extends JFrame implements IVistaLogin{

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
	private JTextField textPassword;
	private ActionListener actionListener;

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
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		lblNewLabel_4 = new JLabel("PASSWORD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblNewLabel_4);
		
		textPassword = new JTextField();
		panel.add(textPassword);
		textPassword.setColumns(10);
		
		this.lblNewLabel_1 = new JLabel("NOMBRE");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblNewLabel_1);
		
		this.textNombre = new JTextField();
		this.textNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.textNombre);
		this.textNombre.setColumns(10);
		
		this.lblTipoDePersona = new JLabel("TELEFONO");
		this.lblTipoDePersona.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblTipoDePersona);
		
		this.textTel = new JTextField();
		this.textTel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.textTel);
		this.textTel.setColumns(10);
		
		this.lblNewLabel_2 = new JLabel("FECHA DE NACIMIENTO");
		this.lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblNewLabel_2);
		
		this.textFecha = new JTextField();
		this.textFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.textFecha);
		this.textFecha.setColumns(10);
		
		this.btnRegistrar = new JButton("Registrar");
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
	public String getRubro() {
		// TODO Auto-generated method stub
		return null;
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

}
