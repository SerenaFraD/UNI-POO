package package1;

public class Azienda {
	private String nome;
	private Indirizzo indirizzo;

	public Azienda(String n, Indirizzo ind) {
		nome = n;
		indirizzo = ind;
	}

	public Azienda() {
		nome = null;
		indirizzo = null;
	}

	public String getNome() {
		return nome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setNome(String n) {
		nome = n;
	}

	public void setIndirizzo(Indirizzo ind) {
		indirizzo = ind;
	}

	public Azienda clone() {
		try {
			Azienda cloned = (Azienda) super.clone();
			cloned.indirizzo = (Indirizzo) indirizzo.clone();

			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() != this.getClass())
			return false;

		Azienda obj = (Azienda) o;

		return obj.nome.equals(this.nome) && obj.indirizzo.equals(this.indirizzo);
	}

	public String toString() {
		return getClass().getName() + "[nome=" + nome + ", indirizzo=" + indirizzo.toString() + "]";
	}
}
