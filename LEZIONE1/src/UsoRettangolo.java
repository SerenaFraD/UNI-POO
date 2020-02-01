public class UsoRettangolo {

	public static void main(String[] args) {
		Punto vertex = new Punto(12, 53);
		double width = 30.5;
		double height = 12.5;
		int x, y;
		
		Rettangolo r = new Rettangolo(vertex, width, height);
		
		System.out.println("Traslo il vertice di 5 in orizzontale");
		x = 5;
		y = 0;
		r.trasla(x, y);
		System.out.println("Vertice: " + "(" + r.getVertex().getAscissa() + ", " + r.getVertex().getOrdinata() + ")\n");
		
		System.out.println("Traslo il vertice di 7 verticale");
		x = 0;
		y = 7;
		r.trasla(x, y);
		System.out.println("Vertice: " + "(" + r.getVertex().getAscissa() + ", " + r.getVertex().getOrdinata() + ")\n");
		
		System.out.println("Traslo il vertice di -5 in orizzontale");
		x = -5;
		y = 0;
		r.trasla(x, y);
		System.out.println("Vertice: " + "(" + r.getVertex().getAscissa() + ", " + r.getVertex().getOrdinata() + ")\n");
		
		System.out.println("Traslo il vertice di -7 verticale");
		x = 0;
		y = -7;
		r.trasla(x, y);
		System.out.println("Vertice: " + "(" + r.getVertex().getAscissa() + ", " + r.getVertex().getOrdinata() + ")");
	}

}
