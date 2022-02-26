package com.mphasis.threading;

public class MultiThreading  extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.currentThread().sleep(1000);;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
public static void main(String[] args) {
	MultiThreading t1= new MultiThreading();
	MultiThreading t2= new MultiThreading();
	MultiThreading t3= new MultiThreading();
	
	t1.start();
	t2.start();
	t3.start();
	
}
}
