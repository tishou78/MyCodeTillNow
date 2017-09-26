package HomeWork2;

import java.util.Scanner;

public class Solution8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Моля, въведете число:");
		int c = scanner.nextInt();
		int number = c - 1;

		for (int i = 0; i < c; i++) {
			for (int b = 0; b < c; b++) {
				System.out.print(number + " ");
			}
			System.out.println();
			number += 2;
		}
		scanner.close();
	}

}
