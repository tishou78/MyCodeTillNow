package com.programmmingFunda.softUni;

import java.util.Scanner;

public class NumbersToWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = 0;
		for (int i = 0; i < n; i++) {
			number = sc.nextInt();
		}
		if(number>999)
			System.out.println("too large");
		else if(number<-999)
			System.out.println("too small");
		else return;
		Letterize(number);
		
	}

	private static void Letterize(int number) {
		String[] num1to10 ={"","one","two","three","four","five","six","seven","eight","nine","ten"};
		
		
	}

}
