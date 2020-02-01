package banca;

import anagrafica.Cliente;

public class CheckingAccount extends BankAccount {
	
	private final double TRANSACTION_FEE = 0.10;
	private final int FREE_TRANSACTIONS = 20;
	private int transactionCount; 
	
	public CheckingAccount (int anAccountNumber, Cliente c, double rate) {  
		super(anAccountNumber, c.clone());
		transactionCount = 0;
	} 
	
	public CheckingAccount (int anAccountNumber, double initialBalance, double rate) {  
		super(anAccountNumber, initialBalance);
		transactionCount = 0;
	}
	
	public void deposit(double amount) {
		transactionCount++;
		super.deposit(amount); 
	} 
	
	public void withdraw(double amount) {
		transactionCount++;
		super.withdraw(amount);
	} 
	public void deductFees() {
		if(transactionCount > FREE_TRANSACTIONS) { 
			double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS); 
			super.withdraw(fees); 
		}
	} 
	
	public String toString() {
		return super.clone() + "[TRANSACTION_FEE=" + TRANSACTION_FEE + " ,FREE_TRANSACTIONS=" + FREE_TRANSACTIONS + " ,transactionCount=" + transactionCount + "]";
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o))
			return false;
		
		CheckingAccount other = (CheckingAccount) o;
		
		return transactionCount == other.transactionCount;
	}
	
	public CheckingAccount clone() {
		CheckingAccount cloned = (CheckingAccount) super.clone();
		
		cloned.transactionCount = transactionCount;
		
		return cloned;
	}
}

