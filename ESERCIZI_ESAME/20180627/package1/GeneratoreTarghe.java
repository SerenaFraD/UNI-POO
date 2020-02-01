package package1;

public class GeneratoreTarghe {
	private Targa targa;
	private static Targa ultima = new Targa("AA123cc");

	public GeneratoreTarghe() {
		targa = new Targa(ultima.getTarga());
		newTarga();
	}

	public Targa getTarga() {
		return targa;
	}

	public void setTarga(Targa targa) {
		this.targa = targa;
	}

	public static String getUltima() {
		return ultima.getTarga();
	}

	public static void setUltima(Targa ultima) {
		GeneratoreTarghe.ultima = ultima;
	}

	public void update(Targa t) {
		GeneratoreTarghe.ultima = t;
	}

	private void newTarga() {
		String c1 = GeneratoreTarghe.ultima.getC1();
		int c2 = GeneratoreTarghe.ultima.getC2();
		char c30 = GeneratoreTarghe.ultima.getC3().charAt(0);
		char c31 = GeneratoreTarghe.ultima.getC3().charAt(1);
		
		if(c31 == 'Z') {
			c31 = 'A';
			if(c30 == 'Z') {
				c30 = 'A';
				c2++;
			}
			c30++;
		} else {
			c31++;
		}

		ultima = new Targa(c1 + c2 + c30 + c31);
		return;
	}
	
	public String toString() {
		return getClass().getName() + "[targa=" + targa.toString() + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() == this.getClass())
			return false;

		GeneratoreTarghe other = (GeneratoreTarghe) o;

		return this.targa.equals(other.targa);
	}

	public GeneratoreTarghe clone() {
		try {
			GeneratoreTarghe cloned = (GeneratoreTarghe) super.clone();
			cloned.targa = this.targa.clone();

			return cloned;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
