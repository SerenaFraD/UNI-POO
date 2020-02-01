package package1;

public class Automezzo {
	private Targa targa;
	private Libretto libretto;
	private String descrizione;
	
	public Automezzo(Targa targa, Libretto libretto, String descrizione) {
		this.targa = targa;
		this.libretto = libretto;
		this.descrizione = descrizione;
	}
	
	public Automezzo() {
		this.targa = null;
		this.libretto = null;
		this.descrizione = null;
	}

	public Targa getTarga() {
		return targa.clone();
	}

	public void setTarga(Targa targa) {
		this.targa = targa;
	}

	public Libretto getLibretto() {
		return libretto.clone();
	}

	public void setLibretto(Libretto libretto) {
		this.libretto = libretto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String toString() {
		return getClass().getName() + "[targa=" + this.targa.toString() + ", libretto=" + libretto.toString() + ", descrizione=" + descrizione + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() == this.getClass())
			return false;

		Automezzo other = (Automezzo) o;

		return this.targa.equals(other.targa) && this.libretto.equals(other.libretto) && this.descrizione.equals(other.descrizione);
	}

	public Automezzo clone() {
		try {
			Automezzo cloned = (Automezzo) super.clone();
			cloned.targa = this.targa.clone();
			cloned.libretto = this.libretto.clone();

			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
