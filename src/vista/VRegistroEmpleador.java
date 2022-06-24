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

public class VRegistroEmpleador extends JFrame implements IVista{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnRegistrar;
	private JLabel lblNewLabel_1;
	private JTextField textNombre;
	private JLabel lblTipoDePersona;
	private JLabel lblNewLabel_2;
	private JComboBox comboBoxRubro;
	private JPanel panel_1;
	private JComboBox comboBoxTipo;
	private JLabel lblNewLabel_3;
	private JLabel lblUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VRegistroEmpleador frame = new VRegistroEmpleador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VRegistroEmpleador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 396);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.lblNewLabel = new JLabel("REGISTRO EMPLEADOR");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.contentPane.add(this.lblNewLabel, BorderLayout.NORTH);
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(9, 0, 0, 0));
		
		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1);
		this.panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.lblNewLabel_3 = new JLabel("USERNAME");
		this.lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel_1.add(this.lblNewLabel_3);
		
		this.lblUsername = new JLabel("");
		this.lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_1.add(this.lblUsername);
		
		this.lblNewLabel_1 = new JLabel("NOMBRE");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblNewLabel_1);
		
		this.textNombre = new JTextField();
		this.textNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.textNombre);
		this.textNombre.setColumns(10);
		
		this.lblTipoDePersona = new JLabel("TIPO DE PERSONA");
		this.lblTipoDePersona.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblTipoDePersona);
		
		this.comboBoxTipo = new JComboBox();
		this.comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"FISICA", "JURIDICA"}));
		this.comboBoxTipo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.comboBoxTipo);
		
		this.lblNewLabel_2 = new JLabel("RUBRO");
		this.lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel.add(this.lblNewLabel_2);
		
		this.comboBoxRubro = new JComboBox();
		this.comboBoxRubro.setModel(new DefaultComboBoxModel(new String[] {"SALUD", "COMERCIO LOCAL", "COMERCIO INTERNACIONAL"}));
		this.comboBoxRubro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel.add(this.comboBoxRubro);
		
		this.btnRegistrar = new JButton("Registrar");
		this.contentPane.add(this.btnRegistrar, BorderLayout.SOUTH);
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
		// TODO Auto-generated method stub
		return null;
	}

}
