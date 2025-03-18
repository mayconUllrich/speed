package com.jupter.speed.exceptions;

import java.time.LocalDateTime;

public class BusinessException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private LocalDateTime timestamp;
	private String customMessage;
	
	public BusinessException(String customMessage, Throwable cause) {
		super(customMessage, cause);
		this.timestamp = LocalDateTime.now();
	}

	// Getters and Setters
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getCustomMessage() {
		return customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}
	
	
	
}
