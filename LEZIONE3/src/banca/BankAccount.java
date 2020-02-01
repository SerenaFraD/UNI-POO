package banca;

import anagrafica.Cliente;

public class BankAccount implements Cloneable { 
	private int accountNumber;
	private double balance;
	private Cliente cliente;
	
	/**
	 * Metodo costruttore
	 * @param anAccountNumber un intero che indica il numero di conto corrente
	 */
	public BankAccount(int anAccountNumber, Cliente c) {
		this.accountNumber = anAccountNumber;
		this.balance = 0;
		cliente = c.clone();
	}
	
	/**
	 * Metodo costruttore con valore iniziale
	 * @param anAccountNumber numero del conto corrente
	 * @param initialBalance valore iniziale del conto corrente
	 */
	public BankAccount(int anAccountNumber, double initialBalance) {
		assert initialBalance >= 0;
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
	 * Setter: Effettua il deposito di una cifra pari al valore passato come parametro
	 * @param amount double con il valore che si aggiunge a balance
	 */
	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance; 
	} 
	
	/**
	 * Setter: Effettua il deposito dei una cifra pari al valore passato come parametro
	 * @param amount double con il valore che si sottrae a balance
	 */
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}
	
	/**
	 * Getter: Ritorna la quantità di denaro 
	 * @return double con la quantità di denaro del conto
	 */
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return getClass().getName() + "[accountNumber=" + accountNumber + " ,balance=" + balance + " ,cliente" + cliente.clone() + "]";
	}
	
	public BankAccount clone() {
		try {
			BankAccount b = (BankAccount) super.clone();
			b.cliente = cliente.clone();
			
			return b;
		}
		
		catch(CloneNotSupportedException e) {
			 return null;
		}
	}
	
	public boolean equals(Object o) {
		if(o == null)
			return false;
		
		if(getClass() != o.getClass())
			return false;
		
		BankAccount other = (BankAccount) o;
		
		return (balance == other.balance) && (accountNumber == other.accountNumber) && (cliente.equals(this.cliente));
	}
}
