package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class VEmpleador extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JList listTicket;
	private JButton btnModificar;
	private JButton btnSuspender;
	private JButton btnCancelar;
	private JLabel lblNewLabel_1;
	private JPanel panel_4;
	private JList listaAsignacion;
	private JButton btnElegir;
	private JPanel panel_6;
	private JPanel panel_5;
	private JLabel lblNewLabel_2;
	private JLabel lblUsername;
	private JList list;
	private JButton btnCrear;
	private JButton btnGestionar;
	private JButton btnLista;
	private JButton btnResultados;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VEmpleado frame = new VEmpleado();
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
	public VEmpleador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 441);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel);
		this.panel.setLayout(new BorderLayout(0, 0));
		
		this.panel_3 = new JPanel();
		this.panel.add(this.panel_3, BorderLayout.SOUTH);
		this.panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.btnModificar = new JButton("Modificar");
		this.btnModificar.setEnabled(false);
		this.panel_3.add(this.btnModificar);
		
		this.btnSuspender = new JButton("Suspender");
		this.btnSuspender.setEnabled(false);
		this.panel_3.add(this.btnSuspender);
		
		this.btnCancelar = new JButton("Cancelar");
		this.btnCancelar.setEnabled(false);
		this.panel_3.add(this.btnCancelar);
		
		this.listTicket = new JList();
		this.listTicket.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panel.add(this.listTicket, BorderLayout.CENTER);
		
		this.lblNewLabel_1 = new JLabel("Tickets Empleados");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel.add(this.lblNewLabel_1, BorderLayout.NORTH);
		
		this.panel_1 = new JPanel();
		this.contentPane.add(this.panel_1);
		this.panel_1.setLayout(new BorderLayout(0, 0));
		
		this.lblNewLabel = new JLabel("EMPLEADOR");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_1.add(this.lblNewLabel, BorderLayout.NORTH);
		
		this.panel_2 = new JPanel();
		this.panel_1.add(this.panel_2, BorderLayout.CENTER);
		this.panel_2.setLayout(new BorderLayout(0, 0));
		
		this.panel_6 = new JPanel();
		this.panel_2.add(this.panel_6, BorderLayout.NORTH);
		this.panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_5 = new JPanel();
		this.panel_6.add(this.panel_5);
		this.panel_5.setLayout(new GridLayout(7, 1, 0, 0));
		
		this.lblNewLabel_2 = new JLabel("USUARIO:");
		this.lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_5.add(this.lblNewLabel_2);
		
		this.lblUsername = new JLabel("");
		this.lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel_5.add(this.lblUsername);
		
		this.btnCrear = new JButton("Crear ticket");
		this.btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnCrear);
		
		this.btnGestionar = new JButton("Gestionar tickets");
		this.btnGestionar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnGestionar);
		
		this.btnLista = new JButton("Lista de Empleadores");
		this.btnLista.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnLista);
		
		this.btnResultados = new JButton("Resultado");
		this.btnResultados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnResultados);
		
		this.list = new JList();
		this.list.setBorder(null);
		this.panel_2.add(this.list, BorderLayout.CENTER);
		
		this.panel_4 = new JPanel();
		this.contentPane.add(this.panel_4);
		this.panel_4.setLayout(new BorderLayout(0, 0));
		
		this.listaAsignacion = new JList();
		this.listaAsignacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.listaAsignacion.addMouseListener(this);
		this.panel_4.add(this.listaAsignacion, BorderLayout.CENTER);
		
		this.btnElegir = new JButton("Elegir");
		this.btnElegir.setEnabled(false);
		this.panel_4.add(this.btnElegir, BorderLayout.SOUTH);
		
		this.lblNewLabel_3 = new JLabel("Lista de Empleados");
		this.lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		this.lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.panel_4.add(this.lblNewLabel_3, BorderLayout.NORTH);
	}

	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (!listaAsignacion.isSelectionEmpty())
			btnElegir.setEnabled(true);
		else
			btnElegir.setEnabled(false);
	}
	public void mouseReleased(MouseEvent e) {
	}
}
