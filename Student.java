package com.mphasis.serialization;

import java.io.Serializable;
//pojo plain old java object

public class Student implements Serializable{
	private int id;
	private String fname;
	private String lname;
	private String email;
	
	public Student() {
		//TODO Auto-generated constructor stub
		
	}
	public Student(int id,String fname,String lname,String email) {
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		
	}

}
