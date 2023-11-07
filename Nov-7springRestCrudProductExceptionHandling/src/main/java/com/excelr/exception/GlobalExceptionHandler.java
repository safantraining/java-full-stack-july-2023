package com.excelr.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(InValidPriceException.class)
	public ResponseEntity<ErroInfo> handlePrice(InValidPriceException inValidPriceException)
	{
	            ErroInfo erroInfo = new ErroInfo();
	            erroInfo.setErrorMessage(inValidPriceException.getMsg());
	            erroInfo.setStatus(HttpStatus.BAD_REQUEST.toString());
	            erroInfo.setLocalDateTime(LocalDateTime.now());
		
	            return new ResponseEntity<ErroInfo>(erroInfo, HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ErroInfo> idNotFound(IdNotFoundException idNotFoundException)
	{
		ErroInfo erroInfo = new ErroInfo();
		erroInfo.setErrorMessage(idNotFoundException.getMsg());
		erroInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		erroInfo.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ErroInfo>(erroInfo, HttpStatus.NOT_FOUND);
	}
}
