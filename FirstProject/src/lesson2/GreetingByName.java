package lesson2;

import java.util.Scanner;

public class GreetingByName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		greetingName(name);
		sc.close();
		
	}
	public static void greetingName(String str){
		System.out.printf("Hello, %s!\n", str);
	}

}
