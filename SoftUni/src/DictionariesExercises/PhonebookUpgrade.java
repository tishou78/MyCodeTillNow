package DictionariesExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
	//Add functionality to the phonebook from the previous task to print all contacts ordered
	//lexicographically when receive the command “ListAll”.
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> phoneBook = new HashMap<>();
		String input = scan.nextLine();
		
		

		while (!"END".equals(input)) {
			if("ListAll".equals(input)){
				orderedList(phoneBook);
				input = scan.nextLine();
				continue;
			}
			String[] inputData = input.split(" ");
			String AorS = inputData[0];
			String name = inputData[1];
			

			switch (AorS) {
			case "A":
				String phone = inputData[2];
				if (!phoneBook.containsKey(name))
					phoneBook.put(name, phone);
				else
					phoneBook.replace(name, phone);
				break;

			case "S":
				searchForName(name, phoneBook);
				break;

			default:
				System.out.println("Shude never compile");
				break;
			}

			input = scan.nextLine();
		}
		scan.close();
	}

	private static void orderedList(Map<String, String> data) {
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.putAll(data);
		treeMap.forEach((key, value) -> {
			System.out.println(key + " -> " + value);
		});
		
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
