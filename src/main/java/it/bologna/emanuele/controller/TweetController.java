package it.bologna.emanuele.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.dao.TwitDAO;
import it.bologna.emanuele.dao.TwitDAOImpl;
import it.bologna.emanuele.domain.Twit;

@RestController
public class TweetController {

	@RequestMapping("/read/{userId}")
	public List<Twit> message(@PathVariable int userId) {

		TwitDAOImpl twitDao =  new TwitDAOImpl();
		

		
		List<Twit> result = twitDao.getAllById(userId);
		
		
		return result;
	}

}
