/**
 * Test della classe Purse
 * @author Serena D'Urso
 *
 */
public class TesterPurse {
	
	public static void main(String[] args) {
		System.out.println("Istanzio un oggetto di tipo Purse");
		Purse p = new Purse();
		
		System.out.println("Aggiungo due monete da 1 e 2 come valore\n");
		Coin c = new Coin(1.0, "uno");
		Coin c1 = new Coin(2.0, "due");
		p.add(c);
		p.add(c1);
		
		System.out.println("Resituisco il totale del borsellino: " + p.getTotal() + "\n");
		
		System.out.println("La moneta più bassa è: " + p.getMinimum().getValue() + "\n");
		System.out.println("La moneta più alta è: " + p.getMaximum().getValue() + "\n");
		
		System.out.println("Rimuovo la moneta da 1");
		p.sub(c);
		System.out.println("Resituisco il totale del borsellino: " + p.getTotal());
	}
	

}
