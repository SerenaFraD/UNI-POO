package comprator;

/**
 * The value 0 if the argument is equal to another; 
 * a value less than 0 if the argument is greater than another; 
 * and a value greater than 0 if the argument less than another.
 */

public interface Comparable<T> {
	int compareTo(Comparable<T> c2);
}
