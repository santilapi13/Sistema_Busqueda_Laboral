package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.AbstractListModel;

public class VSimulacion extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JButton btnIniciar;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JList listEmpleadores;
	private JList listEmpleados;
	private JPanel panel_5;
	private JLabel lblNewLabel_3;
	private JList listResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VSimulacion frame = new VSimulacion();
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
	public VSimulacion() {
		setTitle("Simulacion - Threads");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 402);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.NORTH);
		this.panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.lblNewLabel = new JLabel("BOLSA DE TRABAJO");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.panel.add(this.lblNewLabel);
		
		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1);
		
		this.btnIniciar = new JButton("Iniciar");
		this.panel_1.add(this.btnIniciar);
		
		this.panel_2 = new JPanel();
		this.contentPane.add(this.panel_2, BorderLayout.CENTER);
		this.panel_2.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel_3 = new JPanel();
		this.panel_2.add(this.panel_3);
		this.panel_3.setLayout(new BorderLayout(0, 0));
		
		this.lblNewLabel_1 = new JLabel("EMPLEADORES");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_3.add(this.lblNewLabel_1, BorderLayout.NORTH);
		
		this.listEmpleadores = new JList();
		this.panel_3.add(this.listEmpleadores, BorderLayout.CENTER);
		
		this.panel_4 = new JPanel();
		this.panel_2.add(this.panel_4);
		this.panel_4.setLayout(new BorderLayout(0, 0));
		
		this.lblNewLabel_2 = new JLabel("Empleados");
		this.lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_4.add(this.lblNewLabel_2, BorderLayout.NORTH);
		
		this.listEmpleados = new JList();
		this.panel_4.add(this.listEmpleados, BorderLayout.CENTER);
		
		this.panel_5 = new JPanel();
		this.contentPane.add(this.panel_5, BorderLayout.SOUTH);
		this.panel_5.setLayout(new BorderLayout(0, 0));
		
		this.lblNewLabel_3 = new JLabel("\r\nRESULTADOS\r\n");
		this.lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.panel_5.add(this.lblNewLabel_3, BorderLayout.NORTH);
		
		this.listResultado = new JList();
		this.listResultado.setModel(new AbstractListModel() {
			String[] values = new String[] {""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		this.panel_5.add(this.listResultado, BorderLayout.CENTER);
	}

}
