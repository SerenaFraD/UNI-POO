package figureGeometriche;

public class TriangoloIsoscele extends FiguraGeometricaPiana {
	private double altezza;
	private double lato;
	private double base;
	
	public TriangoloIsoscele(double altezza, double lato, double base) {
		this.altezza = altezza;
		this.lato = lato;
		this.base = base;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public double getLato() {
		return lato;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public void setLato(double lato) {
		this.lato = lato;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getArea() {
		return altezza * base / 2;
	}
	
	public double getPerimetro() {
		return (2 * lato) + base;
	}
}
