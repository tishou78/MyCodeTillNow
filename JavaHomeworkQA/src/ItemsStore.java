import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemsStore {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String input;
		int i;

		List<String> items = new ArrayList<String>();
		items.add("magdanoz");
		items.add("piper");
		items.add("brashno");

		while (10 > items.size()) {
			System.out.println("write some item:");
			input = scann.nextLine();

			for (i = 0; i < items.size(); i++) {
				if (input.equals(items.get(i))) {

					System.out.println(items.get(i));
					System.out.print(" item exist");
					break;

				}
			}
			if (i == items.size()) {
				System.out.println("your item is added to the list");
				items.add(input);
			}
			System.out.println("you have amount of items in the list = " + items.size());
		}
		System.out.println("\n" + "The whole list to buy is: " + "\n");
		for (String x : items)
			System.out.println(x);

		scann.close();
	}

}
