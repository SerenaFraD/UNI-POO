package measurer;
import java.awt.Rectangle;

public class RectangleAreaMeasurer implements Measurer{

	public double measure(Object anObject) {
		Rectangle r = (Rectangle) anObject;
		
		double area = r.getHeight() * r.getWidth();
		
		return area;
	}

}
