package HomeWork7;

import java.util.Scanner;

public class NumbersToWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = Integer.parseInt(sc.nextLine());
		Letterize(number);
		sc.close();
	}

	public static void Letterize(int number) {
		int first = number / 100 % 10;
		int second = number / 10 % 10;
		int third = number % 10;
		System.out.printf("%s - hundred and %s %s", gettingName(first), gettingName(second), gettingName(third));
	}

	public static String gettingName(int number) {
		String numberConv = null;
		switch (number) {
		
		case 1:
			numberConv = "one";
			break;
		case 2:
			numberConv = "two";
			break;
		case 3:
			numberConv = "three";
			break;
		case 4:
			numberConv = "four";
			break;
		case 5:
			numberConv = "five";
			break;
		case 6:
			numberConv = "six";
			break;
		case 7:
			numberConv = "seven";
			break;
		case 8:
			numberConv = "eight";
			break;
		case 9:
			numberConv = "nine";
			break;

		}
		return numberConv;
	}
	public static String gettingName2(int second, int third) {
		String numberConv = null;
		if(second == 1){
			

		}
		return numberConv;
	}

}
