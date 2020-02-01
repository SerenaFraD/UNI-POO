package package1;

public class SpedizioneEsterna extends Spedizione {
	private Azienda azienda;

	public SpedizioneEsterna(Indirizzo ind, double valore, Azienda azienda) {
		super();
		super.setDestinazione(ind);
		super.setValore(valore);
		this.azienda = azienda;
	}

	public SpedizioneEsterna() {
		super();
		azienda = null;
	}

	public Azienda getAzienda() {
		return azienda;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}

	public Indirizzo getDestinazione() {
		return super.getDestinazione();
	}

	public double getValore() {
		return super.getValore();
	}

	public void setValore(double valore) {
		super.setValore(valore);
	}

	public void setDestinazione(Indirizzo indirizzo) {
		super.setDestinazione(indirizzo);
	}

	public String toString() {
		return getClass().getName() + "[azienda=" + azienda.toString() + ", indirizzo="
				+ super.getDestinazione().toString() + ", valore=" + super.getValore() + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() != this.getClass())
			return false;

		SpedizioneEsterna obj = (SpedizioneEsterna) o;

		return obj.azienda.equals(this.azienda) && obj.getDestinazione().equals(this.getDestinazione())
				&& obj.getValore() == this.getValore();
	}

	public SpedizioneEsterna clone() {
		try {
			SpedizioneEsterna cloned = (SpedizioneEsterna) super.clone();
			cloned.azienda = (Azienda) azienda.clone();
			cloned.setDestinazione(this.getDestinazione().clone());
			cloned.setValore(this.getValore());

			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
