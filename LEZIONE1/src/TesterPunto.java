//Il test non deve essere interattivo, quindi non devono esserci interazioni con l'utente. Generato da sorgente o da file.
//Ci vuole il tracciamento, deve dirmi cosa fa il tester e deve dirmi se il test ha avuto successo
//Tutte le righe del codice devono essere testate: es. c'è un if, allora devo provare entrambe le condizioni
public class TesterPunto {
	
	public static void main(String[] args) {
		System.out.println("Istanzio un punto senza passare i punti");
		Punto p = new Punto();
		
		System.out.println("Valori del punto\norindata: " + p.getAscissa() + " ascissa: " + p.getOrdinata());
		
		System.out.println("Inserisco x = 1; y = 2");
		p.setAscissa(1.0);
		p.setOrdinata(2.0);
		System.out.println("Valori del punto\norindata: " + p.getAscissa() + " ascissa: " + p.getOrdinata());
		
		System.out.println("Istanzio un punto passando il punto (1,2)");
		Punto point =  new Punto(1, 2);
		System.out.println("Valori del punto\norindata: " + point.getAscissa() + " ascissa: " + point.getOrdinata());
	}
}
