package figureGeometriche;

public class Cerchio extends FiguraGeometricaPiana {
	private double raggio;
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	public double getArea() {
		return raggio * raggio * Math.PI;
	}
	
	public double getPerimetro() {
		return 2 * raggio * Math.PI;
	}
}
