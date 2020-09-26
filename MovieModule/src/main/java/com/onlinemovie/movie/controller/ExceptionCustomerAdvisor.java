package com.onlinemovie.movie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onlinemovie.movie.exception.AllException;
import com.onlinemovie.movie.exception.MovieException;


@RestControllerAdvice
public class ExceptionCustomerAdvisor {

	@ExceptionHandler(AllException.class)
	public ResponseEntity<String> handleEmployeeExceptionAction(AllException exp){
		return new ResponseEntity<String>(exp.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MovieException.class)
	public ResponseEntity<String> handleExceptionAction(Exception exp){
		return new ResponseEntity<String>(exp.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
