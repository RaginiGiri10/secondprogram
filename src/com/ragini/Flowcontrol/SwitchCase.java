package com.ragini.Flowcontrol;

import java.util.Scanner;

public class SwitchCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int number;
		String size;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		number = scanner.nextInt();

		switch (number) {
		case 5:
			size = "small";

			break;
		case 4:
			size = "Medium";

			break;
		case 3:
			size = "verySmall";
			break;

		default:
			size = "you are tall";
			break;
		}
		System.out.println("Your height is" + " " + size);
	}

}