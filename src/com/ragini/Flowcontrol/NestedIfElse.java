package com.ragini.Flowcontrol;

import java.util.Scanner;

public class NestedIfElse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int no1 = 0 , no2 =0, no3 =0,largest;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First no");
		no1=scanner.nextInt();
		System.out.println("Enter Second no");
		no2=scanner.nextInt();
		System.out.println("Enter Third no");
		no3=scanner.nextInt();
		
		if(no1>=no2) {
			if(no1>=no3) {
				largest=no1;
			}
			
			else {
				largest=no3;
			}
		}
			else {
				if(no2>=no3) {
					largest=no2;
				}
				else {
			        largest = no3;
			      }
			    }

			    System.out.println("Largest Number: " + largest);
		}
}

