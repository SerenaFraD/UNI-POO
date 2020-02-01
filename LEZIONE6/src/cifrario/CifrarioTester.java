package cifrario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CifrarioTester {
	public static void main(String args[]) throws IOException {
		File codifica = new File("codifica.txt");
		PrintWriter out = new PrintWriter(new FileOutputStream(codifica));
		String tmp;

		File codice = new File("codice.txt");

		if (!codice.exists()) {
			codice.createNewFile();
			PrintWriter outTmp = new PrintWriter(new FileOutputStream(codice));
			outTmp.println("Test Bitch");
			outTmp.close();
		}

		Scanner in = new Scanner(codice);

		while (in.hasNextLine()) {
			tmp = Cifrario.cifra(in.nextLine(), 11);
			out.println(tmp);
		}

		in.close();
		out.close();
	}
}
