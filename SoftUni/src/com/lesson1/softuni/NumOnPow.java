package com.lesson1.softuni;

import java.util.Scanner;

public class NumOnPow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= N; i++) {
			System.out.println((long)Math.pow(2, i));
		}

		sc.close();
	}

}
