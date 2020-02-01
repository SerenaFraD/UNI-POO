import java.awt.Rectangle;

public class MoveTester {
	
	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
	
		System.out.println("Inizializzato con valori:");
		System.out.println(box.getX());
		System.out.println(box.getY());
		
		//Move the rectangle
		box.translate(15, 25);
		System.out.println("Si sposta l'angolo in alto di 15 e 25");
		
		//Print information about the moved rectangle
		System.out.println("Dopo lo spostamento, l'angolo in alto a sinistra e':");
		System.out.println(box.getX());
		System.out.println(box.getY());
	}
}
