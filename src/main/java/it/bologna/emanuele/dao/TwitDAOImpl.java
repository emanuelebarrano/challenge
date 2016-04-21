package it.bologna.emanuele.dao;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import it.bologna.emanuele.domain.Twit;
import it.bologna.emanuele.mapper.TwitRowMapper;

public class TwitDAOImpl extends GenericDAO implements TwitDAO {

	public List<Twit> getAllById(int userId) {
		String sql = "select id, userId, text from Twit where userid = :userId";

		SqlParameterSource namedParameters = new MapSqlParameterSource("userId", userId);

		return this.namedParameterJdbcTemplate.query(sql, namedParameters, new TwitRowMapper());

	}

}