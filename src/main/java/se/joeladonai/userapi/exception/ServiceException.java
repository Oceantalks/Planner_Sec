package se.joeladonai.userapi.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -1654934775714970360L;

	public ServiceException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ServiceException(String message) {
		super(message);
	}

}
