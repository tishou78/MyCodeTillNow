package lesson2;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your name, please:");
			String name = sc.nextLine();
			greetPerson(name);
		}
		sc.close();
	}
	
	public static void greetPerson(String str){
		System.out.format("Hello, %s! \n", str);
	}

}
