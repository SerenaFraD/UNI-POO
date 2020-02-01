package package1;

public class Collocazione {
	private String settore;
	private String posizione;
	
	public Collocazione(String set, String pos) {
		settore = set.toUpperCase();
		posizione = pos;
	}
	
	public Collocazione() {
		settore = null;
		posizione = null;
	}

	public String getSettore() {
		return settore;
	}

	public void setSettore(String settore) {
		this.settore = settore;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setCollocazione(String pos) {
		this.posizione = pos;
	}
	
	public Collocazione clone() {
		try {
			Collocazione cloned = (Collocazione) super.clone();

			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
