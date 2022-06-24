package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class VFormulario extends JFrame implements MouseListener{

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
	private JRadioButton rdbtnVCompleta;
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

	//Para que se pueda seleccionar un solo rdbutton de cada aspecto
	private ButtonGroup bgLocacion = new ButtonGroup();
	private ButtonGroup bgRemuneracion = new ButtonGroup();
	private ButtonGroup bgRangoEtario = new ButtonGroup();
	private ButtonGroup bgCargaHoraria = new ButtonGroup();
	private ButtonGroup bgExperiencia = new ButtonGroup();
	private ButtonGroup bgPuesto = new ButtonGroup();
	private ButtonGroup bgEstudios= new ButtonGroup();
	
	public VFormulario() {
		setTitle("SISTEMA DE BUSQUEDA LABORAL");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 473);
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

		this.rdbtnV1 = new JRadioButton("Hasta V1");
		this.rdbtnV1.addMouseListener(this);
		this.rdbtnV1.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_2.add(this.rdbtnV1);
		this.bgRemuneracion.add(rdbtnV1);
		
		this.rdbtnV1V2 = new JRadioButton("Entre V1 y V2");
		this.rdbtnV1V2.addMouseListener(this);
		this.rdbtnV1V2.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_2.add(this.rdbtnV1V2);
		this.bgRemuneracion.add(rdbtnV1V2);
		
		this.rdbtnV2 = new JRadioButton("Mas de V2");
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
		
		this.rdbtnVCompleta = new JRadioButton("Completa");
		this.rdbtnVCompleta.addMouseListener(this);
		this.rdbtnVCompleta.setFont(new Font("Arial", Font.PLAIN, 12));
		this.radiobtn_3.add(this.rdbtnVCompleta);
		this.bgCargaHoraria.add(rdbtnVCompleta);
		
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
		boolean resp=false;
		resp= (rdbtnHomeOffice.isSelected()||rdbtnPresencial.isSelected()||rdbtnIndistinto.isSelected())
				&& (rdbtnV1.isSelected()||rdbtnV1V2.isSelected()||rdbtnV2.isSelected())
				&& (rdbtnMedia.isSelected()||rdbtnVCompleta.isSelected()||rdbtnExtendida.isSelected())
				&& (rdbtnJunior.isSelected()||rdbtnSenior.isSelected()||rdbtnManagement.isSelected())
				&& (!rdbtnE1.isEnabled()||rdbtnE1.isSelected()||rdbtnE2.isSelected()||rdbtnE3.isSelected())
				&& (rdbtnNada.isSelected()||rdbtnMucha.isSelected()||rdbtnEMedia.isSelected())
				&& (rdbtnPrimario.isSelected()||rdbtnSecundario.isSelected()||rdbtnTerciario.isSelected());
		return resp;
	}
	public void actionPerformed(ActionEvent e) {
	}
}