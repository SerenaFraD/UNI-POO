package package2;

import package2.Compare;
public class ComparatorData {
	
	public static int criterio(Object c1, Object c2, Compare c) {
		if(c.compareTo(c1) == -1 && c.compareTo(c2) == 1)
			return 1;
		return 0;
	}


	public static int criterio(Object criterio, Compare c) {
		if(c.compareTo(criterio) == 0)
			return 1;
		
		return 0;
	}
	
}
