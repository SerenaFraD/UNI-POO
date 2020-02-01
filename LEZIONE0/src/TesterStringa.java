
public class TesterStringa {
	//VindexOf(), Vreplace, VreplaceAll(vedi meglio), VreplaceFirst, Vsubstring(), Vequals, VequalsIgnoreCase()
	public static void main(String[] args) {
		String str =  "Questo libro sembra un testo di informatica non un testo di matematica";
		
		//Esercizio 2
		//Estraggo la stringa da 23 a 28
		String tmp = str.substring(23, 28);
		System.out.println(tmp);
		
		//Replace: Rimpiazzo la stringa testo con saggio
		System.out.println(str.replace(tmp, "saggio"));
		
		//ReplaceFirst: Rimpiazzo la stringa testo con saggio alla prima occorrenza
		System.out.println(str.replaceFirst(tmp, "saggio"));
		
		//Controllo qual è il primo indice da cui compare la stringa
		int index = str.indexOf(tmp);
		System.out.println(index);
		
		//Verifica se una stringa è uguale a un'altra senza tener conto del Case
		System.out.println(tmp.equalsIgnoreCase("TeStO"));
		
		//Verifica se una stringa è uguale a un'altra
		System.out.println(tmp.equals("Testo"));
		
		//Esercizio 1
		String stringa = " sembra un testo ";
		index = str.indexOf(stringa);
		tmp = str.substring(index, index + stringa.length());
		str = str.replaceFirst(tmp, " ");
		stringa = " non un testo di matematica";
		index = str.indexOf(stringa);
		tmp = str.substring(index, index + stringa.length());
		str = str.replaceFirst(tmp, " ");
		System.out.println(str.toUpperCase());
	}
}
