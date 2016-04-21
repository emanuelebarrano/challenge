package it.bologna.emanuele.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class FollowerDAOImpl extends GenericDAO implements FollowerDAO {

	private static SimpleJdbcInsert simpleJdbcInsert;

	@Autowired
	public void setDataSource(DataSource dataSource) {

		this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("follower");
	}

	public void follow(int userId, int followingId) {

		String sql = "insert into follower (userId, followingId) values(:userId, :followingId)";

		Map<String, Integer> parameters = new HashMap<String, Integer>();

		parameters.put("userId", userId);
		parameters.put("followingId", followingId);

		SqlParameterSource namedParameters = new MapSqlParameterSource(parameters);

		// this.simpleJdbcInsert.execute(namedParameters);
		namedParameterJdbcTemplate.update(sql, namedParameters);

	}

	public void unfollow(int userId, int followingId) {

		String sql = "delete from follower where userId = :userId and followingId = :followingId";

		Map<String, Integer> parameters = new HashMap<String, Integer>();

		parameters.put("userId", userId);
		parameters.put("followingId", followingId);

		SqlParameterSource namedParameters = new MapSqlParameterSource(parameters);

		// this.simpleJdbcInsert.execute(namedParameters);
		namedParameterJdbcTemplate.update(sql, namedParameters);

	}

}
