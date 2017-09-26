package QA8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num;");

		int counter = 0;
		int num1 = 0;
		boolean isProvided = false;
		while (counter < 3 && !isProvided)
			try {
				num1 = scan.nextInt();
				isProvided = true;
			} catch (InputMismatchException e) {

			} finally {
				counter++;
				isProvided = false;
			}

		System.out.println("number is: " + num1);
		scan.close();
	}

}
