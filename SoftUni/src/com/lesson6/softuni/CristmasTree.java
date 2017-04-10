package com.lesson6.softuni;

import java.util.Scanner;

public class CristmasTree {

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
		for (int i = 0; i < n; i++) {
			String spaces = repeatStr(" ", n - i);
			String stars = repeatStr("*", i);
			
			System.out.print(spaces);
			System.out.print(stars);
			System.out.print("|");
			System.out.print(stars);
			System.out.println(spaces);
		}
		sc.close();
	}

}
