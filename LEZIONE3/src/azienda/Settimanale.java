package azienda;

public class Settimanale extends Lavoratore {
	private int ore;
	private static int N_FISSE = 40;
	private static int PAGA_FISSA = 10;
	
	public Settimanale(String nome, int amount) {
		super(nome);
	}
	
	public void setSalario(int ore) {		
		super.setSalario(N_FISSE);
	}
}
