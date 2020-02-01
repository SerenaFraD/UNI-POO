package comprator;

public class StringComparator implements Comparator{

	@Override
	public String comparatorString(Object o) {
		String s = (String) o;
		
		return s;
	}

	@Override
	public double comparatorLenght(Object o) {
		String s = (String) o;
		
		return s.length();
	}
	
}
