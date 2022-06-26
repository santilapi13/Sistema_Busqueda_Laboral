package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Empleado;
import modelo.Empleador;
import java.awt.Color;

public class VSimulacion extends JFrame {

	private JPanel contentPane;
	private JPanel panelOeste;
	private JPanel panel_Arriba;
	private JPanel panel_Abajo;
	private JScrollPane scrollPane;
	private JPanel panel_Centro;
	private JPanel panel_Abajo_1;
	private JScrollPane scrollPane_1;
	private JList<String> list; //
	private JList<String> list_1; //
	private JPanel panel;
	private JPanel panel_1;
	private JButton Iniciar;
	private ActionListener actionListener;
	private DefaultListModel<String> modeloLista = new DefaultListModel<String>();
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private DefaultListModel<String> modeloLista1 = new DefaultListModel<String>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	private JTextField txtEmpleados;
	private JTextField txtEmpleados_1;

	public VSimulacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 676);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);

		this.panelOeste = new JPanel();
		this.panelOeste.setPreferredSize(new Dimension(150, 100));
		this.contentPane.add(this.panelOeste, BorderLayout.WEST);
		this.panelOeste.setLayout(new GridLayout(3, 0, 0, 0));

		this.panel_Arriba = new JPanel();
		this.panelOeste.add(this.panel_Arriba);
		this.panel_Arriba.setLayout(new BorderLayout(0, 0));
		this.list_1 = new JList<String>();
		this.panel_Arriba.add(this.list_1);

		this.panel_Abajo = new JPanel();
		this.panelOeste.add(this.panel_Abajo);
		this.panel_Abajo.setLayout(new BorderLayout(0, 0));

		this.scrollPane_1 = new JScrollPane();
		this.panel_Abajo.add(this.scrollPane_1, BorderLayout.CENTER);

		this.list = new JList<String>();
		this.scrollPane_1.setViewportView(this.list);

		this.panel_Abajo_1 = new JPanel();
		this.panelOeste.add(this.panel_Abajo_1);

		this.panel = new JPanel();
		this.panel_Abajo_1.add(this.panel);
		this.panel.setLayout(new GridLayout(0, 1, 0, 0));

		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1);

		this.Iniciar = new JButton("Iniciar");
		this.panel_1.add(this.Iniciar);

		this.scrollPane = new JScrollPane();
		this.contentPane.add(this.scrollPane, BorderLayout.CENTER);

		this.panel_Centro = new JPanel();
		this.scrollPane.setViewportView(this.panel_Centro);
		this.panel_Centro.setLayout(new GridLayout(0, 5, 6, 6));
		this.list.setModel(modeloLista);

		this.txtEmpleados_1 = new JTextField();
		this.txtEmpleados_1.setText("Empleados");
		this.txtEmpleados_1.setForeground(Color.RED);
		this.panel_Abajo.add(this.txtEmpleados_1, BorderLayout.NORTH);
		this.txtEmpleados_1.setColumns(10);
		this.list_1.setModel(modeloLista1);

		this.txtEmpleados = new JTextField();
		this.txtEmpleados.setForeground(Color.RED);
		this.txtEmpleados.setText("Empleadores");
		this.panel_Arriba.add(this.txtEmpleados, BorderLayout.NORTH);
		this.txtEmpleados.setColumns(10);
	}

	public void setActionListener(ActionListener actionListener) {
		this.Iniciar.addActionListener(actionListener);
		this.actionListener = actionListener;
	}

	public void agregoListaEmpleado(Empleado e) {
		if (this.empleados.contains(e))
			this.empleados.remove(e);
		this.empleados.add(e);
		this.panel_Centro.add(new PanelEmpleado(e));
		this.modeloLista.addElement(e.getNya());
		this.empleados.add(e);
		this.validate();
	}

	public void agregoListaEmpleadores(Empleador e) {
		if (this.empleadores.contains(e))
			this.empleadores.remove(e);
		this.empleadores.add(e);
		this.panel_Centro.add(new PanelEmpleador(e));
		this.modeloLista1.addElement(e.getNombre());
		this.empleadores.add(e);
		this.validate();
	}

	public void setEnabledFalse() {
		Iniciar.setEnabled(false);
	}

}
