package package1;

import package2.Compare;

public class Vacanza implements Cloneable, Compare<String>{
	private String ident;
	private double costo;
	private String desc;

	public Vacanza(String identificativo, double cost, String descrizione) {
		ident = identificativo;
		costo = cost;
		desc = descrizione;
	}

	public Vacanza() {
		ident = null;
		costo = 0;
		desc = null;
	}

	public double getCosto() {
		return costo;
	}

	public String getIdentificativo() {
		return ident;
	}

	public String getDescrizione() {
		return desc;
	}

	public void setIdentificativo(String ident) {
		this.ident = ident;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public void setDescrizione(String desc) {
		this.desc = desc;
	}

	public String toString() {
		return getClass().getName() + "[identificativo=" + ident + ", costo=" + costo + ", descrizione=" + desc + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() != this.getClass())
			return false;

		Vacanza other = (Vacanza) o;

		return (other.ident.equals(this.ident)) && (other.costo == this.costo) && (other.desc.equals(this.desc));
	}

	public Vacanza clone() {
		try {
			return (Vacanza) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public int compareTo(String t) {
		if(this.desc.toLowerCase().contains(t.toLowerCase()))
			return 1;
		return 0;
	}

}
