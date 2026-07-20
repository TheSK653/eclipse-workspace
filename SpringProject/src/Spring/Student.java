package Spring;

public class Student {
	
	private int rollNo;
	private String name;
	private String subject;
	
	public void setsName(String sName) {
		this.name = sName;
	}
	
	public String getsName() {
		return name;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	// we can configure through 3 methods:
//	1. xml file
//	2.java class
//	3.annotation

}