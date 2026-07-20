package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
	@Column(name = "Student_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int sid;
	
	@Column(name = "Student_Name")
	 private String name;
	
	@Column(name = "Student_Course")
	 private String course;
	
	@Column(name = "Student_Subject")
	@Transient
	 private String subject;
	 public int getSid() {
		 return sid;
	 }
	 public void setSid(int sid) {
		 this.sid = sid;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getCourse() {
		 return course;
	 }
	 public void setCourse(String course) {
		 this.course = course;
	 }
	 public String getSubject() {
		 return subject;
	 }
	 public void setSubject(String subject) {
		 this.subject = subject;
	 }
	 

}