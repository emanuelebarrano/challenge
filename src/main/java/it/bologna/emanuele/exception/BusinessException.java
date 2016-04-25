package it.bologna.emanuele.exception;

public class BusinessException extends Exception {

	String message;

	public BusinessException(String message) {
		this.message = message;
	}

}
