import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DictRef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" = ");
		LinkedHashMap<String, Integer> data = new LinkedHashMap<>();

		while (!"end".equals(input[0])) {
			String name = input[0];
		
			if (isNumberOrName(input[1])) {
				int number = Integer.parseInt(input[1]);
				data.put(name, number);
			} else {
				if (data.containsKey(input[1])) {
					data.put(name, data.get(input[1]).intValue());
				}
			}
			input = sc.nextLine().split(" = ");
		}
		data.forEach((key, value) ->{
			System.out.println(key + " === " + value);
		});
		sc.close();
	}

	private static boolean isNumberOrName(String string) {

		String regex = ("\\d+");
		boolean pattern = Pattern.matches(regex, string);
		if(pattern){
			return true;
		}
		else
		return false;
		/*try {
			Integer.parseInt(string);
			return true;
		} catch (Exception e) {
			return false;
		}*/

	}

}
