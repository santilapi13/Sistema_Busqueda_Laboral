package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import modelo.ElemLA;
import modelo.Empleado;
import modelo.Empleador;
import modelo.ListaAsignacion;
import modelo.Ticket;
import modelo.TicketEmpleo;

public class VEmpleado extends JFrame implements MouseListener, IVistaUsuario {

	private JPanel principal;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnModificar;
	private JButton btnSuspender;
	private JButton btnCancelar;
	private JLabel lblNewLabel_1;
	private JPanel panel_4;
	private JList<ElemLA> listAsignacion;
	private JButton btnElegir;
	private JLabel lblNewLabel_2;
	private JPanel panel_5;
	private JLabel lblUsername;
	private JButton btnBuscar;
	private JButton btnGestionar;
	private JButton btnLista;
	private JButton btnResultado;
	private JLabel lblNewLabel_3;
	private ActionListener actionListener;
	private JButton btnSalir;
	private JScrollPane scrollPane;
	private JList<String> listNoti;
	private JLabel lblNewLabel_4;
	private JScrollPane scrollPane_1;
	private JList<TicketEmpleo> listTicket;
	private DefaultListModel<TicketEmpleo> modeloListaTicket = new DefaultListModel<TicketEmpleo>();
	private DefaultListModel<ElemLA> modeloListaAsignacion = new DefaultListModel<ElemLA>();

	/**
	 * Create the frame.
	 */
	public VEmpleado(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 441);
		this.principal = new JPanel();
		this.principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane = new JPanel();
		setContentPane(this.principal);
		this.principal.setLayout(new BorderLayout(0, 0));
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.principal.add(this.contentPane, BorderLayout.CENTER);
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

		this.lblNewLabel_1 = new JLabel("Ticket Empleo");
		this.lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel.add(this.lblNewLabel_1, BorderLayout.NORTH);

		this.scrollPane_1 = new JScrollPane();
		this.panel.add(this.scrollPane_1, BorderLayout.CENTER);

		this.listTicket = new JList<TicketEmpleo>();
		this.listTicket.addMouseListener(this);
		this.scrollPane_1.setViewportView(this.listTicket);

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

		this.lblUsername = new JLabel(username);
		this.lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_5.add(this.lblUsername);

		this.btnBuscar = new JButton("Buscar empleo");
		this.btnBuscar.setActionCommand("Buscar");
		this.btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnBuscar);

		this.btnGestionar = new JButton("Gestionar ticket ");
		this.btnGestionar.setActionCommand("Gestionar");
		this.btnGestionar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnGestionar);

		this.btnLista = new JButton("Lista de Empleadores");
		this.btnLista.setActionCommand("Lista Asignacion");
		this.btnLista.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnLista);

		this.btnResultado = new JButton("Resultado");
		this.btnResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnResultado);

		this.btnSalir = new JButton("Salir");
		this.btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.panel_5.add(this.btnSalir);

		this.panel_4 = new JPanel();
		this.contentPane.add(this.panel_4);
		this.panel_4.setLayout(new BorderLayout(0, 0));

		this.listAsignacion = new JList<ElemLA>();
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

		this.scrollPane = new JScrollPane();
		this.principal.add(this.scrollPane, BorderLayout.SOUTH);

		this.listNoti = new JList<String>();
		this.scrollPane.setViewportView(this.listNoti);

		this.lblNewLabel_4 = new JLabel("Notificaciones");
		this.lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.scrollPane.setColumnHeaderView(this.lblNewLabel_4);
		this.listTicket.setModel(modeloListaTicket);
		this.listAsignacion.setModel(modeloListaAsignacion);

		this.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {
		if (!this.listAsignacion.isSelectionEmpty())
			btnElegir.setEnabled(true);
		else
			btnElegir.setEnabled(false);

		if (!this.listTicket.isSelectionEmpty()) {
			this.btnModificar.setEnabled(true);
			this.btnSuspender.setEnabled(true);
			this.btnCancelar.setEnabled(true);
		} else {
			this.btnModificar.setEnabled(false);
			this.btnSuspender.setEnabled(false);
			this.btnCancelar.setEnabled(false);
		}
	}

	@Override
	public void setActionListener(ActionListener actionListener) {
		this.btnBuscar.addActionListener(actionListener);
		this.btnCancelar.addActionListener(actionListener);
		this.btnElegir.addActionListener(actionListener);
		this.btnGestionar.addActionListener(actionListener);
		this.btnLista.addActionListener(actionListener);
		this.btnModificar.addActionListener(actionListener);
		this.btnResultado.addActionListener(actionListener);
		this.btnSalir.addActionListener(actionListener);
		this.btnSuspender.addActionListener(actionListener);
		this.actionListener = actionListener;

	}

	@Override
	public void cerrarse() {
		this.dispose();
	}

	@Override
	public void actualizarListaEmpleados(ArrayList<Empleado> empleados) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarListaEmpleadores(ArrayList<Empleador> empleadores) {
		// TODO Auto-generated method stub

	}

	@Override
	public void informar(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarSoliEmpleo(ArrayList<Empleado> empleados) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarSoliEmpleados(ArrayList<Empleador> empleadores) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUsername() {
		return this.lblUsername.getText();
	}

	@Override
	public void actualizarTicket(TicketEmpleo ticket) {
		this.modeloListaTicket.removeAllElements();
		this.modeloListaTicket.addElement(ticket);
		this.validate();
	}

	@Override
	public void actualizarListaAsignacion(ListaAsignacion listaAsignacion) {
		this.modeloListaAsignacion.removeAllElements();
		for (ElemLA elementoAct : listaAsignacion.getUsuarios())
			this.modeloListaAsignacion.addElement(elementoAct);
		this.validate();
	}

	@Override
	public Ticket getTicketSeleccionado() {
		return this.listTicket.getSelectedValue();
	}

	@Override
	public ElemLA getElemLASeleccionado() {
		return this.listAsignacion.getSelectedValue();
	}

	@Override
	public void actualizarTickets(Empleador empleador) {
		// TODO Auto-generated method stub
		
	}
}
