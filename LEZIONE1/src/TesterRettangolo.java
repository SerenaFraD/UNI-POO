
public class TesterRettangolo {

	public static void main(String[] args) {
		System.out.println("Istanzio un nuovo rettangolo senza parametri.");
		Rettangolo r = new Rettangolo();
		
		System.out.println("I valori dovrebbero essere tutti a zero.");
		System.out.println("Vertice: " + "(" + r.getVertex().getAscissa() + ", " + r.getVertex().getOrdinata() + ")");
		System.out.println("Width: " + r.getWidth());
		System.out.println("Height: " + r.getHeight() + "\n");

		System.out.println("Istanzio un nuovo rettangolo con parametri.");
		Punto p = new Punto(1, 1);
		Rettangolo s = new Rettangolo(p, 25, 11);
		
		System.out.println("I valori dovrebbero essere V = (1, 1), W = 25 e H = 11.");
		System.out.println("Vertice: " + "(" + s.getVertex().getAscissa() + ", " + s.getVertex().getOrdinata() + ")");
		System.out.println("Width: " + s.getWidth());
		System.out.println("Height: " + s.getHeight() + "\n");
		
		System.out.println("Modifico il vertice a 2,2");
		p.setAscissa(2);
		p.setOrdinata(2);
		s.setVertex(p);
		System.out.println("Vertice: " + "(" + s.getVertex().getAscissa() + ", " + s.getVertex().getOrdinata() + ")\n");
		
		System.out.println("Modifico width a 5");
		s.setWidth(5);
		System.out.println("Width: " + s.getWidth() + "\n");
		
		System.out.println("Modifico height a 5");
		s.setHeight(5);
		System.out.println("Height: " + s.getHeight() + "\n");
	}

}
