package azienda;

//Deve essere astratta e getsalario doveva essere un metodo polimorfico
public class Lavoratore implements Cloneable {
	
	private static int PAGA_FISSA = 10;
	private String nome;
	private double salario;
	
	public Lavoratore(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSalario(double ore) {
		salario = ore * PAGA_FISSA;
	}
	 
	public double getSalario() {
		return salario;
	}
	
	public String toString() {
		return getClass().getName() + "[nome=" + nome + ",salario=" + salario + "]";
	}
	
	public boolean equals(Object o) {
		if(o == null)
			return false;
		
		if(getClass() != o.getClass())
			return false;
		
		Lavoratore other =  (Lavoratore) o;
		return nome.equals(other.nome);
	}

	public Lavoratore clone() {
		try {
			Lavoratore cloned = (Lavoratore) super.clone();
			cloned.nome = nome;
			
			return cloned;
		} catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
}
