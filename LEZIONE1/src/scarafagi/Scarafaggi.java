package scarafagi;

public class Scarafaggi {
	private int totale;
	
	public Scarafaggi() {
		totale = 100;
	}
	
	public void cresce() {
		totale = totale * 2;
	}
	
	public void kill() {
		totale = totale - (totale / 100) * 10;
	}
	
	public int getScarafaggi() {
		return this.totale;
	} 
}
