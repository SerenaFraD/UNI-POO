package codiceGenerico1;

import java.util.ArrayList;

public class ArrayListUtil<T extends Comparable<T>> {
	
	public int ricercaGenerica(ArrayList<T> list, T key) {
		for(T t : list) {
			if(t.equals(key)) {
				return 1;
			}
		}
		
		return 0;
	}
	
	public T ricercaChiave(ArrayList<T> list, T key) {
		for(T t : list) {
			if(t.equals(key)) {
				return t;
			}
		}
		
		return null;
	}
	
	public T ricercaFinalizzata(ArrayList<T> list, T key) {
		int i;
		
		for(i = 0; i < list.size() && list.get(i).compareTo(key) <= 0; i++);
		
		if(list.get(i).compareTo(key) == 0)
			return list.get(i);
		
		return null;
	}
	
}
