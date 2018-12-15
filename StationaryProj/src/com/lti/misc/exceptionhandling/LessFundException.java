package com.lti.misc.exceptionhandling;

public class LessFundException extends Exception{
	
	private String message;
	
	public LessFundException(String msg) {
		super();
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
}
