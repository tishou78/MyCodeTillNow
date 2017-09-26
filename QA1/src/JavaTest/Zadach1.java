package JavaTest;

import java.util.Scanner;

public class Zadach1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Provide number " + (i + 1));
			numbers[i] = scanner.nextInt();
		}
		
		int min = numbers[0];
		int max = numbers[0];
		

		
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
		
			}
			if (max < numbers[i]) {
				max = numbers[i];
			
		
		
			}
		}
		System.out.println("Min number is: " + min);
		System.out.println("Max number is: " + max);
		scanner.close();
	}
}
	

