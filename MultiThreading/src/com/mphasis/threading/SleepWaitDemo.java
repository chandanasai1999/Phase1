package com.mphasis.threading;

import java.lang.management.ThreadInfo;
import java.nio.channels.InterruptedByTimeoutException;

public class SleepWaitDemo {
	private static Object Lock=new Object();
	public static void main(String[] args)throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Thread"+Thread.currentThread().getName()+"is woken up after"+"sleeping of 1 second");
		synchronized (Lock) {
			Lock.wait(1000);
			System.out.println("Object" +Lock+"is woke up after waiting of 1 second");
			
		}
		
		
	}

}
