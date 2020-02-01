package studenti;

public class TesterStudente {
	
	public static void main(String[] args) {
		System.out.println("Istanzio un nuovo studente senza matricola");
		Studente s = new Studente();
		
		System.out.println("Setto la matricola a 100");
		s.setMatricola("100");
		System.out.println("Matricola: " + s.getMatricola() + "\n");
		
		System.out.println("Aggiungo due esami con voto 30 e 21, la media è ");
		s.addEsame(30.0);
		s.addEsame(21.0);
		System.out.println("La media è " + s.media());
	}
}
