package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address1")
public class Address {
	@Id
	private int Addrid;
	private String Street;
	private String City;
	@OneToOne(mappedBy = "addr" )
	private MyUser u;
	public Address() {
		super();
	}
	public Address(int addrid, String street, String city) {
		super();
		Addrid = addrid;
		Street = street;
		City = city;
	}
	public int getAddrid() {
		return Addrid;
	}
	public void setAddrid(int addrid) {
		Addrid = addrid;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Address [Addrid=" + Addrid + ", Street=" + Street + ", City=" + City + " user" + u +"]";
	}
	
	
	
}
