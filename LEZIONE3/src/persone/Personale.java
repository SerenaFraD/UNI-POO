package persone;

import banca.BankAccount;

public class Personale {
	private String nome;
	private double retribuzione;
	private BankAccount bankAccount;
	
	public Personale(String nome, double retribuzione, BankAccount bankAccount) {
		this.nome = nome;
		this.retribuzione = retribuzione;
		this.bankAccount = bankAccount.clone();
	}

	public String getNome() {
		return nome;
	}

	public double getRetribuzione() {
		return retribuzione;
	}
	
	public BankAccount getBankAccount() {
		return this.bankAccount.clone();
	}
	
	public void setRetribuzione(double retribuzione) {
		this.retribuzione = retribuzione;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public String toString() {
		return getClass().getName() + "[nome=" + nome + ", retribuzione=" + retribuzione + ", bankAccount=" + bankAccount.toString() + "]";
	}
	
	public boolean equals(Object o) {
		if(o == null)
			return false;
		
		if(o.getClass() != this.getClass())
			return false;
		
		Personale other = (Personale) o;
		
		return this.nome.equals(other.nome) && this.retribuzione == other.retribuzione && this.bankAccount.equals(other.bankAccount);
	}
	
	public Object clone() {
		try {
			Personale other = (Personale) super.clone();
			other.bankAccount = bankAccount.clone();
			
			return other;
		} catch (CloneNotSupportedException e){
			return null;
		}
	}
}
