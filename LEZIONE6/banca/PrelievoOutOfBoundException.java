
public class PrelievoOutOfBoundException extends RuntimeException {
	
	public PrelievoOutOfBoundException() {
		super("La quantit� di denaro inserita non � prelevabile");
	}

	public PrelievoOutOfBoundException(String msg) {
		super(msg);
	}
}
