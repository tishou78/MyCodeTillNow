package SomeTraning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::valueOf)
				.collect(Collectors.toCollection(ArrayList::new));

		System.out.println(
		numbers.stream().sorted((a, b)-> b - a)
		.limit(3)
		.map(Object::toString)
		.collect(Collectors.joining(" ")));
		
		sc.close();
	}
	

}
