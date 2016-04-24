package it.emanuele.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import it.bologna.emanuele.dao.FollowerDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:dataSource-context.xml" })
@Transactional
public class FollowerDAOTest {

	@Autowired
	FollowerDAO followerDAO;

	@Test
	public void followTest() {

		int result = followerDAO.follow(1, 3);
		assertEquals(1, result);

	}

	@Test
	public void unfollowTest() {

		int result = followerDAO.unfollow(1, 2);
		assertEquals(1, result);

	}

	@Test
	@Ignore
	public void unfollow2Test() {

		int result = followerDAO.unfollow(1, 1);
		followerDAO.unfollow(1, 2);
		assertEquals(1, result);

	}

}
