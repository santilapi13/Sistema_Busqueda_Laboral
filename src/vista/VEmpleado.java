package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class VEmpleado extends JFrame implements MouseListener,IVistaUsuario {

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
	private JList listAsignacion;
	private JButton btnElegir;
	private JLabel lblNewLabel_2;
	private JPanel panel_5;
	private JLabel lblUsername;
	private JButton btnBuscar;
	private JButton btnGestionar;
	private JButton btnLista;
	private JButton btnResultado;
	private JList listResultado;
	private JLabel lblNewLabel_3;
	private ActionListener actionListener;

	/**
	 * Create the frame.
	 */
	public VEmpleado() {
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
		
		this.lblNewLabel_1 = new JLabel("Ticket Empleo");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel.add(this.lblNewLabel_1, BorderLayout.NORTH);
		
		this.panel_1 = new JPanel();
		this.contentPane.add(this.panel_1);
		this.panel_1.setLayout(new BorderLayout(0, 0));
		
		this.lblNewLabel = new JLabel("EMPLEADO");
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_1.add(this.lblNewLabel, BorderLayout.NORTH);
		
		this.panel_2 = new JPanel();
		this.panel_1.add(this.panel_2, BorderLayout.CENTER);
		this.panel_2.setLayout(new BorderLayout(0, 0));
		
		this.panel_5 = new JPanel();
		this.panel_2.add(this.panel_5, BorderLayout.NORTH);
		this.panel_5.setLayout(new GridLayout(7, 1, 0, 0));
		
		this.lblNewLabel_2 = new JLabel("USUARIO:");
		this.panel_5.add(this.lblNewLabel_2);
		this.lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.lblUsername = new JLabel("");
		this.lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_5.add(this.lblUsername);
		
		this.btnBuscar = new JButton("Buscar empleo");
		this.btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnBuscar);
		
		this.btnGestionar = new JButton("Gestionar ticket ");
		this.btnGestionar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnGestionar);
		
		this.btnLista = new JButton("Lista de Empleadores");
		this.btnLista.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnLista);
		
		this.btnResultado = new JButton("Resultado");
		this.btnResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnResultado);
		
		this.listResultado = new JList();
		this.panel_2.add(this.listResultado, BorderLayout.CENTER);
		
		this.panel_4 = new JPanel();
		this.contentPane.add(this.panel_4);
		this.panel_4.setLayout(new BorderLayout(0, 0));
		
		this.listAsignacion = new JList();
		this.listAsignacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.listAsignacion.addMouseListener(this);
		this.panel_4.add(this.listAsignacion, BorderLayout.CENTER);
		
		this.btnElegir = new JButton("Elegir");
		this.btnElegir.setEnabled(false);
		this.panel_4.add(this.btnElegir, BorderLayout.SOUTH);
		
		this.lblNewLabel_3 = new JLabel("Lista de Empleadores");
		this.lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_4.add(this.lblNewLabel_3, BorderLayout.NORTH);
		this.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (!listAsignacion.isSelectionEmpty())
			btnElegir.setEnabled(true);
		else
			btnElegir.setEnabled(false);
	}
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.actionListener = actionListener;
		
	}

	@Override
	public void cerrarse() {
		this.dispose();
	}
}
