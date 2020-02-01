package package2;

import package1.Automezzo;
import package1.GeneratoreTarghe;
import package1.Libretto;
import package1.Targa;

public class AutomezzoTester {
	public static void main(String args[]) {
		System.out.println("Istanzio un nuovo Libretto");
		Libretto libretto = new Libretto("Carlo Maria", "aaaa");
		System.out.println("Stato del nuovo libretto -> " + libretto.toString());
		
		System.out.println("Creazione nuova Targa");
		Targa targa = new Targa(new GeneratoreTarghe().getUltima());
		System.out.println("Stato della nuova targa -> " + targa.toString());
		
		System.out.println("Creazione nuovo Automezzo");
		Automezzo automezzo = new Automezzo(targa, libretto, "la figa è bella");
		System.out.println("Stato del nuovo automezzo -> " + automezzo.toString());
		
		System.out.println("Modifica della descrizione dell'automezzo");
		automezzo.setDescrizione("la vita è bella");
		System.out.println("Stato dell'automezzo -> " + automezzo.toString());	
	}
}
