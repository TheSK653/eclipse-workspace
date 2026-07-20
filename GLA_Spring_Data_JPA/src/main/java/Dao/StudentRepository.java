package Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	public void saveStudent(Student student);
	public Student getStudentById(int sid);
	public void updateStudent(Student student);
	public void deleteStudent(int sid);

}
