package it.bologna.emanuele.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.dao.FollowerDAOImpl;

@RestController
public class FollowerController {

	// @RequestMapping("/following/{userId}")
	// public List<User> getFollowing(int userId) {
	//
	// return null;
	//
	// }
	//
	// @RequestMapping("/followers/{userId}")
	// public List<User> getFollowers(int userId) {
	//
	// return null;
	//
	// }

	@RequestMapping("/follow/{userId}/{followerId}")
	public void follow(@PathVariable int userId, @PathVariable int followerId) {

		FollowerDAOImpl followerDAOImpl = new FollowerDAOImpl();
		followerDAOImpl.follow(userId, followerId);

	}

	@RequestMapping("/unfollow/{userId}/{followerId}")
	public void unfollow(@PathVariable int userId, @PathVariable int followerId) {

		FollowerDAOImpl followerDAOImpl = new FollowerDAOImpl();
		followerDAOImpl.unfollow(userId, followerId);

	}

}
