
public class SessioneSuccessiva {
	public static void main(String[] args) {
		String str = "Sessione successiva";
		
		str = str.replaceAll("i", "!");
		str = str.replace("s", "$"); //Questa da problemi con replaceAll
		str = str.replaceAll("e", "&");
		System.out.println(str);
	}
}
