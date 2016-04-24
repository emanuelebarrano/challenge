package it.bologna.emanuele.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.dao.TwitDAOImpl;
import it.bologna.emanuele.domain.Twit;

@RestController
public class TweetController {

	@RequestMapping("/read/{userId}")
	public List<Twit> getAllById(@PathVariable int userId) {

		TwitDAOImpl twitDao = new TwitDAOImpl();

		List<Twit> result = twitDao.getAllById(userId);

		return result;
	}

	@RequestMapping("/read/{userId}/search={text}")
	public List<Twit> getAllByIdAndText(@PathVariable int userId, @PathVariable String text) {

		TwitDAOImpl twitDao = new TwitDAOImpl();

		List<Twit> result = twitDao.getAllByIdAndText(userId, text);

		return result;
	}

}
