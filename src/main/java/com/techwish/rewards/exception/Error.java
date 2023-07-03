package com.techwish.rewards.exception;

public class Error {
	private int statusCode;
	private String message;
	
	
	public Error(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
	
	public int getStatusCode() {
		return statusCode;
	}

	public String getMessage() {
		return message;
	}  
}