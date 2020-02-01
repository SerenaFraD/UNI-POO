package figureGeometriche;

public class Rettangolo extends FiguraGeometricaPiana {
	private double altezza;
	private double lato;
	
	public Rettangolo(double altezza, double lato) {
		this.altezza = altezza;
		this.lato = lato;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public double getLato() {
		return lato;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public void setLato(double lato) {
		this.lato = lato;
	}
	
	public double getArea() {
		return lato * altezza;
	}
	
	public double getPerimetro() {
		return 2 * (lato * altezza);
	}
}
