
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author krasimirhris
 */
public class GroceryList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String buyThis;
		int i;

		ArrayList<String> groceryList = new ArrayList<String>(5);
		String item = new String("Bread");
		groceryList.add(item);
		item = new String("Cheese");
		groceryList.add(item);
		item = new String("Olives");
		groceryList.add(item);
		item = new String("Butter");
		groceryList.add(item);
		item = new String("Rise");
		groceryList.add(item);

		while (10 > groceryList.size()) {
			System.out.println("Please buy this: ");
			buyThis = in.next();

			for (i = 0; i < groceryList.size(); i++) {
				if (buyThis.equals(groceryList.get(i))) {
					System.out.println(buyThis + " is already in the list.");
					break;
				}
			}
			if (i == groceryList.size()) {
				System.out.println(buyThis + " has been added to the list.");
				item = new String(buyThis);
				groceryList.add(item);
			}
			System.out.println("The total items in the list are " + groceryList.size());
		}

		System.out.println("\n" + "The whole list to buy is: " + "\n");
		for (String x : groceryList)
			System.out.println(x);
		in.close();
	}

}
