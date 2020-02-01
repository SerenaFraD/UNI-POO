package package1;

public final class Targa {
	private final String c1;
	private final int c2;
	private final String c3;

	public Targa(String targa) {
		c1 = targa.substring(0, 2).toUpperCase();
		c2 = Integer.parseInt(targa.substring(2, 5));
		c3 = targa.substring(5, 7).toUpperCase();
	}

	public Targa() {
		c1 = c3 = null;
		c2 = 0;
	}

	public final String getTarga() {
		return c1 + c2 + c3;
	}

	public final String getC1() {
		return c1;
	}

	public int getC2() {
		return c2;
	}

	public String getC3() {
		return c3;
	}

	public String toString() {
		return getClass().getName() + "[targa=" + c1 + c2 + c3 + "]";
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (o.getClass() == this.getClass())
			return false;

		String other = ((Targa) o).getTarga();

		return this.getTarga().equals(other);
	}

	public Targa clone() {
		try {
			return (Targa) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
