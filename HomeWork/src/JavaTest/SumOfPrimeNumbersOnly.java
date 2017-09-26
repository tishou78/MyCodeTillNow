package JavaTest;

import java.util.Scanner;

public class SumOfPrimeNumbersOnly {
	
	static boolean primeIs(int a){
		if(a == 1) return false;
		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				return false;
			}
		}
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (primeIs(num))
				sum += num;
		}
		System.out.println(sum);
        sc.close();
	}

}
