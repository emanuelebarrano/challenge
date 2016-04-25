package it.bologna.emanuele.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import it.bologna.emanuele.domain.User;
import it.bologna.emanuele.mapper.UserRowMapper;

public class UserDAOImpl extends GenericDAO implements UserDAO {

	final String GET_FOLLOWINGS_QUERY = "select * from user u where u.id in (select f.followingId from user u, follower f where u.id=f.userId and u.id = :userId)";

	final String GET_FOLLOWERS_QUERY = "select * from user u where u.id in (select f.userId from user u, follower f where u.id = f.followingId and u.id=:userId)";

	public List<User> getFollowers(int userId) {

		SqlParameterSource namedParameters = new MapSqlParameterSource("userId", userId);

		return this.namedParameterJdbcTemplate.query(GET_FOLLOWERS_QUERY, namedParameters, new UserRowMapper());

	}

	public List<User> getFollowing(int userId) {

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("userId", userId);

		SqlParameterSource namedParameters = new MapSqlParameterSource(parameters);

		return this.namedParameterJdbcTemplate.query(GET_FOLLOWINGS_QUERY, namedParameters, new UserRowMapper());

	}

}