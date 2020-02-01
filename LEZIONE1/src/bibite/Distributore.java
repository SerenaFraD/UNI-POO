package bibite;

public class Distributore {
	private final int maxLattine = 10;
	private int nGettoni;
	private int nLattine;
	
	public Distributore() {
		nLattine = 0;
		nGettoni = 0;
	}
	
	/**
	 * @author Serena D'Urso	
	 * @param lattine serve a indicare il numero di lattine con cui si crea il distributore
	 */
	public Distributore(int lattine) {
		nLattine = lattine;
		nGettoni = 0;
	}
	
	public void ricarica() {
		this.nLattine = maxLattine;
	}
	
	public void compra() {
		nLattine--;
		nGettoni++;
	}
	
	public int getLattine() {
		return this.nLattine;
	}
	
	public int getGettoni() {
		return this.nGettoni;
	}
}
