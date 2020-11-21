package com.ragini;

import java.util.Scanner;

public class OddEven {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int x;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no");
		x = scanner.nextInt();

		if (x % 2 == 0) {
			System.out.println("X is even");

		} else {
			System.out.println("X is odd");
		}
	}

}
