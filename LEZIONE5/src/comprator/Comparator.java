package comprator;

//Interfaccia di smistamento
public interface Comparator<T> {
	
	String comparatorString(T t);

	double comparatorLenght(T t);
}
