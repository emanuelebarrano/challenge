package it.bologna.emanuele.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bologna.emanuele.dao.UserDAO;
import it.bologna.emanuele.domain.User;

@Service
public class UserService {

	@Autowired
	UserDAO userDao;

	public List<User> getFollowers(int userId) {

		return userDao.getFollowers(userId);

	}

	public List<User> getFollowing(int userId) {

		return userDao.getFollowing(userId);

	}

}
