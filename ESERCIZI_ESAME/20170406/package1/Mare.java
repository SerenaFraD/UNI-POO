package package1;

public class Mare extends Vacanza {
	private boolean spiaggia;
	private double servizio;

	public Mare(String identificativo, double cost, String descrizione, boolean spia, double ser) {
		super(identificativo, cost, descrizione);
		spiaggia = spia;
		servizio = ser;
	}

	public Mare() {
		super();
		spiaggia = false;
		servizio = 0;
	}

	public boolean isSpiaggia() {
		return spiaggia;
	}

	public void setSpiaggia(boolean spiaggia) {
		this.spiaggia = spiaggia;
	}

	public double getServizio() {
		return servizio;
	}

	public void setServizio(double servizio) {
		this.servizio = servizio;
	}

	public double getCosto() {
		return super.getCosto() + servizio;
	}

	public String toString() {
		return super.toString() + "[spiaggia=" + spiaggia + ", servizio=" + servizio + "]";
	}

	public boolean equals(Object o) {
		if (!super.equals(o))
			return false;

		Mare other = (Mare) o;

		return (other.spiaggia == this.spiaggia) && (other.servizio == this.servizio);
	}

	public Mare clone() {
		return (Mare) super.clone();
	}
}
