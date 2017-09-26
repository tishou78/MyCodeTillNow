package Lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoLambda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			numbers.add(Integer.parseInt(sc.nextLine()));
		}

		int sum = numbers.stream().mapToInt(Integer::valueOf).sum();

		int min = numbers.stream().min(Integer::compareTo).get();
		/*
		 * Optional<Integer> optionalMin =
		 * numbers.stream().min(Integer::compareTo); int min =0;
		 * if(optionalMin.isPresent()){ min = optionalMin.get(); }
		 */

		int max = numbers.stream().max(Integer::compareTo).get();

		double average = numbers.stream().mapToDouble(Double::valueOf).average().getAsDouble();

		System.out.println("Sum = " + sum);
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		System.out.println("Average = " + average);
		
		sc.close();
	}

}
