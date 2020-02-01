import java.util.Scanner;

public class Banca {

	public static void main(String[] args) {
		
		int scelta;
		int saldo = 0;
		int q;
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("<----- MENU ----->\n");
			System.out.println("1. Controlla saldo\n");
			System.out.println("2. Versamento\n");
			System.out.println("3. Prelievo\n");
			System.out.println("0. Fine programma\n");
			System.out.println("<---------------->\n");
			scelta = in.nextInt();

			switch (scelta) {
				case 1:
					stampaSaldo(saldo);
					break;

				case 2:
					System.out.println("Inserisci il quantitativo --> ");
					q = in.nextInt();
					saldo = versamento(saldo, q);
					break;

				case 3:
					System.out.println("Inserisci il quantitativo --> ");
					q = in.nextInt();
					saldo = prelievo(saldo, q);
					break;

				case 0:
					System.out.println("Arrivederci!");
			}
		} while(scelta != 0);

		in.close();
		return;
	}

	public static void stampaSaldo(int saldo) {
		System.out.print("Il saldo e': ");
		System.out.println(saldo);
	}

	public static int versamento(int saldo, int q) {
		saldo += q;
		stampaSaldo(saldo);
		return saldo;
	}

	public static int prelievo(int saldo, int q) {
		if(q > saldo) {
			System.out.println("Non e' possibile effettuare il prelievo\n");
			return 0;
		} else {
			saldo -= q;
			stampaSaldo(saldo);
			return saldo;
		}
		
	}
	
}

