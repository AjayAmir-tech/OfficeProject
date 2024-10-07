package com.off.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.off.exceptions.NameException;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(NameException.class)
	public ResponseEntity<String> getName(NameException ne) {
		return new ResponseEntity<>(ne.getMessage(),HttpStatus.NOT_FOUND);
	}

}
