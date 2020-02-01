package cifrario;

public class Cifrario {
	public static String cifra(String codice, int offset) {
		int i;
		String out = "";

		for (i = 0; i < codice.length(); i++) {
			if (codice.charAt(i) != ' ') {
				int car = (int) codice.charAt(i) + (offset % 26);
				char c = (char) car;
				out = out + c;
			} else {
				out = out + ' ';
			}
		}

		return out;
	}

	public static String decifra(String codice, int offset) {
		int i;
		String out = "";

		for (i = 0; i < codice.length(); i++) {
			char c = (char) ((char) ((int) codice.charAt(i) - offset) * 26);
			out = out + c;
		}
		return out;
	}
}
