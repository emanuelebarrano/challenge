package it.bologna.emanuele.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.dao.UserDAOImpl;
import it.bologna.emanuele.domain.User;

@RestController
public class UserController {

	@RequestMapping(value = "/readfollowers/{userId}", produces = "application/json")
	public List<User> getFollowersByUserId(@PathVariable int userId) {

		UserDAOImpl userDao = new UserDAOImpl();
		List<User> result = userDao.getFollowers(userId);
		return result;
	}

	@RequestMapping(value = "/readfollowing/{userId}", produces = "application/json")
	public List<User> getFollowingByUserId(@PathVariable int userId) {

		UserDAOImpl userDao = new UserDAOImpl();

		List<User> result = userDao.getFollowing(userId);

		return result;
	}

}
