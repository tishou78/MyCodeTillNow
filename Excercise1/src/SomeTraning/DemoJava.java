package SomeTraning;

import java.util.Scanner;

public class DemoJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.out.println("What's your name? ");
		String name = sc.nextLine();
		//System.out.println("What's your age? ");
		int age = sc.nextInt();
		//System.out.println("What's your ID? ");
		int id = sc.nextInt();
		//System.out.println("What's your salary? ");
		double salary = sc.nextDouble();
		System.out.printf("Name: %s\n", name);
		System.out.printf("Age: %d\n", age);
		System.out.format("Employee ID: %08d\n", id);
		System.out.printf("Salary: %.2f", salary);

		sc.close();
	}

}
