package bank;

public class BankAccount { 
	private int accountNumber;
	private double balance;
	
	/**
	 * Metodo costruttore
	 * @param anAccountNumber un intero che indica il numero di conto corrente
	 */
	public BankAccount(int anAccountNumber) {
		this.accountNumber = anAccountNumber;
		this.balance = 0;
	}
	
	/**
	 * Metodo costruttore con valore iniziale
	 * @param anAccountNumber numero del conto corrente
	 * @param initialBalance valore iniziale del conto corrente
	 */
	public BankAccount(int anAccountNumber, double initialBalance) {
		accountNumber = anAccountNumber;
		balance = initialBalance;
	} 
	
	/**
	 * Getter: ritorna il numero di conto corrente
	 * @return intero con il numero del conto;
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * Effettua il deposito di una cifra pari al valore passato come parametro
	 * @param amount double con il valore che si aggiunge a balance
	 */
	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance; 
	} 
	
	/**
	 * Effettua il deposito dei una cifra pari al valore passato come parametro
	 * @param amount double con il valore che si sottrae a balance
	 */
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}
	
	/**
	 * Ritorna la quantità di denaro 
	 * @return double con la quantità di denaro del conto
	 */
	public double getBalance() {
		return balance;
	}
}
