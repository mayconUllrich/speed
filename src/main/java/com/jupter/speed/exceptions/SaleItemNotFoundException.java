package com.jupter.speed.exceptions;

public class SaleItemNotFoundException extends RuntimeException {
		
	/* Tratamento de exceção para item de venda não encontrado*/
	
	private static final long serialVersionUID = 1L;

	public SaleItemNotFoundException() {
		super("Sale item not found");
	}
	
	public SaleItemNotFoundException(String message) {
		super(message);
	}

}
