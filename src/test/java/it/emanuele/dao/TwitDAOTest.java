package it.emanuele.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import it.bologna.emanuele.dao.TwitDAO;
import it.bologna.emanuele.domain.Twit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:dataSource-context.xml" })
@Transactional
public class TwitDAOTest {

	@Autowired
	TwitDAO twitDAO;

	@Test
	public void getAllByIdTest() {

		List<Twit> twitList = twitDAO.getAllById(1);
		assertEquals(3, twitList.size());

	}

	@Test
	public void getAllByIdAndTextTest() {

		List<Twit> twitList = twitDAO.getAllByIdAndText(1, "bello");
		assertEquals(2, twitList.size());

	}

}
