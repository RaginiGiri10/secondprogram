package com.ragini.Flowcontrol;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		
		int guyAge;
		int girlAge;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Guys age");
		guyAge=scanner.nextInt();
		System.out.println("Enter Girls age");
		girlAge=scanner.nextInt();
		
		
		if(guyAge>21 && girlAge>18) {
			System.out.println("The Person is eligible to vote");
		}else {
			System.out.println("You are underage to vote");
		}
	}
}
