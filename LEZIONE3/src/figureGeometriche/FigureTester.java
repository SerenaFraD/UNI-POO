package figureGeometriche;

import java.util.ArrayList;

public class FigureTester {
	public static void main(String args[]) {
		ArrayList<FiguraGeometricaPiana> arr = new ArrayList<FiguraGeometricaPiana>();
		
		arr.add(new TriangoloIsoscele(1, 2, 3));
		arr.add(new Cerchio(2));
		arr.add(new Rettangolo(2, 3));
		
		double indexA = 0.0;
		
		for(FiguraGeometricaPiana f: arr) {
			if(f.getArea() >= indexA)
				indexA = f.getArea();
		}
		
		System.out.println("L'area massima è: " + indexA);
		
		indexA = arr.get(0).getArea();
		
		for(FiguraGeometricaPiana f: arr) {
			if(f.getArea() < indexA)
				indexA = f.getArea();
		}
		
		System.out.println("L'area massima è: " + indexA);
	}
}
