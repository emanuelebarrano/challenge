package it.bologna.emanuele.validator;

import org.springframework.stereotype.Component;

import it.bologna.emanuele.exception.BusinessException;

@Component
public class FollowerValidator {

	public void checkFollowing(int follower, int following) throws BusinessException {
		if (follower == following) {

			throw new BusinessException("You can not follow yourself");
		}
	}

}
