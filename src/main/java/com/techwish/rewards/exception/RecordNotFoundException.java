package com.techwish.rewards.exception;

public class RecordNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3179507855117878588L;

	public RecordNotFoundException () {
		super("Record Not Found");
	}
}
