package it.bologna.emanuele.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import it.bologna.emanuele.domain.Twit;
 

@Repository
public class TwitDAOImpl implements TwitDAO {
	
	private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
    	System.out.println("mmmmmiaoooooooooooooooo "+dataSource);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        System.out.println("sgallaaaoooooo "+this.jdbcTemplate);
        String query = "select id, userId, text from Twit";
        List<Map<String,Object>> empRows = jdbcTemplate.queryForList(query);
        System.out.println("asdlfkhjaldskfjasdlkjf "+empRows.size());
    }
 
    public List<Twit> getAll() {
    	String query = "select id, userId, text from Twit";
        List<Twit> empList = new ArrayList<Twit>();
 
        System.out.println("ciaoooooooooooooooo "+jdbcTemplate);
        
        List<Map<String,Object>> empRows = jdbcTemplate.queryForList(query);
         
        for(Map<String,Object> empRow : empRows){
//        	Twit emp = new Twit();
//            emp.setId(Integer.parseInt(String.valueOf(empRow.get("id"))));
//            emp.setName(String.valueOf(empRow.get("name")));
//            emp.setRole(String.valueOf(empRow.get("role")));
//            empList.add(emp);
        }
        return empList;
    }

	public void save(Twit employee) {
		// TODO Auto-generated method stub
		
	}

	public Twit getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Twit employee) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
 
}