import java.util.LinkedHashMap;
import java.util.Scanner;

public class DictionaryDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Character, Integer> data = new LinkedHashMap<>();
		
		char[] input = sc.nextLine().toCharArray();

		for (char letter : input) {
			if (!data.containsKey(letter)) {
				data.put(letter, 1);
				
			}else{
				data.put(letter, data.get(letter)+1);
			}
		}
		data.forEach((key, value) -> {
			System.out.println(key + " -> " + value);
		});
		sc.close();
	}

}
