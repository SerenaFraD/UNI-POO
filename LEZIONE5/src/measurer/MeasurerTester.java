package measurer;

import java.awt.Rectangle;
import java.util.ArrayList;

public class MeasurerTester {

	public static void main(String[] args) {
		
		ArrayList<Object> rettangoli = new ArrayList<Object>();
		Measurer meas = new RectangleAreaMeasurer();
		
		rettangoli.add(new Rectangle(5, 10 , 20, 30));
		rettangoli.add(new Rectangle(10, 20 , 30, 40));
		rettangoli.add(new Rectangle(20, 30 , 5, 15));
		
		System.out.println(DataSetMeasurer.average(rettangoli, meas));
	}

}
