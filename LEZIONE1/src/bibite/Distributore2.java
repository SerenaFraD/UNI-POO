//Sviluppato durante il tutorato
package bibite;

public class Distributore2 {
	
	//1.Iniziamo con le firme dei metodi
	//2. Individuare le variabili di istanza
	//3. sempre usare eccezione
	//3.1 quelle controllate hanno bisogno di mettere nella firma che il metodo lancia l'eccezione
	//3.2 quelle non controlalte implementano runtime exception e non devono mettere niente
	
	private int nGettoni;
	private int nLattine;
	private static final int MAXLATTINE = 10;
	
	public Distributore2() {
		nGettoni = 0;
		nLattine = MAXLATTINE;
	}
	
	/**
	 * Il numero di gettoni presenti
	 * @return il numero di gettoni
	 */
	public int getGettoni() {
		return nGettoni;
	}
	 
	//Ritorna il numero di lattine
	public int getLattine() {
		return nLattine;
	}
	
	//Riarica lattine
	public void riempiDistributore() {
		nLattine = MAXLATTINE;
	}
	
	public void svuotaCassa() {
		nGettoni = 0;
	}
	
	//Inserisce il gettone e rimuove una lattina
	public void acquistaLattina() throws LattineFiniteException {
		if(nLattine <= 0) {
			throw new LattineFiniteException();
		}
		
		nGettoni++;
		nLattine--;
	}
	
	//nel toString non si mettono le costanti
	public String toString() {
		return getClass().getName() + "[nLattine=" + nLattine + ", nGettoni=" + nGettoni +"]";
	}
	
}
