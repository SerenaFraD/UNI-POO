package comparable;

public class ComparableDataSet<T extends Comparable<T>> {
	public T massimo(T primo, T secondo) {
		if(primo.compareTo(secondo) <= 0)
			return primo;
		
		return secondo;
	}
	
	public T minimo(T primo, T secondo) {
		if(primo.compareTo(secondo) > 0)
			return primo;
		
		return secondo;
	}
}
