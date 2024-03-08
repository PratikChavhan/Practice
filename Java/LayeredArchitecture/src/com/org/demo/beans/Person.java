package com.org.demo.beans;

public class Person {
// Data Members
	private int pid;
    private String pname;
    private String pnumber;

// default cons
    public Person(){
        this.pid = 0;
        this.pname = null;
        this.pnumber = null;
    }
// parameterized cons
    public Person(int id, String name, String number){
        this.pid = id;
        this.pname = name;
        this.pnumber = number;
    }

// getter
    public int getPid(){
        return this.pid;
    }

    public String getPname(){
        return this.pname;
    }

    public String getNumber(){
        return this.pnumber;
    }

// setter
    public void setPid(int id){
        this.pid = id;
    }

    public void setPname(String name){
        this.pname = name;
    }

    public void setPnumber(String number){
        this.pnumber = number;
    }

// toString
    public String toString(){
        return "[id: "+ this.pid + ", Name: " + this.pname + ", Number: " + this.pnumber + "]";
    }
}
                                                                                                                                                          