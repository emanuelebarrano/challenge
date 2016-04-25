package it.bologna.emanuele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.domain.Twit;
import it.bologna.emanuele.presentation.JsonModel;
import it.bologna.emanuele.service.TwitService;

@RestController
public class TwitController {

	@Autowired
	TwitService twitService;

	@RequestMapping(value = "/read/{userId}", produces = "application/json")
	public JsonModel getAllById(@PathVariable int userId) {

		JsonModel response = new JsonModel("OK");

		List<Twit> result = twitService.getAllById(userId);

		response.setResponse(result);

		return response;
	}

	@RequestMapping(value = "/read/{userId}", params = { "search" }, produces = "application/json")
	public JsonModel getAllByIdAndText(@PathVariable int userId, @RequestParam(value = "search") String text) {

		JsonModel response = new JsonModel("OK");

		List<Twit> result = twitService.getAllByIdAndText(userId, text);

		response.setResponse(result);

		return response;
	}

}
