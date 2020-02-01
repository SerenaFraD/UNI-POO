package cliente;

import comparable.Comparable;

public class Cliente implements Cloneable, Comparable<Cliente> {
	private String nome;
	private Indirizzo indirizzo;
	private int eta;

	public Cliente(String nome, Indirizzo ind, int eta) {
		this.nome = (nome == null ? "" : nome);
		indirizzo = ind;
	}

	// Getters

	public String getNome() {
		return nome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public int geEta() {
		return eta;
	}

	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	// Overrides toString in Object
	public String toString() {
		return getClass().getName() + "[nome=" + nome + ", indirizzo=" + indirizzo + ", eta=" + eta + "]";
	}

	// Overrides equals in Object
	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (getClass() != o.getClass())
			return false;

		Cliente c = (Cliente) o;

		return nome.equals(c.nome) && indirizzo.equals(c.indirizzo) && eta == c.eta;
	}

	// Overrides clone in Object
	public Cliente clone() {
		try {
			Cliente c = (Cliente) super.clone();
			c.indirizzo = indirizzo.clone();
			return c;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	// Overrides compareTo in Comparable
	public int compareTo(Comparable<Cliente> o) {
		if (o == null)
			throw new NullPointerException();

		if (o.getClass() != this.getClass())
			throw new ClassCastException();

		Cliente other = (Cliente) o;

		if (this.eta == other.eta) {
			if(nome.equals(other.nome)){
				return 0;
			} else if(nome.compareTo(other.nome) < 0) {
				return -1;
			} else {
				return 1;
			}
					
		} else if (this.eta < other.eta) {
			return -1;
		} else {
			return 1;
		}
	}
}
