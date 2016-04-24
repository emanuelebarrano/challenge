package it.bologna.emanuele.dao;

import java.util.List;

import it.bologna.emanuele.domain.Twit;

public interface TwitDAO {

	public List<Twit> getAllById(int userId);

	public List<Twit> getAllByIdAndText(int userId, String text);

}