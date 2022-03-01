package com.oops.prgms;

public class Bycycle {

	private int gear;
	private int speed;
	
	public Bycycle(int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	@Override
	public String toString() {
		return "Bycycle [No of Gears=" + gear + ", Speed of Bycycle=" + speed + "]";
	}
	
}