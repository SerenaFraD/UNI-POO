package azienda;

public class Orario extends Lavoratore {
	private int ore;
	private static int N_FISSE = 40;
	
	
	public Orario(String nome) {
		super(nome);
	}
	
	public void setSalario(double ore) {		
		if(ore > N_FISSE)
			ore = (N_FISSE + ((ore - N_FISSE) * 1.5));
		else
			ore = (N_FISSE );
		
		super.setSalario(ore);
	}
	
	public String toString() {
		return super.toString() + "[ore=" + ore + "]";
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o))
			return false;
		
		Orario other =  (Orario) o;
		return ore == other.ore;
	}
	
	public Orario clone() {
		Orario cloned = (Orario) super.clone();
		
		cloned.ore = ore;
		
		return cloned;
	}

}
