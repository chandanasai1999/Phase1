package com.mphasis.threading;

public class TestCustomException {
    
	void check(int age)throws NotvalidAgeExeption
	{
		if(age<18)
			throw new NotvalidAgeExeption("Age is less than 18");
		else
			System.out.println("valid");
		
	}
	public static void main(String[] args) throws NotvalidAgeExeption {
		TestCustomException t =new TestCustomException();
		t.check(67);
	
    }
}


