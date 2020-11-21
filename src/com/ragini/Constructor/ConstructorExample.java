package com.ragini.Constructor;

public class ConstructorExample {

	private String name;
	private int roll_no;

	

	public ConstructorExample(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}



	public static void main(String[] args) {
		System.out.println("Welcome");
		ConstructorExample constructorExample = new ConstructorExample();
		
		
	}

}
