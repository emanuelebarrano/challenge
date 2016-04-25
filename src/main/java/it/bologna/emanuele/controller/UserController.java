package it.bologna.emanuele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bologna.emanuele.domain.User;
import it.bologna.emanuele.presentation.JsonModel;
import it.bologna.emanuele.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/readfollowers/{userId}", produces = "application/json")
	public JsonModel getFollowersByUserId(@PathVariable int userId) {

		JsonModel response = new JsonModel("OK");

		List<User> result = userService.getFollowers(userId);

		response.setResponse(result);

		return response;
	}

	@RequestMapping(value = "/readfollowing/{userId}", produces = "application/json")
	public JsonModel getFollowingByUserId(@PathVariable int userId) {

		JsonModel response = new JsonModel("OK");

		List<User> result = userService.getFollowing(userId);

		response.setResponse(result);

		return response;
	}

}
