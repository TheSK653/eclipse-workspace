package com.GLA_Spring_Maven;

public class Student {
	
	private int rollNo;
	private String sName;
	private String subject;
	private Address addr;
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public Address getAddr() {
		return addr;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public String getsName() {
		return sName;
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
}