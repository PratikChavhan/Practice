package com.demo.model;

public class User2 {
	private int uid;
	private String uname;
	public User2(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + "]";
	}
}
