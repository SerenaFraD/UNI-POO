package package1;

public final class Indirizzo {
	private final String via;
	private final int nCivico;
	private final String citta;

	public Indirizzo(String v, int nC, String c) {
		via = v;
		nCivico = nC;
		citta = c;
	}

	public Indirizzo() {
		via = null;
		nCivico = 0;
		citta = null;
	}

	public final String getVia() {
		return via;
	}

	public final String getCitta() {
		return citta;
	}

	public final int getnCivico() {
		return nCivico;
	}

	public Indirizzo clone() {
		try {
			Indirizzo cloned = (Indirizzo) super.clone();

			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() != this.getClass())
			return false;

		Indirizzo obj = (Indirizzo) o;

		return obj.via.equals(this.via) && obj.citta.equals(this.citta) && obj.nCivico == this.nCivico;
	}

	public String toString() {
		return getClass().getName() + "[via=" + via + ", nCivico=" + nCivico + ", citta=" + citta + "]";
	}
}
