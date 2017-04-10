package com.lesson6.softuni;

import java.util.Scanner;

public class RhombusOfStars {

	public static String repeatStr(String str, int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(repeatStr(" ", n - i));
			System.out.println(repeatStr("* ", i));
		}
		for (int i = 1; i < n; i++) {
			System.out.print(repeatStr(" ", i));
			System.out.println(repeatStr("* ", n - i));
		}

		sc.close();
	}

}
