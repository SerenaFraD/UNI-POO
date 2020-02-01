package bibite;

public class TesterDistributore {

	public static void main(String[] args) {
		System.out.println("Istanzio un nuovo distributore senza lattine");
		Distributore2 d = new Distributore2();
		System.out.println("Costruito il distributore" + d); // Il risultato chiama la toString di object su
																// distributore e stampa il riferimento a d

		System.out.println("Acquisto lattina ok");
		try {
			d.acquistaLattina();
			System.out.println("Acquisto effettuato " + d);
		} catch (LattineFiniteException e) {
			System.out.println("Acquisto non effettuato " + d);
			e.printStackTrace();
		}

		System.out.println("Preparazione test successivo");
		try {
			d.acquistaLattina();
			d.acquistaLattina();
			d.acquistaLattina();
			d.acquistaLattina();
			d.acquistaLattina();
			d.acquistaLattina();
			d.acquistaLattina();
			d.acquistaLattina();
			d.acquistaLattina();
		} catch (LattineFiniteException e) {
			e.printStackTrace();
		}

		System.out.println("Simulata situazione di errore " + d);

		System.out.println("Acquisto lattina no");
		try {
			d.acquistaLattina();
		} catch (LattineFiniteException e) {
			System.out.println("Lanciata eccezione");
			System.out.println("Acquisto non effettuato " + d);
		}

		System.out.println("Situazione attuale: " + d);
		System.out.println("Numero gettoni: " + d.getGettoni() + "\n");

		System.out.println("Svuoto la cassa");
		d.svuotaCassa();
		System.out.println("Situazione attuale: " + d);
	}
}
