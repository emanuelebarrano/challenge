package it.bologna.emanuele.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.dao.TwitDAOImpl;
import it.bologna.emanuele.domain.Twit;

@RestController
public class TwitController {

	@RequestMapping(value = "/read/{userId}", produces = "application/json")
	public List<Twit> getAllById(@PathVariable int userId) {

		TwitDAOImpl twitDao = new TwitDAOImpl();

		List<Twit> result = twitDao.getAllById(userId);

		return result;
	}

	@RequestMapping(value = "/read/{userId}", params = { "search" }, produces = "application/json")
	public List<Twit> getAllByIdAndText(@PathVariable int userId, @RequestParam(value = "search") String text) {

		TwitDAOImpl twitDao = new TwitDAOImpl();

		List<Twit> result = twitDao.getAllByIdAndText(userId, text);

		return result;
	}

}
