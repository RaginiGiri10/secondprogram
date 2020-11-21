package com.ragini.Flowcontrol;

import java.util.Scanner;

public class IfElseIfCondition {

	public static void main(String[] args) {
		
		int guyAge;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Guys age");
		guyAge=scanner.nextInt();
		
		
		
		if(guyAge>21 && guyAge<60 ) {
			System.out.println("The Guy is eligible to vote");
		}else if(guyAge>60){
			System.out.println("You are senior to vote");
		}else {
			System.out.println("you are underage to  vote");
		}
	}
}
