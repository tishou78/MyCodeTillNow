package QA3;

import java.util.Scanner;

public class CalculatorDemo {
	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		
		System.out.println("Enter number");
		double num1 = skan.nextDouble();
		
		System.out.println("Enter number2");
		double num2 = skan.nextDouble();
		
		Calculator elka = new Calculator();
		double sum = elka.add(num1, num2);
		System.out.println(num1 + " + " + num2 +" = " +sum);
		
		
		double min = elka.deff(num1, num2);
		System.out.println(num1 + " - " + num2 +" = " +min);
		
	}
	

}
