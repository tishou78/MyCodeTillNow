package DictionariesExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String resources = scan.nextLine();
		long quantity = Long.parseLong(scan.nextLine());
		Map<String, Long> table = new LinkedHashMap<>();

		while (!"stop".equals(resources)) {

			if (!table.containsKey(resources)) {
				table.put(resources, quantity);
			} else {
				table.put(resources, table.get(resources) + quantity);
			}

			resources = scan.nextLine();
			if("stop".equals(resources))
				continue;
			quantity = Long.parseLong(scan.nextLine());
		}

		table.forEach((key, value) -> {
			System.out.println(key + " -> " + value);
		});
		scan.close();
	}

}
