package it.bologna.emanuele.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import it.bologna.emanuele.domain.Twit;
import it.bologna.emanuele.mapper.TwitRowMapper;

public class TwitDAOImpl extends GenericDAO implements TwitDAO {

	public List<Twit> getAllById(int userId) {

		String sql = "select t.id, t.userid, t.text from twit t, follower f where (t.userid = f.followingid or t.userid = :userId)";

		SqlParameterSource namedParameters = new MapSqlParameterSource("userId", userId);

		return this.namedParameterJdbcTemplate.query(sql, namedParameters, new TwitRowMapper());

	}

	public List<Twit> getAllByIdAndText(int userId, String text) {

		String sql = "select t.id, t.userid, t.text from twit t, follower f where (t.userid = f.followingid or t.userid = :userId) and text like :text";

		Map<String, Object> parameters = new HashMap<String, Object>();

		parameters.put("userId", userId);
		String likeText = String.format("%%%s%%", text);
		parameters.put("text", likeText);

		SqlParameterSource namedParameters = new MapSqlParameterSource(parameters);

		return this.namedParameterJdbcTemplate.query(sql, namedParameters, new TwitRowMapper());

	}

}