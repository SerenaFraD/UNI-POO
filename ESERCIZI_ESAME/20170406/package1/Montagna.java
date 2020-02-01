package package1;

public class Montagna extends Vacanza {
	private int nSaune;
	private double cSaune;
	
	public Montagna(String identificativo, double cost, String descrizione, int nSaune, double cSaune) {
		super(identificativo, cost, descrizione);
		this.nSaune = nSaune;
		this.cSaune = cSaune;
	}
	
	public Montagna() {
		nSaune = 0;
	}

	public int getnSaune() {
		return nSaune;
	}

	public void setnSaune(int nSaune) {
		this.nSaune = nSaune;
	}
	
	public double getCosto() {
		return super.getCosto() + cSaune * nSaune;
	}

	public double getcSaune() {
		return cSaune;
	}

	public void setcSaune(double cSaune) {
		this.cSaune = cSaune;
	}

	public String toString() {
		return super.toString() + "[nSaune=" + nSaune + ", cSaune=" + cSaune + "]";
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o))
			return false;
		
		Montagna other = (Montagna) o;
		
		return (other.nSaune == this.nSaune) && (other.cSaune == this.cSaune);
	}
	
	public Montagna clone() {
		return (Montagna) super.clone();
	}
	
}






















