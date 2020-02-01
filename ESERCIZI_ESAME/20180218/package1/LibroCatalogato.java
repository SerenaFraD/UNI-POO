package package1;

import package2.Estrattore;

public class LibroCatalogato implements Estrattore{
	private Libro libro;
	private Collocazione collocazione;
	private String soggetto;
	
	public LibroCatalogato(Libro lib, Collocazione coll, String sog) {
		libro = lib;
		collocazione = coll;
		soggetto = sog;
	}
	
	public LibroCatalogato() {
		libro = null;
		collocazione = null;
		soggetto = null;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Collocazione getCollocazione() {
		return collocazione;
	}

	public void setCollocazione(Collocazione collocazione) {
		this.collocazione = collocazione;
	}

	public String getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(String soggetto) {
		this.soggetto = soggetto;
	}
	
	public String toString() {
		return getClass().getName() + "[libro=" + libro.toString() + ", collocazione=" + collocazione.toString() + ", soggetto=" + soggetto + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		if(obj.getClass() != this.getClass())
			return false;
		
		LibroCatalogato other = (LibroCatalogato) obj;
		
		return other.collocazione.equals(this.collocazione) && other.libro.equals(this.libro) && other.soggetto.equals(this.soggetto);
	}
	
	public LibroCatalogato clone() {
		try {
			LibroCatalogato cloned = (LibroCatalogato) super.clone();
			cloned.collocazione = this.collocazione.clone();
			cloned.libro = this.libro.clone();
			
			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	
	public String estrai() {
		return this.libro.getTitolo() + " " + this.collocazione.getSettore() + " " + this.collocazione.getPosizione();
	}
	
	
}
