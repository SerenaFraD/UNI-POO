package banca;
import anagrafica.Cliente;
import anagrafica.Indirizzo;

public class BankAccountTester {
	public static void main(String args[]) {
		Indirizzo ind = new Indirizzo("aaaa", "bbb", 11, 222);
		Cliente c = new Cliente("Michela", ind);
		SavingsAccount s1 = new SavingsAccount(123, c, 0.5);
		CheckingAccount c1 = new CheckingAccount(321, c, 0);

		SavingsAccount s2 = s1.clone();
		CheckingAccount c2 = c1.clone();

		System.out.println(s1.toString());
		System.out.println(c1.toString());
		System.out.println(s2.toString());
		System.out.println(c2.toString());
		
		System.out.println(s2.equals(s1));
		System.out.println(c2.equals(c1));
		
		c2.deposit(100);
		c2.withdraw(100);
		System.out.println(c2.equals(c1));
	}
}
