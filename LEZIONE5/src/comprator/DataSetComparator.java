package comprator;

import java.util.ArrayList;

public class DataSetComparator {

	public static Object massimoLunghezza(ArrayList<Object> objects, Comparator comp) {
		Object max = objects.get(0);

		for (Object o : objects) {
			if (comp.comparatorLenght(o) > comp.comparatorLenght(max))
				max = o;
		}

		return comp.comparatorLenght(max);
	}

	public static Object minimoLunghezza(ArrayList<Object> objects, Comparator comp) {
		Object min = objects.get(0);

		for (Object o : objects) {
			if (comp.comparatorLenght(o) < comp.comparatorLenght(min))
				min = o;
		}

		return comp.comparatorLenght(min);
	}

	public static Object massimoStringa(ArrayList<Object> objects, Comparator comp) {
		Object max = objects.get(0);

		for (Object o : objects) {
			if (comp.comparatorString(o).compareTo(comp.comparatorString(max)) > 0)
				max = o;
		}

		return comp.comparatorString(max);
	}

	public static String minimoStringa(ArrayList<Object> objects, Comparator comp) {
		Object min = objects.get(0);

		for (Object o : objects) {
			if (comp.comparatorString(o).compareTo(comp.comparatorString(min)) < 0)
				min = o;
		}

		return comp.comparatorString(min);
	}
}
