package measurer;

import java.util.ArrayList;

public class DataSetMeasurer {

	public static double average(ArrayList<Object> objects, Measurer meas) {
		double average = 0.0;

		for (Object o : objects) {
			average = average + meas.measure(o);
		}

		if (objects.size() > 0)
			return average / objects.size();
		else
			return 0.0;
	}
}
