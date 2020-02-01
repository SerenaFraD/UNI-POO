package esame;

public class VotoEsameTest {
	public static void main(String args[]) {
		DataSet ds = new DataSet();

		ds.add(new VotoEsame(20, "C"));
		ds.add(new VotoEsame(30, "A+"));
		ds.add(new VotoEsame(25, "B"));
		ds.add(new VotoEsame(27, "B+"));

		Measurable max = ds.getMaximum();
		VotoEsame v = (VotoEsame) max;
		System.out.println("Il voto massimo è " + max.getMeasure() + " " + v.getLettera());

		Measurable min = ds.getMinimum();
		System.out.println("Il voto minimo è " + min.getMeasure());

		System.out.println("La madia è " + ds.getAverage());
	}
}
