package com.onlinemovie.movie.exception;

import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
public class MovieException extends Exception{

	   String msg;
	   HttpStatus status;
	  
	public MovieException(String errorMessage) {
		super(errorMessage);
	}
	
	public MovieException(String msg, HttpStatus status) {
		// TODO Auto-generated constructor stub
		
		this.msg = msg;
		this.status = status;	
		
	}
}
