package JavaTest;

import java.util.Scanner;

public class BiggestSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int max = -1000000000;
		int min = 1000000000;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (max < num)
				max = num;
			if (min > num)
				min = num;
		}
        System.out.println("Max num is " + max);
        System.out.println("Min num is " + min);
        sc.close();
	}

}
