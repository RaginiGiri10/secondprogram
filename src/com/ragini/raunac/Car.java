package com.ragini.raunac;

public class Car implements Vehicle{

	@Override
	public void noOfTyres() {
		System.out.println("I have 4 wheels");
		
	}

	@Override
	public void kick() {
		System.out.println("I can start just with the key");
		
	}

}
