package azienda;

import java.util.ArrayList;

public class Azienda {
	
	private ArrayList<Lavoratore> lav;
	
	public Azienda() {
		lav = new ArrayList<Lavoratore>();
	}

	public void addLavoratore(String nome) {
		Lavoratore l = new Lavoratore(nome);
		lav.add(l);
	}
	
	public boolean setSalario(String nome, int ore) {
		int index = find(nome);
		
		if(index == -1)
			return false;
		else {			
			lav.get(index).setSalario(ore);
			return true;
		}
	}
	
	public double getSalario(String nome) {
		int index = find(nome);
		
		if(index == -1)
			return 0.0;
		else {			
			return lav.get(index).getSalario();	
		}
	}	
	
	public String toString() {
		String s =  getClass().getName() + "[lav=";
		
		for(Lavoratore l : lav) {
			s = s + " " + l.getSalario() + " " + l.getNome();
		}
		
		s = s + "]";
		
		return s;
	}
	
	public boolean equals(Object o) {
		if(o == null) 
			return false;
		
		if(getClass() != o.getClass())
			return false;
		
		ArrayList<Lavoratore> other = ((ArrayList<Lavoratore>) o);
		
		int index;
		
		for(index = 0; index < lav.size(); index++) {
			if(lav.get(index).getSalario() != other.get(index).getSalario()) {
				return false;
			}
		}
		
		return true;
	}
	
	public ArrayList<Lavoratore> clone() {
		try {
			ArrayList<Lavoratore> clone = (ArrayList<Lavoratore>) super.clone();
			
			return clone;
		}
		
		catch(CloneNotSupportedException e) {
			return null;
		}
	}

	private int find(String nome) {
		int index = 0;
		
		for(Lavoratore l:lav) {
			if(l.getNome().equals(nome)) {
				return index;
			}
			index++;
		}	
		
		return -1;
	}
}
