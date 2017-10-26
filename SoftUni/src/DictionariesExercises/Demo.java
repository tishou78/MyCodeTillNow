package DictionariesExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Map<String, String> data = new HashMap<>();
		String input = scan.nextLine();

		while (!"END".equals(input)) {
			String[] inputData = input.split(" ");
			String AorS = inputData[0];
			String name = inputData[1];
			

			switch (AorS) {
			case "A":
				String phone = inputData[2];
				if (!data.containsKey(name))
					data.put(name, phone);
				else
					data.replace(name, phone);
				break;

			case "S":
				searchForName(name, data);
				break;

			default:
				System.out.println("Shude never compile");
				break;
			}

			input = scan.nextLine();
		}
		scan.close();
	}

	private static void searchForName(String name, Map<String, String> data) {
		
		if (data.containsKey(name)) {
			for (Entry<String, String> element : data.entrySet()) {

				if (element.getKey().equals(name)) {
					System.out.printf("%s -> %s%n", element.getKey(), element.getValue());
					continue;

				}

			} 
		}else
		System.out.printf("Contact %s does not exist.%n", name);
		
	}

}
