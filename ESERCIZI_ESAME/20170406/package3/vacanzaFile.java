package package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import package1.Mare;
import package1.Metropolitana;
import package1.Montagna;
import package1.Vacanza;
import package2.ComparatorData;

public class vacanzaFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File vacanza = new File("vacanza.dat");
		ObjectInputStream in;
		ArrayList<Vacanza> v = new ArrayList<Vacanza>();
		Vacanza vac;

		if (vacanza.exists()) {
			in = new ObjectInputStream(new FileInputStream(vacanza));

			while ((vac = (Vacanza) in.readObject()) != null) {
				v.add(vac);
			}

			in.close();
		} else {
			v.add(new Mare("mare", 151.0, "Lusso Mare", false, 0));
			v.add(new Mare("mare lovely", 100.0, "Mare standard, povero", true, 12));
			v.add(new Montagna("montagna", 200.0, "luogo di perdizione", 11, 4.0));
			v.add(new Montagna("montagna lovely", 201.0, "montagna standard", 0, 8.0));
			v.add(new Metropolitana("metro", 300.0, "città inquinata", false, null));
			v.add(new Metropolitana("metro", 301.0, "città inquinata standard", false, null));
		}
		
		for (Vacanza va : v) {
			if (ComparatorData.criterio("STANDARD", va) == 0)
				System.out.println(va);
		}
	}
}
