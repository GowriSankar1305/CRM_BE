package com.gowrisankar.crm.authservice.dto;

public class SuccessResponseDto {

	private final String message;

	public SuccessResponseDto(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
