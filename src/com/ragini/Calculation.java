package com.ragini;

import java.util.Scanner;

public class Calculation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int x = 0 ,y = 0;
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter the value for x");
		x = scanner.nextInt();
		System.out.println("Enter the value of y");
		y=scanner.nextInt();
		int z = x+y;
		System.out.println("sum of x and y" +" "+ z);
	}

}
