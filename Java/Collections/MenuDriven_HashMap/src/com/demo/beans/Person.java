package com.demo.beans;

public class Person {
	private int id;
	private String name;
	private String number;
	
	// default constructor
	public Person() {
		super();
	}
	
	// parameterized constructor
	public Person(int id, String name, String number) {
		this.id = id;
		this.name = name;
		this.number = number;
	}
	
	// getter and setters 
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Person:[ID: "+ id + ", Name: " + name +", Number: "+ number + "]";
	}
}
