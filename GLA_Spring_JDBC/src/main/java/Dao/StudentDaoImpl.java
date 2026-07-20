package Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import Entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void insert(Student student) {
		String query="insert into students values(?,?,?)";
		jdbcTemplate.update(query,student.getSid(),student.getName(),student.getSubject());
	}
	
	public void delete(Student student) {
		String query="delete from students where sid=?";
		jdbcTemplate.update(query,student.getSid());
	}
	
	public void update(Student student) {
		String query="update students set name=?,subject=? where sid=?";
		jdbcTemplate.update(query,student.getName(),student.getSubject(),student.getSid());
	}

}
