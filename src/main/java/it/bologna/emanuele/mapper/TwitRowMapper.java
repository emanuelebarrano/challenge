package it.bologna.emanuele.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.bologna.emanuele.domain.Twit;

public class TwitRowMapper implements RowMapper<Twit>{

	public Twit mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Twit twit = new Twit(rs.getInt("id"), rs.getInt("userId"), rs.getString("text"));
		
		return twit;
	}

}
