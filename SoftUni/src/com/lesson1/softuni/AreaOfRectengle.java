package com.lesson1.softuni;

import java.util.Scanner;

public class AreaOfRectengle {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		int area = a * b;
		System.out.println(area);
		console.close();
	}

}
