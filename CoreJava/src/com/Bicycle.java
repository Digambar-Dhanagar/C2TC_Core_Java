package com;

public class Bicycle {
	int gear;
	 int speed;

	 void applyBreak(int decrement) {
	  speed -= decrement;
	 }

	 void accelerate(int increment) {
	  speed += increment;
	 }
	 

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	class MountainBike extends Bicycle {
		 int seatHeight;

		 void adjustHeight(int value) {
		  seatHeight = value;
		 }


	@Override
		public String toString() {
			return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
