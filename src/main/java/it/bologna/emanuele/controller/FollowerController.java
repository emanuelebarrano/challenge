package it.bologna.emanuele.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.dao.FollowerDAOImpl;
import it.bologna.emanuele.domain.Follower;

@RestController
public class FollowerController {

	@RequestMapping(value = "/follow", method = RequestMethod.PUT, consumes = "application/json")
	@ResponseBody
	public void follow(@RequestBody Follower follower) {

		FollowerDAOImpl followerDAOImpl = new FollowerDAOImpl();
		followerDAOImpl.follow(follower.getIdUser(), follower.getIdFollower());

	}

	@RequestMapping(value = "/unfollow", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public void unfollow(@RequestBody Follower follower) {

		FollowerDAOImpl followerDAOImpl = new FollowerDAOImpl();
		followerDAOImpl.unfollow(follower.getIdUser(), follower.getIdFollower());

	}

}
