package HomeWork7;

import java.util.Scanner;

public class FactExamp {
	static int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		return factorial_i(number, 1);
	}

	public static int factorial_i(int currentNumber, int sum) {
		if (currentNumber == 1) {
			return sum;
		} else {
			return factorial_i(currentNumber - 1, sum * currentNumber);

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter integer to calculate factorial:");
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		System.out.println(FactExamp.factorial(f));
      
		scan.close();
	}
}
