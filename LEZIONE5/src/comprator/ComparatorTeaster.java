package comprator;

import java.util.ArrayList;

public class ComparatorTeaster {
	
	public static void main(String args[]) {
		
		ArrayList<Object> stringhe = new ArrayList<Object>();
		//Comparator meas = new CountryComparator();
		Comparator meas = new StringComparator();
		
		/*
		stringhe.add(new Country("Italia", 123));
		stringhe.add(new Country("Alaska", 500));
		stringhe.add(new Country("Polonia", 11));
		*/
		
		stringhe.add("Ciao");
		stringhe.add("PaceEBene");
		stringhe.add("Polonia");
		
		System.out.println(DataSetComparator.massimoStringa(stringhe, meas));
	}
}
