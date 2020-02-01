package comprator;

public class CountryComparator implements Comparator<Country>{

	@Override
	public String comparatorString(Country t) {
		return t.getNome();
	}

	@Override
	public double comparatorLenght(Country t) {
		return t.getSuperficie();
	}
	
}
