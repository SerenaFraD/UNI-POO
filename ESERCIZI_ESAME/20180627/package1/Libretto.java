package package1;

public class Libretto {
	private String intestatario;
	private String descrizione;
	
	public Libretto(String intestatario, String descrizione) {
		this.intestatario = intestatario;
		this.descrizione = descrizione;
	}
	
	public Libretto() {
		intestatario = null;
		descrizione = null;
	}

	public String getIntestatario() {
		return intestatario;
	}

	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String toString() {
		return getClass().getName() + "[intestatario=" + intestatario + ", descrizione=" + descrizione + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() == this.getClass())
			return false;

		Libretto other = (Libretto) o;

		return this.intestatario.equals(other.intestatario) && this.descrizione.equals(other.descrizione);
	}

	public Libretto clone() {
		try {
			Libretto cloned = (Libretto) super.clone();

			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
