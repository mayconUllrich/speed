package com.jupter.speed.exceptions;

public class CategoryNotFoundException extends RuntimeException {
		
	/* Tratamento de exceção para categoria não encontrada*/
	
	private static final long serialVersionUID = 1L;

	public CategoryNotFoundException() {
		super("Category not found");
	}
	
	public CategoryNotFoundException(String message) {
		super(message);
	}

}
