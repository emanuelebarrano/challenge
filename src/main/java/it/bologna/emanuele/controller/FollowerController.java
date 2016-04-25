package it.bologna.emanuele.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.domain.Follower;
import it.bologna.emanuele.exception.BusinessException;
import it.bologna.emanuele.presentation.JsonModel;
import it.bologna.emanuele.service.FollowerService;

@RestController
public class FollowerController {

	@Autowired
	FollowerService followerService;

	@RequestMapping(value = "/follow", method = RequestMethod.PUT, consumes = "application/json")
	@ResponseBody
	public JsonModel follow(@RequestBody Follower follower) throws BusinessException {

		JsonModel response = new JsonModel("OK");

		int result = followerService.follow(follower.getIdUser(), follower.getIdFollower());

		response.setResponse(result);

		return response;

	}

	@RequestMapping(value = "/unfollow", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public JsonModel unfollow(@RequestBody Follower follower) {

		JsonModel response = new JsonModel("OK");

		int result = followerService.unfollow(follower.getIdUser(), follower.getIdFollower());

		response.setResponse(result);

		return response;

	}

}
