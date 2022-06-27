package vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class VFormulario extends JFrame implements MouseListener, KeyListener {

	private JPanel contentPane;
	private JPanel panelBotones;
	private JPanel panelEleccion;
	private JButton btnEnviar;
	private JLabel lblNewLabel;
	private JPanel panelCant;
	private JPanel panelRadio;
	private JLabel labelCant;
	private JTextField textCant;
	private JPanel panelBoton;
	private JPanel panel;
	private JLabel labelTitulo;
	private JPanel radiobtn;
	private JRadioButton rdbtnPrimario;
	private JRadioButton rdbtnTerciario;
	private JRadioButton rdbtnSecundario;
	private JLabel lblNewLabel_1;
	private JPanel label;
	private JPanel panelLocacion;
	private JPanel label_1;
	private JLabel lblNewLabel_2;
	private JPanel radiobtn_1;
	private JRadioButton rdbtnHomeOffice;
	private JRadioButton rdbtnPresencial;
	private JRadioButton rdbtnIndistinto;
	private JPanel panelRemuneracion;
	private JPanel label_2;
	private JLabel lblNewLabel_3;
	private JPanel radiobtn_2;
	private JRadioButton rdbtnV1;
	private JRadioButton rdbtnV1V2;
	private JRadioButton rdbtnV2;
	private JPanel panelCargaHoraria;
	private JPanel label_3;
	private JLabel lblNewLabel_4;
	private JPanel radiobtn_3;
	private JRadioButton rdbtnMedia;
	private JRadioButton rdbtnCompleta;
	private JRadioButton rdbtnExtendida;
	private JPanel panelPuesto;
	private JPanel label_4;
	private JLabel lblNewLabel_5;
	private JPanel radiobtn_4;
	private JRadioButton rdbtnJunior;
	private JRadioButton rdbtnSenior;
	private JRadioButton rdbtnManagement;
	private JPanel panelRangoEtario;
	private JPanel label_5;
	private JLabel lblRangoEtario;
	private JPanel radiobtn_5;
	private JRadioButton rdbtnE1;
	private JRadioButton rdbtnE2;
	private JRadioButton rdbtnE3;
	private JPanel panelExperiencia;
	private JPanel label_6;
	private JLabel lblNewLabel_7;
	private JPanel radiobtn_6;
	private JRadioButton rdbtnNada;
	private JRadioButton rdbtnEMedia;
	private JRadioButton rdbtnMucha;
	private ActionListener actionlistener;

	// Para que se pueda seleccionar un solo rdbutton de cada aspecto
	private ButtonGroup bgLocacion = new ButtonGroup();
	private ButtonGroup bgRemuneracion = new ButtonGroup();
	private ButtonGroup bgRangoEtario = new ButtonGroup();
	private ButtonGroup bgCargaHoraria = new ButtonGroup();
	private ButtonGroup bgExperiencia = new ButtonGroup();
	private ButtonGroup bgPuesto = new ButtonGroup();
	private ButtonGroup bgEstudios = new ButtonGroup();
	private JPanel panelPesos;
	private JPanel panel_1;
	private JPanel panel_3;
	private JLabel lblNewLabel_8;
	private JTextField textPLocacion;
	private JPanel panel_4;
	private JLabel lblNewLabel_9;
	private JTextField textPRemuneracion;
	private JPanel panel_5;
	private JLabel lblNewLabel_10;
	private JTextField textPCargaH;
	private JPanel panel_6;
	private JLabel lblNewLabel_11;
	private JTextField textPPuesto;
	private JPanel panel_7;
	private JLabel lblNewLabel_12;
	private JTextField textPRangoE;
	private JPanel panel_8;
	private JLabel lblNewLabel_13;
	private JTextField textPExperiencia;
	private JPanel panel_9;
	private JLabel lblNewLabel_14;
	private JTextField textPEstudios;
	private JLabel lblNewLabel_6;

	public VFormulario() {
		setTitle("SISTEMA DE BUSQUEDA LABORAL");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 473);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		this.panelBotones = new JPanel();
		this.contentPane.add(this.panelBotones, BorderLayout.SOUTH);
		this.panelBotones.setLayout(new GridLayout(0, 3, 0, 0));

		this.lblNewLabel = new JLabel("");
		this.panelBotones.add(this.lblNewLabel);

		this.panelBoton = new JPanel();
		this.panelBotones.add(this.panelBoton);

		this.btnEnviar = new JButton("Enviar");
		this.btnEnviar.setActionCommand("ENVIAR");
		this.btnEnviar.setEnabled(false);
		this.panelBoton.add(this.btnEnviar);

		this.panelEleccion = new JPanel();
		this.contentPane.add(this.panelEleccion, BorderLayout.CENTER);
		this.panelEleccion.setLayout(new BorderLayout(0, 0));

		this.panelCant = new JPanel();
		this.panelEleccion.add(this.panelCant, BorderLayout.SOUTH);
		this.panelCant.setLayout(new GridLayout(0, 2, 0, 0));

		this.labelCant = new JLabel("Cantidad de empleados solicitados");
		this.labelCant.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelCant.add(this.labelCant);

		this.textCant = new JTextField();
		this.textCant.addKeyListener(this);
		this.textCant.setHorizontalAlignment(SwingConstants.LEFT);
		this.textCant.setEnabled(false);
		this.panelCant.add(this.textCant);
		this.textCant.setColumns(10);

		this.panelRadio = new JPanel();
		this.panelEleccion.add(this.panelRadio, BorderLayout.CENTER);
		this.panelRadio.setLayout(new GridLayout(7, 1, 0, 0));

		this.panelLocacion = new JPanel();
		this.panelRadio.add(this.panelLocacion);
		this.panelLocacion.setLayout(new GridLayout(2, 0, 0, 0));

		this.label_1 = new JPanel();
		this.panelLocacion.add(this.label_1);
		this.label_1.setLayout(new GridLayout(0, 1, 0, 0));

		this.lblNewLabel_2 = new JLabel("LOCACION");
		this.lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		this.lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		this.label_1.add(this.lblNewLabel_2);

		this.radiobtn_1 = new JPanel();
		this.panelLocacion.add(this.radiobtn_1);
		this.radiobtn_1.setLayout(new GridLayout(0, 3, 0, 0));

		this.rdbtnHomeOffice = new JRadioButton("Home Office");
		this.rdbtnHomeOffice.addMouseListener(this);
		this.rdbtnHomeOffice.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_1.add(this.rdbtnHomeOffice);
		this.bgLocacion.add(rdbtnHomeOffice);

		this.rdbtnPresencial = new JRadioButton("Presencial");
		this.rdbtnPresencial.addMouseListener(this);
		this.rdbtnPresencial.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_1.add(this.rdbtnPresencial);
		this.bgLocacion.add(rdbtnPresencial);

		this.rdbtnIndistinto = new JRadioButton("Indistinto");
		this.rdbtnIndistinto.addMouseListener(this);
		this.rdbtnIndistinto.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_1.add(this.rdbtnIndistinto);
		this.bgLocacion.add(rdbtnIndistinto);

		this.panelRemuneracion = new JPanel();
		this.panelRadio.add(this.panelRemuneracion);
		this.panelRemuneracion.setLayout(new GridLayout(2, 0, 0, 0));

		this.label_2 = new JPanel();
		this.panelRemuneracion.add(this.label_2);
		this.label_2.setLayout(new GridLayout(0, 1, 0, 0));

		this.lblNewLabel_3 = new JLabel("REMUNERACION");
		this.lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		this.lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		this.label_2.add(this.lblNewLabel_3);

		this.radiobtn_2 = new JPanel();
		this.panelRemuneracion.add(this.radiobtn_2);
		this.radiobtn_2.setLayout(new GridLayout(0, 3, 0, 0));

		this.rdbtnV1 = new JRadioButton("Baja");
		this.rdbtnV1.addMouseListener(this);
		this.rdbtnV1.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_2.add(this.rdbtnV1);
		this.bgRemuneracion.add(rdbtnV1);

		this.rdbtnV1V2 = new JRadioButton("Media");
		this.rdbtnV1V2.addMouseListener(this);
		this.rdbtnV1V2.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_2.add(this.rdbtnV1V2);
		this.bgRemuneracion.add(rdbtnV1V2);

		this.rdbtnV2 = new JRadioButton("Alta");
		this.rdbtnV2.addMouseListener(this);
		this.rdbtnV2.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_2.add(this.rdbtnV2);
		this.bgRemuneracion.add(rdbtnV2);

		this.panelCargaHoraria = new JPanel();
		this.panelRadio.add(this.panelCargaHoraria);
		this.panelCargaHoraria.setLayout(new GridLayout(2, 0, 0, 0));

		this.label_3 = new JPanel();
		this.panelCargaHoraria.add(this.label_3);
		this.label_3.setLayout(new GridLayout(0, 1, 0, 0));

		this.lblNewLabel_4 = new JLabel("CARGA HORARIA");
		this.lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		this.lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 15));
		this.label_3.add(this.lblNewLabel_4);

		this.radiobtn_3 = new JPanel();
		this.panelCargaHoraria.add(this.radiobtn_3);
		this.radiobtn_3.setLayout(new GridLayout(0, 3, 0, 0));

		this.rdbtnMedia = new JRadioButton("Media");
		this.rdbtnMedia.addMouseListener(this);
		this.rdbtnMedia.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_3.add(this.rdbtnMedia);
		this.bgCargaHoraria.add(rdbtnMedia);

		this.rdbtnCompleta = new JRadioButton("Completa");
		this.rdbtnCompleta.addMouseListener(this);
		this.rdbtnCompleta.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_3.add(this.rdbtnCompleta);
		this.bgCargaHoraria.add(rdbtnCompleta);

		this.rdbtnExtendida = new JRadioButton("Extendida");
		this.rdbtnExtendida.addMouseListener(this);
		this.rdbtnExtendida.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_3.add(this.rdbtnExtendida);
		this.bgCargaHoraria.add(rdbtnExtendida);

		this.panelPuesto = new JPanel();
		this.panelRadio.add(this.panelPuesto);
		this.panelPuesto.setLayout(new GridLayout(2, 0, 0, 0));

		this.label_4 = new JPanel();
		this.panelPuesto.add(this.label_4);
		this.label_4.setLayout(new GridLayout(0, 1, 0, 0));

		this.lblNewLabel_5 = new JLabel("TIPO DE PUESTO");
		this.lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		this.lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 15));
		this.label_4.add(this.lblNewLabel_5);

		this.radiobtn_4 = new JPanel();
		this.panelPuesto.add(this.radiobtn_4);
		this.radiobtn_4.setLayout(new GridLayout(0, 3, 0, 0));

		this.rdbtnJunior = new JRadioButton("Junior");
		this.rdbtnJunior.addMouseListener(this);
		this.rdbtnJunior.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_4.add(this.rdbtnJunior);
		this.bgPuesto.add(rdbtnJunior);

		this.rdbtnSenior = new JRadioButton("Senior");
		this.rdbtnSenior.addMouseListener(this);
		this.rdbtnSenior.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_4.add(this.rdbtnSenior);
		this.bgPuesto.add(rdbtnSenior);

		this.rdbtnManagement = new JRadioButton("Management");
		this.rdbtnManagement.addMouseListener(this);
		this.rdbtnManagement.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_4.add(this.rdbtnManagement);
		this.bgPuesto.add(rdbtnManagement);

		this.panelRangoEtario = new JPanel();
		this.panelRadio.add(this.panelRangoEtario);
		this.panelRangoEtario.setLayout(new GridLayout(2, 0, 0, 0));

		this.label_5 = new JPanel();
		this.panelRangoEtario.add(this.label_5);
		this.label_5.setLayout(new GridLayout(0, 1, 0, 0));

		this.lblRangoEtario = new JLabel("RANGO ETARIO");
		this.lblRangoEtario.setEnabled(false);
		this.lblRangoEtario.setHorizontalAlignment(SwingConstants.LEFT);
		this.lblRangoEtario.setFont(new Font("Arial", Font.BOLD, 15));
		this.label_5.add(this.lblRangoEtario);

		this.radiobtn_5 = new JPanel();
		this.panelRangoEtario.add(this.radiobtn_5);
		this.radiobtn_5.setLayout(new GridLayout(0, 3, 0, 0));

		this.rdbtnE1 = new JRadioButton("Menos de 40");
		this.rdbtnE1.addMouseListener(this);
		this.rdbtnE1.setEnabled(false);
		this.rdbtnE1.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_5.add(this.rdbtnE1);
		this.bgRangoEtario.add(rdbtnE1);

		this.rdbtnE2 = new JRadioButton("Entre 40 y 50");
		this.rdbtnE2.addMouseListener(this);
		this.rdbtnE2.setEnabled(false);
		this.rdbtnE2.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_5.add(this.rdbtnE2);
		this.bgRangoEtario.add(rdbtnE2);

		this.rdbtnE3 = new JRadioButton("Mas de 50");
		this.rdbtnE3.addMouseListener(this);
		this.rdbtnE3.setEnabled(false);
		this.rdbtnE3.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_5.add(this.rdbtnE3);
		this.bgRangoEtario.add(rdbtnE3);

		this.panelExperiencia = new JPanel();
		this.panelRadio.add(this.panelExperiencia);
		this.panelExperiencia.setLayout(new GridLayout(2, 0, 0, 0));

		this.label_6 = new JPanel();
		this.panelExperiencia.add(this.label_6);
		this.label_6.setLayout(new GridLayout(0, 1, 0, 0));

		this.lblNewLabel_7 = new JLabel("EXPERIENCIA PREVIA");
		this.lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		this.lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 15));
		this.label_6.add(this.lblNewLabel_7);

		this.radiobtn_6 = new JPanel();
		this.panelExperiencia.add(this.radiobtn_6);
		this.radiobtn_6.setLayout(new GridLayout(0, 3, 0, 0));

		this.rdbtnNada = new JRadioButton("Nada");
		this.rdbtnNada.addMouseListener(this);
		this.rdbtnNada.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_6.add(this.rdbtnNada);
		this.bgExperiencia.add(rdbtnNada);

		this.rdbtnEMedia = new JRadioButton("Media");
		this.rdbtnEMedia.addMouseListener(this);
		this.rdbtnEMedia.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_6.add(this.rdbtnEMedia);
		this.bgExperiencia.add(rdbtnEMedia);

		this.rdbtnMucha = new JRadioButton("Mucha");
		this.rdbtnMucha.addMouseListener(this);
		this.rdbtnMucha.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_6.add(this.rdbtnMucha);
		this.bgExperiencia.add(rdbtnMucha);

		JPanel panelRemuneracion9 = new JPanel();
		this.panelRadio.add(panelRemuneracion9);
		panelRemuneracion9.setLayout(new GridLayout(2, 0, 0, 0));

		this.label = new JPanel();
		panelRemuneracion9.add(this.label);
		this.label.setLayout(new GridLayout(0, 1, 0, 0));

		this.lblNewLabel_1 = new JLabel("ESTUDIOS CURSADOS");
		this.label.add(this.lblNewLabel_1);
		this.lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		this.lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));

		this.radiobtn = new JPanel();
		panelRemuneracion9.add(this.radiobtn);
		this.radiobtn.setLayout(new GridLayout(0, 3, 0, 0));

		this.rdbtnPrimario = new JRadioButton("Primario");
		this.rdbtnPrimario.addMouseListener(this);
		this.rdbtnPrimario.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn.add(this.rdbtnPrimario);
		this.bgEstudios.add(rdbtnPrimario);

		this.rdbtnSecundario = new JRadioButton("Secundario");
		this.rdbtnSecundario.addMouseListener(this);
		this.rdbtnSecundario.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn.add(this.rdbtnSecundario);
		this.bgEstudios.add(rdbtnSecundario);

		this.rdbtnTerciario = new JRadioButton("Terciario");
		this.rdbtnTerciario.addMouseListener(this);
		this.rdbtnTerciario.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn.add(this.rdbtnTerciario);
		this.bgEstudios.add(rdbtnTerciario);

		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.NORTH);

		this.labelTitulo = new JLabel("FORMULARIO DE BUSQUEDA LABORAL");
		this.labelTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		this.labelTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		this.panel.add(this.labelTitulo);

		this.panelPesos = new JPanel();
		this.contentPane.add(this.panelPesos, BorderLayout.EAST);
		this.panelPesos.setLayout(new BorderLayout(0, 0));

		this.panel_1 = new JPanel();
		this.panelPesos.add(this.panel_1);
		this.panel_1.setLayout(new GridLayout(7, 0, 0, 0));

		this.panel_3 = new JPanel();
		this.panel_1.add(this.panel_3);
		this.panel_3.setLayout(new GridLayout(2, 1, 0, 0));

		this.lblNewLabel_8 = new JLabel("PESOS");
		this.lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		this.lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		this.panel_3.add(this.lblNewLabel_8);

		this.textPLocacion = new JTextField();
		this.textPLocacion.addKeyListener(this);
		this.textPLocacion.setHorizontalAlignment(SwingConstants.CENTER);
		this.textPLocacion.setText("1");
		this.panel_3.add(this.textPLocacion);
		this.textPLocacion.setColumns(10);

		this.panel_4 = new JPanel();
		this.panel_1.add(this.panel_4);
		this.panel_4.setLayout(new GridLayout(2, 1, 0, 0));

		this.lblNewLabel_9 = new JLabel("");
		this.panel_4.add(this.lblNewLabel_9);

		this.textPRemuneracion = new JTextField();
		this.textPRemuneracion.addKeyListener(this);
		this.textPRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		this.textPRemuneracion.setText("1");
		this.textPRemuneracion.setColumns(10);
		this.panel_4.add(this.textPRemuneracion);

		this.panel_5 = new JPanel();
		this.panel_1.add(this.panel_5);
		this.panel_5.setLayout(new GridLayout(2, 1, 0, 0));

		this.lblNewLabel_10 = new JLabel("");
		this.panel_5.add(this.lblNewLabel_10);

		this.textPCargaH = new JTextField();
		this.textPCargaH.addKeyListener(this);
		this.textPCargaH.setHorizontalAlignment(SwingConstants.CENTER);
		this.textPCargaH.setText("1");
		this.textPCargaH.setColumns(10);
		this.panel_5.add(this.textPCargaH);

		this.panel_6 = new JPanel();
		this.panel_1.add(this.panel_6);
		this.panel_6.setLayout(new GridLayout(2, 1, 0, 0));

		this.lblNewLabel_11 = new JLabel("");
		this.panel_6.add(this.lblNewLabel_11);

		this.textPPuesto = new JTextField();
		this.textPPuesto.addKeyListener(this);
		this.textPPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		this.textPPuesto.setText("1");
		this.textPPuesto.setColumns(10);
		this.panel_6.add(this.textPPuesto);

		this.panel_7 = new JPanel();
		this.panel_1.add(this.panel_7);
		this.panel_7.setLayout(new GridLayout(2, 1, 0, 0));

		this.lblNewLabel_12 = new JLabel("");
		this.panel_7.add(this.lblNewLabel_12);

		this.textPRangoE = new JTextField();
		this.textPRangoE.addKeyListener(this);
		this.textPRangoE.setHorizontalAlignment(SwingConstants.CENTER);
		this.textPRangoE.setText("1");
		this.textPRangoE.setColumns(10);
		this.panel_7.add(this.textPRangoE);

		this.panel_8 = new JPanel();
		this.panel_1.add(this.panel_8);
		this.panel_8.setLayout(new GridLayout(2, 1, 0, 0));

		this.lblNewLabel_13 = new JLabel("");
		this.panel_8.add(this.lblNewLabel_13);

		this.textPExperiencia = new JTextField();
		this.textPExperiencia.addKeyListener(this);
		this.textPExperiencia.setHorizontalAlignment(SwingConstants.CENTER);
		this.textPExperiencia.setText("1");
		this.textPExperiencia.setColumns(10);
		this.panel_8.add(this.textPExperiencia);

		this.panel_9 = new JPanel();
		this.panel_1.add(this.panel_9);
		this.panel_9.setLayout(new GridLayout(2, 1, 0, 0));

		this.lblNewLabel_14 = new JLabel("");
		this.panel_9.add(this.lblNewLabel_14);

		this.textPEstudios = new JTextField();
		this.textPEstudios.addKeyListener(this);
		this.textPEstudios.setHorizontalAlignment(SwingConstants.CENTER);
		this.textPEstudios.setText("1");
		this.textPEstudios.setColumns(10);
		this.panel_9.add(this.textPEstudios);

		this.lblNewLabel_6 = new JLabel("-");
		this.lblNewLabel_6.setForeground(UIManager.getColor("Button.background"));
		this.lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.panelPesos.add(this.lblNewLabel_6, BorderLayout.SOUTH);
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

	@SuppressWarnings("deprecation")
	public void mouseReleased(MouseEvent e) {
		this.btnEnviar.setEnabled(validar());
	}

	private boolean validar() {
		boolean resp = false;
		resp = (rdbtnHomeOffice.isSelected() || rdbtnPresencial.isSelected() || rdbtnIndistinto.isSelected())
				&& (rdbtnV1.isSelected() || rdbtnV1V2.isSelected() || rdbtnV2.isSelected())
				&& (rdbtnMedia.isSelected() || rdbtnCompleta.isSelected() || rdbtnExtendida.isSelected())
				&& (rdbtnJunior.isSelected() || rdbtnSenior.isSelected() || rdbtnManagement.isSelected())
				&& (!rdbtnE1.isEnabled() || rdbtnE1.isSelected() || rdbtnE2.isSelected() || rdbtnE3.isSelected())
				&& (rdbtnNada.isSelected() || rdbtnMucha.isSelected() || rdbtnEMedia.isSelected())
				&& (rdbtnPrimario.isSelected() || rdbtnSecundario.isSelected() || rdbtnTerciario.isSelected())
				&& !this.textPLocacion.getText().isEmpty() && !this.textPPuesto.getText().isEmpty()
				&& !this.textPCargaH.getText().isEmpty() && !this.textPEstudios.getText().isEmpty()
				&& !this.textPExperiencia.getText().isEmpty() && !this.textPRangoE.getText().isEmpty()
				&& !this.textPRemuneracion.getText().isEmpty() && (!this.textCant.isEnabled()
						|| this.textCant.getText() != null || !this.textCant.getText().isEmpty());
		return resp;
	}

	public void setActionListener(ActionListener actionListener) {
		this.btnEnviar.addActionListener(actionListener);
		this.actionlistener = actionListener;
	}

	public void cerrarse() {
		this.dispose();
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public String getLocacion() {
		return (this.rdbtnHomeOffice.isSelected()) ? "HomeOffice"
				: (this.rdbtnPresencial.isSelected()) ? "Presencial" : "Indistinto";
	}

	public String getRemuneracion() {
		return (this.rdbtnV1.isSelected()) ? "Baja" : (this.rdbtnV1V2.isSelected()) ? "Media" : "Alta";
	}

	public String getCargaHoraria() {
		return (this.rdbtnMedia.isSelected()) ? "Media" : (this.rdbtnCompleta.isSelected()) ? "Completa" : "Extendida";
	}

	public String getPuestoLaboral() {
		return (this.rdbtnJunior.isSelected()) ? "Junior" : (this.rdbtnSenior.isSelected()) ? "Senior" : "Managment";
	}

	public String getRangoEtario() {
		return (this.rdbtnE1.isSelected()) ? "Edad temprana"
				: (this.rdbtnE2.isSelected()) ? "Edad Media" : "Edad Avanzada";
	}

	public String getExperienciaPrevia() {
		return (this.rdbtnNada.isSelected()) ? "Nada" : (this.rdbtnEMedia.isSelected()) ? "Media" : "Mucha";
	}

	public String getEstudios() {
		return (this.rdbtnPrimario.isSelected()) ? "Primario"
				: (this.rdbtnSecundario.isSelected()) ? "Secundario" : "Terciario";
	}

	public int getTextCant() {
		try {
			return Integer.parseInt(this.textCant.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	public double getTextPLocacion() {
		try {
			return Double.parseDouble(this.textPLocacion.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	public double getTextPRemuneracion() {
		try {
			return Double.parseDouble(this.textPRemuneracion.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	public double getTextPCargaH() {
		try {
			return Double.parseDouble(this.textPCargaH.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	public double getTextPPuesto() {
		try {
			return Double.parseDouble(this.textPPuesto.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	public double getTextPRangoE() {
		try {
			return Double.parseDouble(this.textPRangoE.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	public double getTextPExperiencia() {
		try {
			return Double.parseDouble(this.textPExperiencia.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	public double getTextPEstudios() {
		try {
			return Double.parseDouble(this.textPEstudios.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	public void isEmpleador() {
		this.textCant.setEnabled(true);
		this.rdbtnE1.setEnabled(true);
		this.rdbtnE2.setEnabled(true);
		this.rdbtnE3.setEnabled(true);
	}
}