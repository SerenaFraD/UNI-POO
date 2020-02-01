package package1;

import package2.Compare;

public class Card implements Compare<Integer>{
	private int percentuale;
	private int costo = 2 * percentuale;

	public Card(int perc) {
		percentuale = perc;
	}

	public Card() {
		percentuale = 0;
	}

	public int getPercentuale() {
		return percentuale;
	}

	public void setPercentuale(int percentuale) {
		this.percentuale = percentuale;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String toString() {
		return getClass().getName() + "[percentuale=" + percentuale + ", costo=" + costo + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() != this.getClass())
			return false;

		Card other = (Card) o;

		return other.percentuale == this.percentuale;
	}

	public Card clone() {
		try {
			return (Card) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public int compareTo(Integer element) {
		if (this.percentuale == element)
			return 0;
		else if (this.percentuale < element)
			return -1;
		else
			return 1;
	}
}
