package esame;

public class DataSet {

	private double sum; 
	private Measurable minimum; 
	private Measurable maximum; 
	private int count;
	
	public DataSet() { 
		sum = 0; 
		count = 0; 
		minimum = null; 
		maximum= null; 
	}
	
	public double getAverage() { 
		if(count == 0) 
			return 0; 
		else 
			return sum / count; 
		}
	
	/**Restituisce un oggetto Measurable di misura massima 
	*/ 
	public Measurable getMaximum() { 
		return maximum; 
	}
	
	public Measurable getMinimum() {  
		return minimum; 
	}
	
	//Aggiunge un oggetto Measurable e aggiorna i dati 
	public void add(Measurable x) { 
		sum = sum + x.getMeasure(); 
		
		if(count == 0 || minimum.getMeasure() > x.getMeasure())     
			minimum = x; 
		if (count == 0 || maximum.getMeasure() < x.getMeasure())   
			maximum = x;        
		
		count++; 
	}
}
