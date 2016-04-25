package it.emanuele.controller;

import static com.eclipsesource.restfuse.Assert.assertOk;
import static com.eclipsesource.restfuse.AuthenticationType.BASIC;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.eclipsesource.restfuse.Destination;
import com.eclipsesource.restfuse.HttpJUnitRunner;
import com.eclipsesource.restfuse.MediaType;
import com.eclipsesource.restfuse.Method;
import com.eclipsesource.restfuse.Response;
import com.eclipsesource.restfuse.annotation.Authentication;
import com.eclipsesource.restfuse.annotation.Context;
import com.eclipsesource.restfuse.annotation.HttpTest;

import it.bologna.emanuele.dao.FollowerDAO;

@RunWith(HttpJUnitRunner.class)
@Ignore
public class FollowerControllerIT {

	@Autowired
	FollowerDAO followerDAO;

	final String JSON_BODY = "{\"id\":1,\"idUser\":1,\"idFollower\":3}";

	@Rule
	public Destination destination = new Destination(this, "http://localhost:8080");
	@Context
	private Response response;

	@HttpTest(type = MediaType.APPLICATION_JSON, content = JSON_BODY, method = Method.PUT, path = "/follow", authentications = {
			@Authentication(type = BASIC, user = "challenge", password = "challenge") })

	public void testFollow() {
		assertOk(response);
	}

	@HttpTest(type = MediaType.APPLICATION_JSON, content = JSON_BODY, method = Method.POST, path = "/unfollow", authentications = {
			@Authentication(type = BASIC, user = "challenge", password = "challenge") })

	public void testUnfollow() {
		assertOk(response);
	}

}
