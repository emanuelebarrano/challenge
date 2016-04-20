package it.bologna.emanuele.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.dao.TwitDAO;
import it.bologna.emanuele.dao.TwitDAOImpl;
import it.bologna.emanuele.domain.Twit;

@RestController
public class ReadTweetController {

	@RequestMapping("/read/{userId}")
	public Twit message(@PathVariable String userId) {

		TwitDAOImpl twitDao =  new TwitDAOImpl();
		twitDao.getAll();
		
		Twit twit = new Twit(userId, "Hello " + userId);
		return twit;
	}

}
