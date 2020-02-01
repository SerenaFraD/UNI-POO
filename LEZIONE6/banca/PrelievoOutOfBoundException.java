
public class PrelievoOutOfBoundException extends RuntimeException {
	
	public PrelievoOutOfBoundException() {
		super("La quantità di denaro inserita non è prelevabile");
	}

	public PrelievoOutOfBoundException(String msg) {
		super(msg);
	}
}
