package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VAgencia extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JList list;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAgencia frame = new VAgencia();
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
	public VAgencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 440);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel);
		this.panel.setLayout(new BorderLayout(0, 0));
		
		this.lblNewLabel = new JLabel("ADMINISTRADOR DE AGENCIA");
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		this.panel.add(this.lblNewLabel, BorderLayout.NORTH);
		
		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1, BorderLayout.CENTER);
		this.panel_1.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.lblNewLabel_1 = new JLabel("");
		this.panel_1.add(this.lblNewLabel_1);
		
		this.btnNewButton = new JButton("EMPLEADOS");
		this.btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panel_1.add(this.btnNewButton);
		
		this.btnNewButton_1 = new JButton("EMPLEADORES");
		this.btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panel_1.add(this.btnNewButton_1);
		
		this.btnNewButton_2 = new JButton("SOLICITUDES DE EMPLEO");
		this.btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panel_1.add(this.btnNewButton_2);
		
		this.btnNewButton_3 = new JButton("SOLICITUDES DE EMPLEADO");
		this.btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panel_1.add(this.btnNewButton_3);
		
		this.btnNewButton_4 = new JButton("COMISIONES");
		this.btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panel_1.add(this.btnNewButton_4);
		
		this.btnNewButton_5 = new JButton("INICIAR RONDA DE ENCUENTROS");
		this.btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panel_1.add(this.btnNewButton_5);
		
		this.btnNewButton_6 = new JButton("INICIAR RONDA DE CONTRATACION");
		this.btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.panel_1.add(this.btnNewButton_6);
		
		this.list = new JList();
		this.contentPane.add(this.list);
	}

}
