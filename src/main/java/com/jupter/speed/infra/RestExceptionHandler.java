package com.jupter.speed.infra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jupter.speed.exceptions.CategoryNotFoundException;
import com.jupter.speed.exceptions.SaleItemNotFoundException;
import com.jupter.speed.exceptions.SaleNotFoundException;
import com.jupter.speed.exceptions.StorangeNotFoundException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(CategoryNotFoundException.class)
	private ResponseEntity<RestErrorMessage> handleCategoryNotFoundException(CategoryNotFoundException ex) {
		RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}

	@ExceptionHandler(SaleItemNotFoundException.class)
	private ResponseEntity<RestErrorMessage> handleSaleItemNotFoundException(SaleItemNotFoundException ex) {
		RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}

	@ExceptionHandler(SaleNotFoundException.class)
	private ResponseEntity<RestErrorMessage> handleSaleNotFoundException(SaleNotFoundException ex) {
		RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}

	@ExceptionHandler(StorangeNotFoundException.class)
	private ResponseEntity<RestErrorMessage> handleStorangeNotFoundException(StorangeNotFoundException ex) {
		RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
	}

}
