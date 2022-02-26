package com.mphasis.threading;


//null pointer exception
public class UncheckedExeception2 {
    public static void main(String[] args) {
		String name=null;
		if(name.equals("admin"))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
		
	}
}
