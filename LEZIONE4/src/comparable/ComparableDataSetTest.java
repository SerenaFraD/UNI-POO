package comparable;

import cliente.Cliente;
import cliente.Indirizzo;

public class ComparableDataSetTest {
	public static void main(String args[]) {
		Indirizzo ind = new Indirizzo("ciao", "baronissi", 11, 84081);
		
		Comparable<Cliente> c1 = new Cliente("Serena", ind, 30);
		Comparable<Cliente>  c2 = new Cliente("Daniela", ind, 30);
		
		System.out.println(c1.compareTo(c2));
	}

}
