package com.demo.model;

public class Employee {
	private int empno;
	private String ename;
	private int sal;
	
	public Employee() {
		super();
	}
	public Employee(int empno, String ename, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + this.empno + ", ename=" + this.ename + ", sal=" + this.sal + "]";
	}
	
}
