package com.example.externalconfig.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionHandler extends ResponseEntityExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> exception(Exception e) {

		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);

	}

}
