package TrainingTwo;

import java.util.Scanner;

public class RecursionExample {
	static void Recurs(int a) {
		if (a > 0) {
			System.out.println("The mark is " + a);
			System.out.println("Pass");
			a--;
			Recurs(a);
		} else {
			System.out.println("The mark is 0 \nFAIL \nDone!");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();

		Recurs(mark);

		System.out.println();

		sc.close();
	}

}
