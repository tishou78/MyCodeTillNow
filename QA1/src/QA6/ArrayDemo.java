package QA6;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[5];
		for (int i = 0; i < names.length; i++) {
			System.out.println("Please provide name"+ (i + 1)+ ":");
		names[i] = scan.nextLine();
		
		}
		System.out.println("Provaide names are listend in:");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		scan.close();
	}

}
