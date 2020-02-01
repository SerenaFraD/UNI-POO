package comprator;

public class Country implements Comparable<Country> {
	private String nome;
	private double superficie;

	public Country(String nome, double superficie) {
		this.nome = nome;
		this.superficie = superficie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int compareTo(Comparable<Country> o) {
		if (o == null)
			throw new NullPointerException();

		if (o.getClass() != this.getClass())
			throw new ClassCastException();

		Country other = (Country) o;
		if (other.superficie == superficie) {
			return 0;
		} else if (other.superficie < superficie) {
			return -1;
		} else {
			return 1;
		}
	}
}
