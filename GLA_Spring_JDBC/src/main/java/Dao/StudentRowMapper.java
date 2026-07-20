package Dao;

import org.springframework.jdbc.core.RowMapper;

import Entity.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
		Student student = new Student();
		student.setSid(rs.getInt("sid"));
		student.setName(rs.getString("name"));
		student.setSubject(rs.getString("subject"));
		return student;
	}
	
}
