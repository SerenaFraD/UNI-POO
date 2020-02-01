package anagrafica;

public class Cliente implements Cloneable{
	private String nome;
	private Indirizzo indirizzo;
	 
	 public Cliente(String nome, Indirizzo ind) {
		 this.nome = (nome == null ? "" : nome);
		 indirizzo = ind;
	 }
	 
	 public String getNome() {
		 return nome;
	 }
	 
	 public Indirizzo getIndirizzo() {
		 return indirizzo;
	 }
	 
	 public String toString() {
		 return getClass().getName() + "[nome=" + nome + ", indirizzo=" + indirizzo + "]";
	 }
	 
	 public boolean equals(Object o) {
		 if(o == null)
			 return false;
		 
		 if(getClass() != o.getClass())
			 return false;
		 
		 Cliente c =  (Cliente) o;
		 
		 return nome.equals(c.nome) && indirizzo.equals(c.indirizzo);
	 }
	 
	 public Cliente clone() {
		 try {
			 return (Cliente) super.clone();
		 } catch(CloneNotSupportedException e) {
			 return null;
		 }
	 }
}
