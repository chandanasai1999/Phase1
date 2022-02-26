package com.mphasis.threading;

public class Mainthread extends Thread {
	
	public static int count=0;
	
	public Mainthread() {
		
		
	}
	@Override
	public void run() {
		while(count<=10)
		{
			System.out.println("Thread"+(++count));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
	public static void main(String[] args) {
		System.out.println("Starting Main thread..");
		Mainthread main=new Mainthread();
		main.start();
		while(count<=10)
		{
			System.out.println("Main Thread"+(++count));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}

}
