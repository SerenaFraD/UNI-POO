package bank;
import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> bankA;
	
	public Bank() {
		bankA = new ArrayList<BankAccount>();
	}
	
	/**
	 * Aggiunge un conto corrente all'array
	 * @param accountNumber intero, con il numero del conto corrente nuovo
	 * @param initialBalance intero, con la quantità di denaro iniziale 
	 */
	public void addAccount(int accountNumber, int initialBalance) {
		BankAccount ba = new BankAccount(accountNumber, initialBalance);
		bankA.add(ba);
	}
	
	/**
	 * Esegue il deposito di una somma di denaro passata come parametro
	 * @param accountNumber intero con il numero del conto corrente
	 * @param amount intero con la somma di denaro da depositare
	 * @return true se ha trovato il conto, false altrimenti;
	 */
	public boolean deposit(int accountNumber, int amount) {
		int index = find(accountNumber);
		
		if(index == -1)
			return false;
		else {
			bankA.get(index).deposit(amount);
			return true;
		}
	}
	
	/**
	 * Esegue il prelievo di una somma di denaro passata come parametro
	 * @param accountNumber intero con il numero del conto corrente
	 * @param amountamount intero con la somma di denaro da depositare
	 * @return true se ha trovato il conto, false altrimenti;
	 */
	public boolean withdraw(int accountNumber, int amount) {
		int index = find(accountNumber);
		
		if(index == -1)
			return false;
		else {
			bankA.get(index).withdraw(amount);
			return true;
		}
	}
	
	/**
	 * Restituisce il saldo del conto corrente
	 * @param accountNumberr intero con il numero del conto corrente
	 * @return il saldo del conto corrente se il conto è presente, altrimenti -1
	 */
	public double getBalance(int accountNumber) {
		int index = find(accountNumber);
		
		if(index == -1)
			return -1.0;
		else {
			return bankA.get(index).getBalance();
		}
	}
	
	/**
	 * Trasferisce un quantitativo di denaro da un account a un altro
	 * @param fromAccNumber intero, che indica il numero di account da cui prelevare i soldi
	 * @param toAccNumber intero, che indica il numero di account a cui depositare i soldi
	 * @param amount double, che indica il quantitativo di denaro da spostare
	 * @return true se gli account sono stati trovati e il quantitativo di denaro è sufficiente, falso altrimenti
	 */
	public boolean transfer(int fromAccNumber, int toAccNumber, double amount) {
		int indexF = find(fromAccNumber);	//Indice dell'account da cui trasferire 
		int indexT = find(toAccNumber);	//Indice dell'account a cui traasferire
		
		if((indexF != -1) && (indexT != -1))
			if(bankA.get(indexF).getBalance() < amount) 
				return false;
			else {
				bankA.get(indexF).withdraw(amount);
				bankA.get(indexT).deposit(amount);
				
				return true;
			}
		else 
			return false;
		
	}
	
	/**
	 * Cerca l'account tramite il numero di account
	 * @param accountNumber intero, che indica il numero di account
	 * @return l'indice dell'account se è stato trovato, -1 altrimenti  
	 */
	private int find(int accountNumber) {
		int index = 0;
		
		for(BankAccount b:bankA) {
			if(b.getAccountNumber() == accountNumber) {
				return index;
			}
			index++;
		}	
		
		return -1;
	}
}
