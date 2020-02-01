package concatenaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CatFiles {

	public static void main(String[] args) throws IOException {
		// Dichiarazione del file in cui concatenare i file
		// creazione del file in cui concatenare i file
		// prendere in input i file da concatenare
		// scrivere un file alla volta
		File fileConcatenazione = new File("concat.txt");
		PrintWriter writer = new PrintWriter(new FileOutputStream(fileConcatenazione));

		// Lista di files da concatenare
		ArrayList<File> files = new ArrayList<File>();
		files.add(new File("lettura1.txt"));
		files.add(new File("lettura2.txt"));
		files.add(new File("lettura3.txt"));

		// Controllo che i file esistano con try e catch
		// Procedo con la lettura e copia in fileConcatenazione
		for (File f : files) {
			try {
				FileReader str = new FileReader(f);
				Scanner in = new Scanner(str);
				String s; // Stringa letta da f

				// Ciclo di lettura del file fino a che si ha una nexLine
				while (in.hasNextLine()) {
					s = in.nextLine();
					writer.println(s);
				}
				in.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		writer.close();
	}

}
