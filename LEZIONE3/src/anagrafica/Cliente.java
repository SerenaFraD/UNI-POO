package anagrafica;

public class Cliente implements Cloneable {	
	private String nome;	
	private Indirizzo indirizzo;

	public Cliente(String nome, Indirizzo ind) {
		this.nome = (nome == null ? "" : nome);
		indirizzo = ind;
	}

	//Getters
	
	public String getNome() {
		return nome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	//Overrides toString in Object
	public String toString() {
		return getClass().getName() + "[nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}

	//Overrides equals in Object
	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (getClass() != o.getClass())
			return false;

		Cliente c = (Cliente) o;

		return nome.equals(c.nome) && indirizzo.equals(c.indirizzo);
	}

	//Overrides clone in Object
	public Cliente clone() {
		try {
			Cliente c = (Cliente) super.clone();
			return c;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
