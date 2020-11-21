package com.ragini.raunac;

public class MethodOverloading {

	public void show() {
		System.out.println("Welcome to 1st Method");
	}
	public void show(int x,String name) {
		System.out.println("Welcome to 1st Method");
	}
	public void show(String name ,int x) {
		System.out.println("Welcome to 2nd  Method");
	}

	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.show();
		methodOverloading.show(10,"Ragini");
		methodOverloading.show("Ragini",10);
	}
}
