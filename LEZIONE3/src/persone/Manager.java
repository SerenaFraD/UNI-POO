package persone;

import banca.BankAccount;

public class Manager {
	private String nome;
	private String incarico;
	private String area;
	private double retribuzione;
	private BankAccount bankAccount;
	
	public Manager(String nome, String incarico, String area, double retribuzione, BankAccount bankAccount) {
		this.nome = nome;
		this.incarico = incarico;
		this.area = area;
		this.retribuzione = retribuzione;
		this.bankAccount = bankAccount.clone();
	}
	
	public Manager(String nome, BankAccount bankAccount) {
		this.nome = nome;
		this.bankAccount = bankAccount.clone();
	}

	public String getNome() {
		return nome;
	}

	public String getArea() {
		return area;
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

	public void setArea(String area) {
		this.area = area;
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
		return getClass().getName() + "[nome=" + nome + ", incarico=" + incarico + ", area=" + area + 
				", retribuzione=" + retribuzione + ", bankAccount=" + bankAccount.toString() + "]";
	}
	
	public boolean equals(Object o) {
		if(o == null)
			return false;
		
		if(o.getClass() != this.getClass())
			return false;
		
		Manager other = (Manager) o;
		
		return this.nome.equals(other.nome) && this.incarico.equals(other.incarico) && 
				this.area.equals(other.area) && this.retribuzione == other.retribuzione && this.bankAccount.equals(other.bankAccount);
	}
	
	public Object clone() {
		try {
			Manager other = (Manager) super.clone();
			other.bankAccount = bankAccount.clone();
			
			return other;
		} catch (CloneNotSupportedException e){
			return null;
		}
	}
}
