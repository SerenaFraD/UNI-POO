package package1;

public class Metropolitana extends Vacanza {
	private boolean card;
	private Card c;

	public Metropolitana(String identificativo, double cost, String descrizione, boolean card, Card ca) {
		super(identificativo, cost, descrizione);
		this.card = card;
		c = ca;
	}

	public Metropolitana() {
		super();
		card = false;
		c = null;
	}

	public boolean isCard() {
		return card;
	}

	public void setCard(boolean card) {
		this.card = card;
	}

	public Card getC() {
		return c;
	}

	public void setC(Card c) {
		this.c = c;
	}

	public double getCosto() {
		return super.getCosto() + c.getCosto();
	}

	public String toString() {
		return super.toString() + "[card=" + card + ", c=" + "]";
	}

	public boolean equals(Object o) {
		if (!super.equals(o))
			return false;

		Metropolitana other = (Metropolitana) o;

		return (other.card == this.card) && (other.c.equals(this.c));
	}

	public Metropolitana clone() {
		return (Metropolitana) super.clone();
	}
}
