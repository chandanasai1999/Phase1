package com.mphasis.threading;

public class NotvalidAgeExeption extends Exception{
	public NotvalidAgeExeption(String msg) {
		//pass msg from child class to parent class constructor
	super(msg);
	}

}
