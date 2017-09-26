package HomeWork2;

import java.util.Scanner;

public class Solution10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter some number: ");
		int a = in.nextInt();
		boolean isPrime = true;
		if(a == 1) isPrime = false;
		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(a + "Числото е просто");
		} else {

			System.out.println(a + " Числото не е просто");
		}
		in.close();

	}

}
