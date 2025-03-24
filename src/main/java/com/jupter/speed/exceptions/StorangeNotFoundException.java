package com.jupter.speed.exceptions;

public class StorangeNotFoundException extends RuntimeException {
		
	/* Tratamento de exceção para armazenamento não encontrado*/
	
	private static final long serialVersionUID = 1L;

	public StorangeNotFoundException() {
		super("Storange not found");
	}
	
	public StorangeNotFoundException(String message) {
		super(message);
	}

}
