package package1;

public abstract class Spedizione {
	private Indirizzo destinazione;
	private double valore;

	public Indirizzo getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(Indirizzo destinazione) {
		this.destinazione = destinazione;
	}

	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
	}
}
