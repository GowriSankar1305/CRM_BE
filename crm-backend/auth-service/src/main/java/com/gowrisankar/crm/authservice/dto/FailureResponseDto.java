package com.gowrisankar.crm.authservice.dto;

import java.util.List;

public class FailureResponseDto {

	private final List<String> errors;

	public FailureResponseDto(List<String> errors) {
		this.errors = errors;
	}

	public List<String> getErrors() {
		return errors;
	}
}
