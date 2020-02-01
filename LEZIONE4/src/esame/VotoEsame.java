package esame;

public class VotoEsame implements Measurable {
	private double punteggio;
	private String lettera;

	public VotoEsame() {
		punteggio = 0;
		lettera = "";
	}

	public VotoEsame(double p, String l) {
		punteggio = p;
		lettera = l;
	}

	public double getMeasure() {
		return punteggio;
	}

	public void setPunteggio(double p) {
		punteggio = p;
	}

	public void setLettera(String l) {
		lettera = l;
	}

	public double getPunteggio() {
		return punteggio;
	}

	public String getLettera() {
		return lettera;
	}
}
