package cartoline;

import java.util.ArrayList;

public class TesterCartolina {

	public static void main(String[] args) {
		ArrayList<String> destinatari;
		
		System.out.println("Istanzio una nuova cartolina da inviare\n");
		Cartolina c = new Cartolina();
		
		System.out.println("Inserisco il testo da inviare: Ciao, caro amico!\n");
		c.setText("Ciao, caro amico!");
		System.out.println("Inserisco i destinatari: Mario e Antonella");
		c.addDestinatario("Mario");
		c.addDestinatario("Antonella");
		
		System.out.println("Il testo inserito è: " + c.getText() + "\n");
		System.out.println("I destinatari sono: ");
		destinatari = c.getDestinatari();
		
		for(String d : destinatari) {
			System.out.println(d);
		}
	}

}
