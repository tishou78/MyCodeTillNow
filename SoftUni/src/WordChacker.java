import java.util.ArrayList;
import java.util.List;

public class WordChacker {

	private List<String> doComputations(String inputString) {

		List<String> totalList = new ArrayList<String>();
		for (int i = 1; i <= inputString.length(); i++) {

			totalList.addAll(getCombinationsPerLength(inputString, i));
		}
		return totalList;

	}

	private ArrayList<String> getCombinationsPerLength(String inputString, int i) {

		ArrayList<String> combinations = new ArrayList<String>();

		if (i == 1) {

			char[] charArray = inputString.toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				combinations.add(((Character) charArray[j]).toString());
			}
			return combinations;
		}
		for (int j = 0; j < inputString.length(); j++) {

			ArrayList<String> combs = getCombinationsPerLength(inputString, i - 1);
			for (String string : combs) {
				combinations.add(inputString.charAt(j) + string);
			}
		}

		return combinations;
	}
	

	public static void main(String args[]) {

		String testString = "–Ã«» ¿Œ";
		WordChacker crackerTest = new WordChacker();
		System.out.println(crackerTest.doComputations(testString));

	}

}
