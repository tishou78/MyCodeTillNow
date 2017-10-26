package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class SearchForAnumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+"))
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
		int[] numbers = new int[3];
		numbers = Arrays.stream(scan.nextLine().split("\\s+"))
				.mapToInt(Integer::parseInt).toArray();
		int numberOfElementsToTake = numbers[0];
		int numberOfElementsToDelete = numbers[1];
		int numberSearchedInList = numbers[2];
		
		list.subList(0, numberOfElementsToTake);
		for (int i = 0; i < numberOfElementsToDelete; i++) {
			list.remove(0);
		}
		if(list.contains(numberSearchedInList)){
			System.out.println("YES!");
		}else{
			System.out.println("NO!");
		}
		scan.close();
	}

}
