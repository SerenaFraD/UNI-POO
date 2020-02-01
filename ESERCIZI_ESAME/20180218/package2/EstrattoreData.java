package package2;

import java.util.ArrayList;

public class EstrattoreData {
	private static ArrayList<String> result;

	public static ArrayList<String> stringheEstratte(ArrayList<Object> list) {
		
		result = new ArrayList<String>();

		for (Object s : list) {
			Estrattore e = (Estrattore) s;
			result.add(e.estrai());
		}

		return result;
	}
}
