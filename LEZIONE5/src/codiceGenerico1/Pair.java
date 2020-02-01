package codiceGenerico1;

public class Pair<S, T> {

	private S primo;
	private T secondo;

	public Pair(S primoEl, T secondoEl) {
		primo = primoEl;
		secondo = secondoEl;
	}

	public S getFirst() {
		return primo;
	}

	public T getSecond() {
		return secondo;
	}

	public void swap(T primo, T secondo) {
		T tmp = primo;
		primo = secondo;
		secondo = tmp;
	}
}
