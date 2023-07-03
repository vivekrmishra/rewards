package com.techwish.rewards.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomRewardExceptionHandler {

	@ExceptionHandler(value = {RecordNotFoundException.class})
	  public ResponseEntity<Error> resourceNotFoundException(RecordNotFoundException ex, WebRequest request) {
	    Error message = new Error(
	        HttpStatus.NOT_FOUND.value(),
	        ex.getMessage());
	    
	    return new ResponseEntity<Error>(message, HttpStatus.NOT_FOUND);
	  }}