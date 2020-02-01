import java.awt.Rectangle;

public class TesterRectangle {

	public static void main(String[] args) {
		System.out.println("Istanzio un nuovo rettangolo");
		System.out.println("Vertice: (1, 1)");
		System.out.println("Lati: 3 e 3");
		Rectangle r = new Rectangle(1, 1, 3, 3);
		
		System.out.println("Stampo l'altezza " + r.height);
		System.out.println("Stampo l'ampiezza " + r.width);
		
		System.out.println("Stampo x " + r.x);
		System.out.println("Stampo y " + r.y);
		
		System.out.println("Eseguo la traslazione dell'oggeto in senso antiorario");
		
		//La traslazione prima su x e poi su y;
		
		System.out.println("Traslo prima volta");
		r.translate(3, 0);											
		System.out.println("Stampo x " + r.x);
		System.out.println("Stampo y " + r.y);
		
		System.out.println("Traslo seconda volta");
		r.translate(0, 3);											
		System.out.println("Stampo x " + r.x);
		System.out.println("Stampo y " + r.y);
		
		System.out.println("Traslo quarta volta");
		r.translate(-3, 0);											
		System.out.println("Stampo x " + r.x);
		System.out.println("Stampo y " + r.y);
		
		System.out.println("Calcolo il perimetro: " + (2 * r.height + 2 * r.width));
		System.out.println("Calcolo l'area: " + (r.height * r.width));
	}

}
