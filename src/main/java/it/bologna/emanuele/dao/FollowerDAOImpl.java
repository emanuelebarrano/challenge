package it.bologna.emanuele.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class FollowerDAOImpl extends GenericDAO implements FollowerDAO {

	public int follow(int userId, int followingId) {

		String sql = "insert into follower (userId, followingId) values(:userId, :followingId)";

		Map<String, Integer> parameters = new HashMap<String, Integer>();

		parameters.put("userId", userId);
		parameters.put("followingId", followingId);

		SqlParameterSource namedParameters = new MapSqlParameterSource(parameters);

		// this.simpleJdbcInsert.execute(namedParameters);
		return namedParameterJdbcTemplate.update(sql, namedParameters);

	}

	public int unfollow(int userId, int followingId) {

		String sql = "delete from follower where userId = :userId and followingId = :followingId";

		Map<String, Integer> parameters = new HashMap<String, Integer>();

		parameters.put("userId", userId);
		parameters.put("followingId", followingId);

		SqlParameterSource namedParameters = new MapSqlParameterSource(parameters);

		// this.simpleJdbcInsert.execute(namedParameters);
		return namedParameterJdbcTemplate.update(sql, namedParameters);

	}

}
