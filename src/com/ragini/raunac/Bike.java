package com.ragini.raunac;

public class Bike implements Vehicle{

	@Override
	public void noOfTyres() {
		System.out.println("I have 2 Wheels");
		
	}

	@Override
	public void kick() {
		System.out.println("I can start with a single Kick");
		
	}

}
