package com.lesson3.softuni;

import java.util.Scanner;

public class ExellentResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grade = sc.nextDouble();
		if(grade >= 5.50)
			System.out.println("Excellent!");
		else 
			System.out.println("Not excellent.");
		
		sc.close();
	}

}
