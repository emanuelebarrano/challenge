package it.bologna.emanuele.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import it.bologna.emanuele.presentation.JsonModel;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	public @ResponseBody JsonModel gestioneSystemException(Exception ex) {

		JsonModel response = new JsonModel("KO");

		response.setResponse(ex.getMessage());

		return response;

	}

}
