package com.lesson3.softuni;

import java.util.Scanner;

public class GreatNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a > b) {
			System.out.printf("Greater number: %.2f", a);
			//%.f2 formating two digits after comma!
		} else {
			System.out.printf("Greater number: %.2f", b);
		}
		sc.close();
	}

}
