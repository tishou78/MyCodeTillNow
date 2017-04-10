package com.lesson3.softuni;

import java.util.Scanner;

public class BonusScors {

	public static void main(String[] args) {

		System.out.print("Enter score: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double bonus = 0.0;
		if (num <= 100)
			bonus = 5;
		else if (num > 100 && num <= 1000)
			bonus = num * 0.20;
		else if (num > 1000)
			bonus = num * 0.10;
		if (num % 2 == 0)
			bonus += 1;
		else if (num % 10 == 5)
			bonus += 2;

		System.out.println("Bonus score: " + bonus);
		System.out.println("Total score: " + (num + bonus));

		sc.close();
	}

}
