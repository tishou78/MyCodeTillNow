package HomeWork2;

import java.util.Scanner;

public class Solution1 {
	static int temp = 0;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Моля, въведете число:");
		int number = scanner.nextInt();
		int result = 0;

		for (int i = 1; i <= number; i++) {
			result += i;
			temp++;
		}
		System.out.println("сбор от 1 до " + number + " = " + result);
		System.out.println(Solution1.temp);
		Solution1.temp = 6;
		System.out.println(Solution1.temp);
		scanner.close();
	}

}
