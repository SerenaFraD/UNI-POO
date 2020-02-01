package package1;

import package2.Estrattore;

public final class Autore implements Estrattore {
	private final String nome;
	private final String cognome;
	private final String nascita;

	public Autore(String n, String cog, String birth) {
		nome = n;
		cognome = cog;
		nascita = birth;
	}

	public Autore() {
		nome = null;
		cognome = null;
		nascita = null;
	}

	public final String getNome() {
		return nome;
	}

	public final String getCognome() {
		return cognome;
	}

	public final String getNascita() {
		return nascita;
	}

	public Autore clone() {
		try {
			Autore cloned = (Autore) super.clone();

			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public String estrai() {
		return this.cognome + " " + this.nascita;
	}
}
