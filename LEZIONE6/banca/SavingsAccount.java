package banca;

import anagrafica.Cliente;

public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	public SavingsAccount (int anAccountNumber, Cliente c, double rate) {  
		super(anAccountNumber, c.clone());
		interestRate = rate;
	} 
	
	public SavingsAccount (int anAccountNumber, double initialBalance, double rate) {  
		super(anAccountNumber, initialBalance);
		interestRate = rate;
	} 
	
	public void addInterest() { 
		double interest = this.getBalance() * this.interestRate / 100;   
		this.deposit(interest);
	} 
	
	public String toString() {
		return super.toString() + "[interestRate=" + interestRate + "]";
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o))
			return false;
		
		SavingsAccount other = (SavingsAccount) o;
		
		return interestRate == other.interestRate;
	}
	
	public SavingsAccount clone() {
		SavingsAccount cloned = (SavingsAccount) super.clone();
		
		cloned.interestRate = interestRate;
		
		return cloned;
	}
}
