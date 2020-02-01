import java.util.ArrayList;

/**
 * Implementazione della classe Purse, esempio di borsellino.
 * @author Serena D'Urso
 */
public class Purse {
	
	/**
	 * coins (array) collezione di monete;
	 * total (double) totale del valore delle monete contenute nel borsellino:
	 */
	private ArrayList<Coin> coins;
	private double total;
	
	/**
	 * Metodo costruttore, istanzia un nuovo oggetto Purse
	 * inizializza l'array di coins
	 */
	public Purse() {
		coins = new ArrayList<Coin>(); 
	}

	/**
	 * Aggiunge una nuova moneta al borsellino
	 * @param aCoin valore non negativo della nuova moneta da inserire
	 */
	public void add(Coin aCoin){
		coins.add(aCoin); 
		total += aCoin.getValue();
	}
	
	/**
	 * Ritorna il totale contenuto nel borsellino
	 * @return il valore double del totale;
	 */
	public double getTotal() {
		return this.total; 
	}
	
	/**
	 * Ritorna il massimo tra le monete del borsellino
	 * @return max che mantiene il valore massimo delle monete nell'array coins
	 */
	public Coin getMaximum() {
		Coin max = coins.get(0);
		
		for(Coin c: coins) { 
			if(c.getValue() > max.getValue())
				max =c; 
			} 
		
		return max; 
	}
	
	/**
	 * Ritorna il minimo tra le monete del borsellino
	 * @return max che mantiene il valore minimo delle monete nell'array coins
	 */
	public Coin getMinimum() {
		Coin min = (Coin) coins.get(0); 
		
		for(Coin c:coins) { 
			if(c.getValue() < min.getValue()) 
				min =c; 
			}
		
		return min; 
	}
	
	/**
	 * Metodo interno della classe, trova nell'array un aCoin valore
	 * @param aCoin valore da cercare nell'array coins
	 * @return un intero che indica se è stato trovato o -1 se non è stato trovato
	 */
	private int find(Coin aCoin) {
		int index = 0;
		
		for(Coin c:coins) {
			if(c.equals(aCoin)) {
				return index;
			}
			index++;
		}	
		
		return -1;
	}
	
	/**
	 * Rimuove una moneta che ha lo stesso valore di una moneta passata
	 * @param aCoin valore da confrontare
	 */
	public void sub(Coin aCoin) {
		int index = find(aCoin);
		
		coins.remove(index);
		
		total = total - aCoin.getValue();
	}
}
