/*
* E' un classe il quale oggetto non può essere modificato dopo essere stato creato.
* Nessun oggetto, né thread può modificare lo stato interno di un oggeto immutabile.
* Gli oggetti immutabili possono essere dunque condivisi senza problemi tra oggetti 
* diversi e questo può consentire un risparmio nella memoria occupata.
* 
* Le classi immutabili siano più semplici da programmare poiché le loro istanze possono assumere
* uno e un solo stato che viene mantenuto dalla costruzione in poi. 
* diminuisce lo sforzo necessario per il test poiché lo stato interno è sempre
* noto e soddisfa sempre determinate asserzioni.
*/
package anagrafica;

public final class Indirizzo implements Cloneable { // <----
	private final String via; // <----
	private final String citta; // <----
	private final int civico; // <----
	private final int cap; // <----
	// OGNI VARIABILE DI ISTANZA CHE E' OGGETTO MUTABILE DEVE ESSERE RITORNATA COME
	// COPIA
	// E DEVE ESSERE RESA PRIVATE

	public Indirizzo(String via, String citta, int civico, int cap) {
		this.via = (via == null ? "" : via); // controlliamo se via e citta siano null, se lo sono mettiamo stringa
												// vuota. Doveva esserci il try catch
		this.citta = (citta == null ? "" : citta);
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

	// NON SONO PRESENTI METODI MODIFICATORI

	// Override toString in Object
	public String toString() {
		return getClass().getName() + "[via=" + via + ", cap=" + cap + ", citta=" + citta + ", civico=" + civico + "]";
	}

	// Override equals in Object
	public boolean equals(Object o) {
		if (o == null) // Verifico che l'oggetto non sia null
			return false;

		if (getClass() != o.getClass()) // verifico che la classe è diversa da quella dell'oggetto passato
			return false;

		Indirizzo altroInd = (Indirizzo) o;

		return via.equals(altroInd.via) && citta.equals(altroInd.citta);
	}

	// Override clone in Object
	public Indirizzo clone() {
		try {
			return (Indirizzo) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
