package com.lesson1.softuni;

public class FormatigDecimal {

	public static void main(String[] args) {
		double num = 234.2134;
		System.out.println(num);
		System.out.printf(String.format("%,.2f%n", num));
		System.out.println(Math.round(num));

		//2 на степен 8
		System.out.println((int)Math.pow(2, 8));
		
		//re-order
		System.out.println(String.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d"));
	}

}
