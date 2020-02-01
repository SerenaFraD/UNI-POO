package banca;

import anagrafica.Cliente;
import java.util.*;

public class BankAccount { 
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
		if(initialBalance >= 0)
			thrown new IllegalArgumentException("Il saldo inserito è negativo");
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
		if(amount < 0)
			thrown new IllegalArgumentException("Il saldo inserito è negativo");
		double newBalance = balance + amount;
		balance = newBalance; 
	} 
	
	/**
	 * Setter: Effettua il deposito dei una cifra pari al valore passato come parametro
	 * @param amount double con il valore che si sottrae a balance
	 */
	public void withdraw(double amount) {
		if(amount < 0 && amount > balance)
			trown new PrelievoOutOfBoundException();
		
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
			b.accountNumber = this.accountNumber;
			b.balance = this.balance;
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
