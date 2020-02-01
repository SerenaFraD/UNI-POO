/*SPIEGAZIONE
 * Non si deve mettere il main nelle astrazioni.
 * Non biosgna mettere stampe o letture. Gli oggetti interagiscono solo con altri oggetti e non con l'utente.
 */

/**
 * @author Serena D'Urso
 *Classe Punto descrive un punto nello spazio tramite l'ascissa e l'ordinata
 */
public class Punto {
	
	/**
	 * ascissa è di tipo double e descrive lo spiazzamento di un punto sull'asse x;
	 * ordianta è di tipo double e descrive lo spiazzamento di un punto sull'asse y;
	 */
	private double ascissa;
	private double ordinata;
	
	//Metodi costruttori
	/**
	 * Costruttore standard, senza assegnazione di valore
	 */
	public Punto() {
		ascissa = 0.0;
		ordinata = 0.0;
	}
	
	/**
	 * Costruttore con asseganzione di entrambi i valori
	 * @param x double, descrive la posizione iniziale del punto su asse x;
	 * @param y	double, descrive la posizione iniziale del punto su asse y;
	 */
	public Punto(double x, double y) {
		ascissa = x;
		ordinata = y;
	}
	
	/**
	 * Costruttore che prende solo ordinata per far funzionare il programma su una retta
	 * @param x double, descrive la posizione iniziale del punto su asse x;
	 */
	public Punto(double x) {
		ascissa = x;
	}
	
	//Metodi getters
	/**
	 * @return ascissa dell'oggetto su cui si sta lavorando;
	 */
	public double getAscissa() {
		return this.ascissa;
	}
	
	/**
	 * @return ordinata dell'oggetto su cui si sta lavorando;
	 */
	public double getOrdinata() {
		return this.ordinata;
	}
	
	//Metodi setters
	/**
	 * Setta x
	 * @param x double, è il valore preso in input che va a modificare l'ascissa dell'oggetto;
	 */
	public void setAscissa(double x) {
		this.ascissa = x;
	}
	
	/**
	 * Setta y
	 * @param y double, è il valore preso in input che va a modificare l'ordinata dell'oggetto;
	 */
	public void setOrdinata(double y) {
		this.ordinata = y;
	}
	
	//Altri metodi
	/**
	 * Trasla un punto di x e y unità
	 * @param x double, indica lo spostamento dell'ascissa di x unità;
	 * @param y double, indica lo spostamento dell'ordinata di y unità;
	 */
	public void trasla(double x, double y ) {
		this.ascissa += x;
		this.ordinata += y;
	}	
}
