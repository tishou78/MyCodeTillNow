package QA9;

import java.util.Scanner;

public class MonthsDemo {
	

	public static void main(String[] args) {
		Months jan = Months.January;
		Months may = Months.May;
		
		System.out.println(jan == may);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, provide April");
		
		String aprilString = scanner.next();
		Months april = Months.fromString(aprilString);
		
		if (april == Months.April) {
			System.out.println("Good job!");
		} else {
			System.out.println("You didn't provide April");
		}
		
	
		scanner.close();
	}

}
