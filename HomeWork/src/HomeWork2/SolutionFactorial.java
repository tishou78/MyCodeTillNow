package HomeWork2;

import java.util.Scanner;

public class SolutionFactorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����, �������� �����:");
		int number = scanner.nextInt();

		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		System.out.println(number + "!= " + result);
		scanner.close();
	}

}
