package package3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import package1.Autore;
import package2.EstrattoreData;

public class EstrattoreFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 400;
	private static final int ROWS = 10;
	private static final int COLUMNS = 30;
	
	JTextArea text;

	public EstrattoreFrame() {
		super();
		this.setTitle("Estrai");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setLocation(600,  100);
		
		JPanel controlPanel = createControlPanel();
		this.add(controlPanel);	
	}

	public JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		
		JPanel buttonPanel = createButtonPanel();
		JPanel textPanel = createTextPanel();

		controlPanel.setLayout(new BorderLayout(1, 2));
		controlPanel.add(buttonPanel, BorderLayout.WEST);
		controlPanel.add(textPanel, BorderLayout.EAST);

		return controlPanel;
	}

	public JPanel createButtonPanel() {
		JPanel buttonPanel = new JPanel();
		
		JButton libri = new JButton("Libri");
		JButton autori = new JButton("Autori");
		
		/*Lambda expression*/
		autori.addActionListener((eventoBottonePremuto) -> {				
				/**Creo un'array di autori*/
				ArrayList<Object> list = new ArrayList<Object>();
				list.add(new Autore("Serena", "AA", "1999-10-02"));
				list.add(new Autore("Costanzo", "BB", "1997-12-12"));
				list.add(new Autore("Marina", "CC", "1992-10-17"));
				list.add(new Autore("Ulisse", "DD", "2014-05-31"));
				
				ArrayList<String> result = EstrattoreData.stringheEstratte(list);
				
				text.append("<----- Autori ----->\n");
				
				for(String s : result) {
					System.out.println(s);
					text.append(s + "\n");                     
				}
				
				text.append("<------------------->");
				
		});
		
		libri.addActionListener((eventoBottonePremuto) -> {				
			/**Creo un'array di autori, ma dovrebbero essere libriCatalogati*/
			ArrayList<Object> list = new ArrayList<Object>();
			list.add(new Autore("Serena", "MyssKeta", "1999-10-02"));
			list.add(new Autore("Costanzo", "PortaVenezia", "1997-12-12"));
			list.add(new Autore("Marina", "Camalow", "1992-10-17"));
			list.add(new Autore("Ulisse", "Miuccia", "2014-05-31"));
			
			ArrayList<String> result = EstrattoreData.stringheEstratte(list);
			
			for(String s : result) {
				System.out.println(s);
				text.append(s + "\n");                     
			}
		});

		buttonPanel.setLayout(new GridLayout(2, 1));
		buttonPanel.add(libri);
		buttonPanel.add(autori);
		
		return buttonPanel;
	}

	public JPanel createTextPanel() {
		JPanel textPanel = new JPanel();
		text = new JTextArea(ROWS, COLUMNS);
		JScrollPane scrollPane = new JScrollPane(text);

		text.setEditable(true);

		textPanel.add(scrollPane);
	
		return textPanel;
	}
}
