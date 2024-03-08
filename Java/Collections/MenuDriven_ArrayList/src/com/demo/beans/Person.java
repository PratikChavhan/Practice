package com.demo.beans;

public class Person {
	private int pid;
	private String pname;
	private String number;
	public Person() {
		super();
	}
	
	public Person(int pid, String pname, String number) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.number = number;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "\nPerson [id: " + pid + ", name: " + pname + ", number: " + number + "]";
	}
	
}
