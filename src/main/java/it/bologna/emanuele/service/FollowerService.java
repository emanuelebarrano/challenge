package it.bologna.emanuele.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bologna.emanuele.dao.FollowerDAO;
import it.bologna.emanuele.exception.BusinessException;
import it.bologna.emanuele.validator.FollowerValidator;

@Service
public class FollowerService {

	@Autowired
	FollowerDAO followerDAO;

	@Autowired
	FollowerValidator followerValidator;

	public int follow(int userId, int followingId) throws BusinessException {

		followerValidator.checkFollowing(userId, followingId);

		return followerDAO.follow(userId, followingId);

	}

	public int unfollow(int userId, int followingId) {

		return followerDAO.unfollow(userId, followingId);

	}

}
