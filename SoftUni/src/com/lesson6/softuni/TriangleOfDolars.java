package com.lesson6.softuni;

import java.util.Scanner;

public class TriangleOfDolars {

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
		for (int j = 1; j <= n; j++) {
			System.out.println(repeatStr("$ ", j));

		}
		sc.close();
	}

}
