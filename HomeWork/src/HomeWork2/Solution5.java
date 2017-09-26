package HomeWork2;

import java.util.Scanner;

public class Solution5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.println("Enter number a: ");
		int a = keyin.nextInt();
		System.out.println("Enter number b: ");
		int b = keyin.nextInt();
		int c = (a < b) ? a : b;
		int d = (b < a) ? a : b;
		while (c <= d) {
			System.out.println(c);
			c++;
			keyin.close();
			
		}

	}

}
