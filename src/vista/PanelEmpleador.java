package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import modelo.Empleador;

public class PanelEmpleador extends JPanel implements Observer {
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private Empleador empleador;

	public PanelEmpleador(Empleador empleador) {

		setPreferredSize(new Dimension(300, 300));
		setBorder(
				new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
						new TitledBorder(
								new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
										new Color(160, 160, 160)),
								"Empleador: " + empleador.getNombre(), TitledBorder.LEADING, TitledBorder.TOP, null,
								new Color(0, 0, 0))));
		setLayout(new BorderLayout(0, 0));

		this.scrollPane = new JScrollPane();
		add(this.scrollPane, BorderLayout.CENTER);

		this.textArea = new JTextArea();
		this.scrollPane.setViewportView(this.textArea);

		this.empleador = empleador;
		this.empleador.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o == this.empleador) {
			this.textArea.append(arg + "\n");
		} else
			throw new IllegalArgumentException();

	}
}
