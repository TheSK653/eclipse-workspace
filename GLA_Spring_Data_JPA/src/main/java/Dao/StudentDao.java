package Dao;

import Entity.Student;

public class StudentDao {
	private StudentRepository studentRepo;
	public void insert(Student student) {
		// code to insert student into database
		studentRepo.save(student);
		
	}

}
