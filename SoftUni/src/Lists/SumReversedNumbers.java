package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumReversedNumbers {

	static int x = 0;
	public static void main(String[] args) {
		
		//input numbers, then revers them and sum them
		//forexample: 123 234 12 = 321 + 432 + 21 = 774
		
		Scanner scan = new Scanner(System.in);
		List<String> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
				.collect(Collectors.toList());
		
		for (String string : numbers) {
			x += ReversedStringToInt(string);
		}
		System.out.println(x);
		scan.close();

	}

	private static int ReversedStringToInt(String string) {
		int y;

		List<Character> reversed = new ArrayList<>();
		for (char character : string.toCharArray()) {
			reversed.add(character);
		}
		Collections.reverse(reversed);
		
		y = Integer.parseInt(reversedToString(reversed));
				
		return y;
	}

	private static String reversedToString(List<Character> reversed) {
		StringBuilder sb = new StringBuilder();
		for (Character c : reversed) {
			sb.append(c);
		}
		return sb.toString();
	}
	/*private static String reversedToString(List<Character> reversed) {
		String string = "";
		for (int i = 0; i < reversed.size(); i++) {
			string += reversed.get(i);
		}
		
		return string;
	}*/

}
