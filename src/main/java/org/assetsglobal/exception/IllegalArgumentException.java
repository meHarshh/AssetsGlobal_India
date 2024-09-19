package org.assetsglobal.exception;

@SuppressWarnings("serial")

public class IllegalArgumentException extends RuntimeException {

	

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public IllegalArgumentException(String message) {
		super();
		this.message = message;
	}
	
	
}
