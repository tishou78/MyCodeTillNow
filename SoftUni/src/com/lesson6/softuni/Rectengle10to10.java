package com.lesson6.softuni;

import java.util.Scanner;


public class Rectengle10to10 {

	private static String repeatStr(String str,int num){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.println(repeatStr("* ", n));
			
			sc.close();
		}
	}

}
