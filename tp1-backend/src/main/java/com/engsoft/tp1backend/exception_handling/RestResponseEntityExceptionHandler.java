package com.engsoft.tp1backend.exception_handling;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.engsoft.tp1backend.exception.EngSoftException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = EngSoftException.class)
	protected ResponseEntity<Object> handleTypeEngSoftException(EngSoftException ex, WebRequest request) {

		ErroResponse erro = new ErroResponse();
		erro.setMensagem(ex.getMessage());
		erro.setTimestamp(new Date());
		erro.setCodigo("400");

		return handleExceptionInternal(ex, erro, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}

	@ExceptionHandler(value = Exception.class)
	protected ResponseEntity<Object> handleTypeException(Exception ex, WebRequest request) {

		ErroResponse erro = new ErroResponse();
		erro.setMensagem("Erro não tratado: " + ex.getMessage());
		erro.setTimestamp(new Date());
		erro.setCodigo("500");

		return handleExceptionInternal(ex, erro, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}
}
