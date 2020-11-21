package com.ragini.raunac;

//ParentClass
class Parrot{
	void show() {
		System.out.println("I am Parrot ");
	}
}

//ChildClass
public class Birds extends Parrot{

	public static void main(String[] args) {
		
		Birds overriding = new Birds();
		overriding.show();
	}

}
