package package1;

public class Libro {
	private Autore autore;
	private String titolo;
	private double costo;
	
	public Libro(Autore auth, String tit, double c) {
		autore = auth;
		titolo = tit;
		costo = c;
	}
	
	public Libro() {
		autore = null;
		titolo = null;
		costo = 0;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public Libro clone() {
		try {
			Libro cloned = (Libro) super.clone();
			cloned.autore = this.autore.clone();
			
			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	} 
}
