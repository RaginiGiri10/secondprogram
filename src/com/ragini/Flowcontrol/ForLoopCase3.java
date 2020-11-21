package com.ragini.Flowcontrol;

public class ForLoopCase3 {

	public static void main(String[] args) {

		int table=5;
		int number = 10;

		int multiplication = 0;

		for (int i = 1; i <= number; i++) {
			multiplication = table * i;
			System.out.println(multiplication);
		}
	}
}
