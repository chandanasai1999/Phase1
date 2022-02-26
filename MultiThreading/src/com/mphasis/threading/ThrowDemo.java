package com.mphasis.threading;

public class ThrowDemo {
	//my created method throwing exception
	void check(int age)
	{
		if(age<=18)
			throw new ArithmeticException("Age is not valid for vote");
		else
			System.out.println("valid");
	}
	public static void main(String[] args) {
		ThrowDemo t=new ThrowDemo();
		try {
		t.check(10);
		
	}
	catch(Exception e) {
		System.out.println(e);
	}

}
}
