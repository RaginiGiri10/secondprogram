package com.ragini;

import java.util.Scanner;

import com.ragini.raunac.Bike;
import com.ragini.raunac.Car;
import com.ragini.raunac.Entity;
import com.ragini.raunac.Test;

class ThirdProgram {
	public long calculation(long x, long y) {
		long z = x + y;
		System.out.println(z);
		return z;

	}

}

class ForthProgram {
	public int multiplication(int x, int y) {
		int c = x * y;
		System.out.println(c);
		return c;
	}
}

public class Secondprogram {

	public static void main(String[] args) {
		ThirdProgram ragini = new ThirdProgram();
		ragini.calculation(10, 20);
		ForthProgram ragini1 = new ForthProgram();
		ragini1.multiplication(5, 5);

		Bike bike = new Bike();
		bike.kick();
		bike.noOfTyres();

		Car car = new Car();
		car.kick();
		car.noOfTyres();
		Test test = new Test();
		test.print();
		Entity entity = new Entity();
		entity.setName("Ragini");
		entity.setRollno(1);
		String name = entity.getName();
		int rollno = entity.getRollno();
		System.out.println(name);
		System.out.println(rollno);
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Integer");
		long x = scanner.nextLong();
		System.out.println("Enter Second Integer");
		long y = scanner.nextLong();
		calculator.calculation(x, y);
	}

}
