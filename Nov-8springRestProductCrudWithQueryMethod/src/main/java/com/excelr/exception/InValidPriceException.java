package com.excelr.exception;

public class InValidPriceException extends RuntimeException{

	String msg;

	public InValidPriceException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
	

}
