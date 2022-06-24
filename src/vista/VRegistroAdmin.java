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

public class VRegistroAdmin extends JFrame implements IVistaLogin{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnRegistrar;
	private JLabel lblNewLabel_3;
	private JTextField textUsername;
	private JLabel lblNewLabel_4;
	private JTextField textPassword;

	public VRegistroAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 396);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.lblNewLabel = new JLabel("REGISTRO ADMIN");
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
		
		this.btnRegistrar = new JButton("Registrar");
		btnRegistrar.setEnabled(false);
		this.contentPane.add(this.btnRegistrar, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFecha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRubro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		return "Admin";
	}

	@Override
	public void cerrarse() {
		this.dispose();
	}

	@Override
	public String getTelefono() {
		// TODO Auto-generated method stub
		return null;
	}

}
