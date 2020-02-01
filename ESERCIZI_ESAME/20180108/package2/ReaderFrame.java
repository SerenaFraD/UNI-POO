package package2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReaderFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;
	private File file;
	private BufferedReader reader;
	private JMenuItem apri;
	private JTextArea textArea;
	private int contoAvanti = 0;
	private int contoIndietro = 0;

	public ReaderFrame() throws Exception {
		super();

		this.setSize(WIDTH, HEIGHT);
		this.setTitle("Reader");
		this.add(ControlPanel());
	}

	private JPanel ControlPanel() throws FileNotFoundException {
		JPanel controlPanel = new JPanel();

		controlPanel.setLayout(new BorderLayout());
		controlPanel.add(MenuPanel(), BorderLayout.WEST);
		controlPanel.add(TextPanel(), BorderLayout.CENTER);
		controlPanel.add(ArrowPanel(), BorderLayout.SOUTH);

		return controlPanel;
	}

	private JPanel ArrowPanel() throws FileNotFoundException {
		JPanel arrowPanel = new JPanel();

		JButton indietro = new JButton("<<<");
		JButton avanti = new JButton(">>>");

		ActionListener procedi = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
				contoAvanti++;
					
				String line;
		
				try {
					for(int index = 0; index < 10; index++) {
						if((line = reader.readLine()) != null)
							textArea.append(line + "\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}				
			}
		};

		avanti.addActionListener(procedi);

		ActionListener indietreggia = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(contoAvanti - contoIndietro == 0)
					return;
				
				textArea.setText("");
				contoIndietro++;
				
				String line;
				try {
					reader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				try {
					reader = new BufferedReader(new FileReader(file), 40);
					
					try {
						for(int npag = 0; npag < contoAvanti - contoIndietro; npag++) {
							for(int index = 0; index < 10; index++) {
								if((line = reader.readLine()) != null)
									textArea.append(line + "\n");
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}	
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
							
			}
		};
		
		indietro.addActionListener(indietreggia);
		
		arrowPanel.add(indietro);
		arrowPanel.add(avanti);

		return arrowPanel;
	}

	private JPanel TextPanel() {
		JPanel textPanel = new JPanel();

		textArea = new JTextArea(10, 40);

		textArea.setEditable(false);

		textPanel.add(textArea);

		return textPanel;
	}

	private JPanel MenuPanel() {
		JPanel menuPanel = new JPanel();

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		apri = new JMenuItem("Apri");
		JMenuItem exit = new JMenuItem("Exit");

		menuBar.add(menu);

		ActionListener aperto = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");

				file = new File("testo.txt");

				if (!file.exists()) {
					textArea.append("File inesistente\n");
					try {
						file.createNewFile();
						PrintWriter out = new PrintWriter(new FileOutputStream(file));

						out.println("1qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("2qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("3qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("4qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("5qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("6qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("7qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("8qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("9qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
						out.println("10qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");

						out.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				} else
					textArea.append("File creato");

				try {
					reader = new BufferedReader(new FileReader(file), 40);
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}
			}
		};

		apri.addActionListener(aperto);

		ActionListener chiudo = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");

				textArea.append("Sto chiudendo bitch\n");
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return;
			}
		};

		exit.addActionListener(chiudo);

		menu.add(apri);
		menu.add(exit);

		menuPanel.add(menuBar);

		return menuPanel;
	}

}
