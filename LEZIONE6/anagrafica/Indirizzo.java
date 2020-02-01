//E' immutabile quindi non ci sono i setters e il costruttore si fa passare i dati
package anagrafica;

public final class Indirizzo implements Cloneable {
	private String via;
	private String citta;
	private int civico;
	private int cap;
	
	public Indirizzo(String via, String citta, int civico, int cap) {
		this.via = (via == null? "" : via);	//controlliamo se via e citta siano null, se lo sono mettiamo stringa vuota. Doveva esserci il try catch
		this.citta = (citta == null? "" : citta);
		this.civico = civico;
		this.cap = cap;
	}
	
	public String getVia() {
		return this.via;
	}

	public String getCitta() {
		return this.citta;
	}

	public int getCivico() {
		return this.civico;
	}

	public int getCap() {
		return this.cap;
	}

	public String toString() {
		return getClass().getName() + "[via=" + via + ", cap=" + cap + ", citta=" + citta + ", civico=" + civico + "]";
	}
	
	public boolean equals(Object o) {
		if(o == null) //Verifico che l'oggetto non sia null
			return false;
		
		if(getClass() != o.getClass()) //verifico che la classe è diversa da quella dell'oggetto passato
			return false;
		
		Indirizzo altroInd = (Indirizzo) o;
		
		return via.equals(altroInd.via) && citta.equals(altroInd.citta);
	}
	
	public Indirizzo clone() {
		try {
			return (Indirizzo) super.clone();
		} catch(CloneNotSupportedException e) {
			return null;
		}
	}
}



































