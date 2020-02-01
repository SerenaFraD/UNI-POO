package package3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.bind.Marshaller.Listener;

import package1.Automezzo;
import package1.GeneratoreTarghe;
import package1.Libretto;

public class TesterFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 500;
	private static final int HEIGHT = 400;
	private Libretto libretto;

	public TesterFrame() {
		super();

		this.setTitle("Tester");
		this.setSize(WIDTH, HEIGHT);
		this.add(controlPanel());
	}

	private JPanel controlPanel() {
		JPanel controlPanel = new JPanel();

		controlPanel.setLayout(new BorderLayout());
		controlPanel.add(nuovoAutomezzo(), BorderLayout.NORTH);
		// controlPanel.add(modificaAutomezzo(), BorderLayout.CENTER);

		return controlPanel;
	}

	private JPanel nuovoAutomezzo() {
		JPanel nAuto = new JPanel();
		nAuto.setBackground(Color.RED);
		nAuto.setPreferredSize(new Dimension(500, 300));

		JLabel desc = new JLabel("Descrizione");
		JTextArea descrizione = new JTextArea();
		descrizione.setPreferredSize(new Dimension(200, 24));

		nAuto.add(creazioneLibretto());

		JTextArea risultato = new JTextArea();
		risultato.setPreferredSize(new Dimension(400, 24));
		
		JButton avanti = new JButton("Avanti");
		/*
		//Classe anonima
		ActionListener listner = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String desStr = descrizione.getText();

				if (desStr != "" || desStr != null) {
					descrizione.setText(" ");

					Automezzo auto = new Automezzo(new GeneratoreTarghe().getTarga(), libretto, desStr);
					risultato.append(libretto.toString());
					risultato.append(auto.toString());
				}
			}
		};
		
		
		//Classe interna
		class Listener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				String desStr = descrizione.getText();

				if (desStr != "" || desStr != null) {
					descrizione.setText(" ");

					Automezzo auto = new Automezzo(new GeneratoreTarghe().getTarga(), libretto, desStr);
					risultato.append(libretto.toString());
					risultato.append(auto.toString());
				}
			}
			
		}

		ActionListener listener = new Listener();
		
		*/
		
		//Espressione lambda
		avanti.addActionListener((ActionListener) listener -> {
			String desStr = descrizione.getText();

			if (desStr != "" || desStr != null) {
				descrizione.setText(" ");

				Automezzo auto = new Automezzo(new GeneratoreTarghe().getTarga(), libretto, desStr);
				risultato.append(libretto.toString());
				risultato.append(auto.toString());
			}
		});
		
		nAuto.add(desc);
		nAuto.add(descrizione);
		nAuto.add(avanti);
		nAuto.add(risultato);

		return nAuto;
	}

	private JPanel creazioneLibretto() {
		JPanel lib = new JPanel();
		lib.setBackground(Color.BLUE);
		lib.setPreferredSize(new Dimension(480, 100));

		JLabel libLabel = new JLabel("Libretto");

		JLabel inteLabel = new JLabel("Intestatario");
		inteLabel.setPreferredSize(new Dimension(80, 24));
		JTextField intestatario = new JTextField();
		intestatario.setPreferredSize(new Dimension(100, 24));

		JLabel descLabel = new JLabel("Descrizione");
		descLabel.setPreferredSize(new Dimension(70, 24));
		JTextField descrizione = new JTextField();
		descrizione.setPreferredSize(new Dimension(100, 24));

		JButton avanti = new JButton("Avanti");

		JTextArea risultato = new JTextArea();
		risultato.setPreferredSize(new Dimension(400, 30));
		risultato.setEditable(false);

		ActionListener listner = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String intStr = intestatario.getText();
				String desStr = descrizione.getText();

				if ((intStr != "" && desStr != "") || (intStr != null && desStr != null)) {
					intestatario.setText(" ");
					descrizione.setText(" ");

					libretto = new Libretto(intStr, desStr);
					risultato.append(libretto.toString());
				}
			}
		};

		avanti.addActionListener(listner);

		lib.add(libLabel);
		lib.add(inteLabel);
		lib.add(intestatario);
		lib.add(descLabel);
		lib.add(descrizione);
		lib.add(avanti);
		lib.add(risultato);

		return lib;
	}
}
