package org.assetsglobal.utility;

public class SimpleResponseStructure {

	private String message;
	private int statusCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public SimpleResponseStructure(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}

	public SimpleResponseStructure() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SimpleResponseStructure [message=" + message + ", statusCode=" + statusCode + "]";
	}

}
