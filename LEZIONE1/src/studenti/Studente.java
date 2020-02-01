package studenti;

import java.util.ArrayList;

/**
 * Descrive l'oggetto Studente
 * @author Serena D'Urso
 *
 */
public class Studente {
	/**
	 * matricola (String) numero unico per ogni studente;
	 * voti (array di double) collezioni di voti dello studente;
	 * media (double) media dei voti dello studente;
	 */
	private String matricola;
	private ArrayList<Double> voti;
	private double media;
	
	/**
	 *Metodo costruttore, permette di creare uno studente senza specificare le generalità
	 */
	public Studente() {
		voti = new ArrayList<Double>();
		matricola = null;
		media = 0.0;
	}
	
	/**
	 * Permette di creare un nuovo oggetto studente specificando solo la matricola di quest'ultimo
	 * @param matricola è di tipo String e contiene la matricola dello studente
	 */
	public Studente(String matricola) {
		voti = new ArrayList<Double>();
		this.matricola = matricola;
		media = 0.0;
	}
	
	/**
	 * Permette di settare la matricola di un oggetto studente
	 * @param matricola è di tipo String e contiene la matricola dello studente. Non può essere vuota.
	 */
	public void setMatricola(String matricola) {
		voti = new ArrayList<Double>();
		this.matricola = matricola;
	}
	
	/**
	 * Ritorna la matricola dell'oggetto studente
	 * @return ritorna la matricola di un determinato oggetto studente
	 */
	public String getMatricola() {
		return this.matricola;
	}
	
	/**
	 * Permette di inserire il voto dell'esame alla collezione
	 * @param voto è di tipo double. Non può essere 0 o minore di 18; Indica il voto ottenuto all'esame
	 */
	public void addEsame(Double voto) {
		voti.add(voto);
		this.media += voto;
	}
	
	/**
	 * Ritorna la media dello studente
	 * @return ritorna la media dei voti dello studente
	 */
	public double media() {
		return (this.media / voti.size());
	}
}
