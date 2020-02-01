/*
 * SPIEGAZIONE
*Si inizia con l'implementazione dell'interfaccia publica, cioè penso ai metodi che mi servono
*Scrivo anche il javadoc in contemporanea con la scrittura dell'interfaccia poi scelgo le varibili di istanza implemento;
*/

/**
 *Implementazione della classe Rettangolo simile a Rettangle, usando la classe Punto
 * @author Serena D'Urso
 */
public class Rettangolo {

	/**
	 * vertex (Punto) descrive il punto in alto a sinistra del rettangolo;
	 * width (double) descrive la larghezza del rettangolo;
	 * height (double) descrive l'altezza del rettangolo;
	 */
	private Punto vertex;
	private double width, height;
	
	/**
	 * Metodo costruttore di Rettangolo, istanzia l'oggetto impostando tutti i valori a zero
	 */
	public Rettangolo() {
		vertex = new Punto(0, 0);
		width = 0.0;
		height = 0.0;
	}
	
	/**
	 * Metodo costruttore di Rettangolo, istanzia l'oggetto impostando tutti i valori in base all'input
	 * @param vertex descrive il vertice iniziale, non deve essere null;
	 * @param width larghezza iniziale, non può essere negativa;
	 * @param height altezza iniziale, non può essere negativa;
	 */
	public Rettangolo(Punto vertex, double width, double height) {
		this.vertex = vertex;
		this.width = width;
		this.height = height;
	}
	
	//Getters
	/**
	 * Ritorna il vertice del rettangolo
	 * @return vertex (Punto) dell'oggetto
	 */
	public Punto getVertex() {
		return this.vertex;
	}
	
	/**
	 * Ritorna la larghezza del rettangolo
	 *@return larghezza dell'oggetto
	 */
	public double getWidth() {
		return this.width;
	}
	
	/**
	 * Ritorna l'altezza del rettangolo
	 * @return altezza dell'oggetto
	 */
	public double getHeight() {
		return this.height;
	}
	
	/**
	 * Metodo setter per il vertice
	 * @param punto modifica il vertice dell'oggetto con l'oggetto Punto passato
	 */
	public void setVertex(Punto punto) {
		this.vertex = punto;
	}
	
	/**
	 *Metodo setter per l'altezza
	 *@param height modifica l'altezza dell'oggetto
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Metodo setter per la larghezza
	 * @param width modifica la larghezza dell'oggetto
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Metodo modificatore, trasla un rettangolo di x e y posizioni, usando il metodo pubblico di Punto
	 * @param x double, numero di unità di cui spostarsi sull'ascissa;
	 * @param y double, numero di unità di cui spostarsi sull'ordinata;
	 */
	public void trasla(double x, double y) {
		this.vertex.trasla(x, y);
	}
}



















