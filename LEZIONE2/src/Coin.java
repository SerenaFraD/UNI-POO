/**
 * Implementazione della classe Coin che identifica un oggetto moneta
 * @author Serena D'Urso
 */
public class Coin {
	
	private String nome; 
	private double valore;
	
	/**
	 * Metodo costruttore, crea un oggetto con il valore di una moneta e il suo nome
	 * @param unValore
	 * @param unNome
	 */
	public Coin(double unValore, String unNome) { 
		nome = unNome; 
		valore = unValore; 
	}
	
	/**
	 * Restituisce il nome di una moneta
	 * @return il nome dell'oggetto moneta
	 */
	public String daiNome() {  
		return nome;  
	}
	
	/**
	 * Restituisce il valore di un oggetto moneta
	 * @return Ritorna un double con il valore dell'oggetto
	 */
	public double getValue() {  
		return valore;  
	}
	
	/**
	 * Confronta l'oggetto corrente con un'altra moneta
	 * @param moneta elemento con cui fare il confronto
	 * @return ritorna true se sono uguali, false altrimenti
	 */
	public boolean equals(Coin moneta) { 
		return nome.equals(moneta.daiNome());
	}
}
