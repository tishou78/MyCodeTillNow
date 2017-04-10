package com.lesson1.softuni;

import java.util.Scanner;

public class SquareOfStars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(repeatStr("*", n));
		for (int i = 0; i < n - 2; i++) {
			System.out.print("*");
			System.out.print(repeatStr(" ", n - 2));
			System.out.println("*");
		}
		System.out.println(repeatStr("*", n));

		sc.close();
	}

	public static String repeatStr(String str, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

}
