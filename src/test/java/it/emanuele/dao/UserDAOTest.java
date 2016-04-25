package it.emanuele.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import it.bologna.emanuele.dao.UserDAO;
import it.bologna.emanuele.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:dataSource-context.xml" })
@Transactional
public class UserDAOTest {

	@Autowired
	UserDAO userDAO;

	@Test
	public void getFollowersTest() {

		List<User> twitList = userDAO.getFollowers(2);
		assertEquals(1, twitList.size());

	}

	@Test
	public void getFollowingTest() {

		List<User> twitList = userDAO.getFollowing(1);
		assertEquals(1, twitList.size());

	}

}
