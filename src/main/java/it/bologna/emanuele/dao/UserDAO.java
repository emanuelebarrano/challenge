package it.bologna.emanuele.dao;

import java.util.List;

import it.bologna.emanuele.domain.User;

public interface UserDAO {

	public List<User> getFollowers(int userId);

	public List<User> getFollowing(int userId);

}