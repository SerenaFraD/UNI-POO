package cartoline;

import java.util.ArrayList;

public class Cartolina {
	private String testo;
	private ArrayList<String> destinatari;
	
	public Cartolina() {
		testo = null;
		destinatari = new ArrayList<String>();
	}
	
	//Setters
	public void setText(String testo) {
		this.testo = testo;
	}
	
	public void addDestinatario(String nome) {
		destinatari.add(nome);
	}
	
	//Getters
	public String getText() {
		return this.testo;
	}
	
	public ArrayList<String> getDestinatari() {
		return this.destinatari;
	}
}
