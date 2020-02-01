package persone;

import banca.BankAccount;

public class Impiegato {
	private String nome;
	private String incarico;
	private double retribuzione;
	private BankAccount bankAccount;
	
	public Impiegato(String nome, String incarico, double retribuzione, BankAccount bankAccount) {
		this.nome = nome;
		this.incarico = incarico;
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
	
	public String getIncarico() {
		return incarico;
	}

	public void setIncarico(String incarico) {
		this.incarico = incarico;
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
		return getClass().getName() + "[nome=" + nome + ", incarico=" + incarico + ", retribuzione=" + retribuzione + ", bankAccount=" + bankAccount.toString() + "]";
	}
	
	public boolean equals(Object o) {
		if(o == null)
			return false;
		
		if(o.getClass() != this.getClass())
			return false;
		
		Impiegato other = (Impiegato) o;
		
		return this.nome.equals(other.nome) && this.incarico.equals(other.incarico) && this.retribuzione == other.retribuzione && this.bankAccount.equals(other.bankAccount);
	}
	
	public Object clone() {
		try {
			Impiegato other = (Impiegato) super.clone();
			other.bankAccount = bankAccount.clone();
			
			return other;
		} catch (CloneNotSupportedException e){
			return null;
		}
	}
}
