package scarafagi;

public class TesterScarafaggi {

	public static void main(String[] args) {
		System.out.println("Istanzo una nuova colonia di scarafaggi");
		Scarafaggi s = new Scarafaggi();
		
		System.out.println("Il numero di elementi della colonia � 100");
		System.out.println("Elementi: " + s.getScarafaggi() + "\n");
		
		System.out.println("Il numero si � ridotto");
		s.kill();
		System.out.println("Elementi: " + s.getScarafaggi() + "\n");
		
		System.out.println("La colonia � ricresciuta");
		s.cresce();
		System.out.println("Elementi: " + s.getScarafaggi() + "\n");
	}

}
