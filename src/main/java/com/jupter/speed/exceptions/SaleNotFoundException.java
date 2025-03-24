package com.jupter.speed.exceptions;

public class SaleNotFoundException extends RuntimeException {
		
	/* Tratamento de exceção para venda não encontrada*/
	
	private static final long serialVersionUID = 1L;

	public SaleNotFoundException() {
		super("Sale not found");
	}
	
	public SaleNotFoundException(String message) {
		super(message);
	}

}
