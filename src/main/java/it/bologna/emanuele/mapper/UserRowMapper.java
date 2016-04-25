package it.bologna.emanuele.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.bologna.emanuele.domain.User;

public class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User(rs.getInt("id"), rs.getString("name"));

		return user;
	}

}
