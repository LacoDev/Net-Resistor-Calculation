import java.lang.RuntimeException;
public class IDNotUniqueException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1522258199589607651L;

	public IDNotUniqueException() {
		super();
	}

	public IDNotUniqueException(String message){
		super(message);
	}
}