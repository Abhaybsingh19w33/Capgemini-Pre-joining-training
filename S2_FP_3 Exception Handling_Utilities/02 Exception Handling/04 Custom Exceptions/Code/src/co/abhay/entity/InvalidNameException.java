package co.abhay.entity;

public class InvalidNameException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNameException() {
	}

	public InvalidNameException(String arg0) {
		super(arg0);
	}

	public InvalidNameException(Throwable arg0) {
		super(arg0);
	}

	public InvalidNameException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidNameException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
