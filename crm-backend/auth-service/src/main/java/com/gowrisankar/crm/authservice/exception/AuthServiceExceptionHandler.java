package com.gowrisankar.crm.authservice.exception;

import java.util.List;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.gowrisankar.crm.authservice.dto.FailureResponseDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class AuthServiceExceptionHandler {

	@ExceptionHandler(InternalSystemException.class)
	public FailureResponseDto handleInternalSystemException(InternalSystemException ise) {
		log.error("InternalSystemException: ", ise);
		return new FailureResponseDto(List.of(ise.getMessage()));
	}
}
