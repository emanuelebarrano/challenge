package it.bologna.emanuele.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bologna.emanuele.dao.TwitDAO;
import it.bologna.emanuele.domain.Twit;

@Service
public class TwitService {

	@Autowired
	TwitDAO twitDao;

	public List<Twit> getAllById(int userId) {

		List<Twit> result = twitDao.getAllById(userId);

		return result;

	}

	public List<Twit> getAllByIdAndText(int userId, String text) {

		List<Twit> result = twitDao.getAllByIdAndText(userId, text);

		return result;

	}

}
