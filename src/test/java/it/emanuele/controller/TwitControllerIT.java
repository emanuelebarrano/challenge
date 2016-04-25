package it.emanuele.controller;

import static com.eclipsesource.restfuse.Assert.assertOk;
import static com.eclipsesource.restfuse.Assert.assertUnauthorized;
import static com.eclipsesource.restfuse.AuthenticationType.BASIC;

import org.junit.Rule;
import org.junit.runner.RunWith;

import com.eclipsesource.restfuse.Destination;
import com.eclipsesource.restfuse.HttpJUnitRunner;
import com.eclipsesource.restfuse.Method;
import com.eclipsesource.restfuse.Response;
import com.eclipsesource.restfuse.annotation.Authentication;
import com.eclipsesource.restfuse.annotation.Context;
import com.eclipsesource.restfuse.annotation.HttpTest;

@RunWith(HttpJUnitRunner.class)
public class TwitControllerIT {

	@Rule
	public Destination destination = new Destination(this, "http://localhost:8080");
	@Context
	private Response response;

	@HttpTest(method = Method.GET, path = "/read/1", authentications = {
			@Authentication(type = BASIC, user = "bad", password = "request") })
	public void testAuthenticationWithInvalidCredentials() {
		assertUnauthorized(response);
	}

	@HttpTest(method = Method.GET, path = "/read/1", authentications = {
			@Authentication(type = BASIC, user = "challenge", password = "challenge") })
	public void testAuthenticationWithCorrectCredentials() {
		assertOk(response);
	}

}
