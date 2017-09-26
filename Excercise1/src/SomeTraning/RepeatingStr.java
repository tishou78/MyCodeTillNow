package SomeTraning;

import java.util.Scanner;

public class RepeatingStr {
	public static String repeatStr(String str, int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String spaces;
		String stars;
		for (int i = 1; i <= n; i++) {
			spaces = repeatStr(" ", n - i);
			stars = repeatStr("* ", i);

			System.out.println(spaces + stars);
		}
		for (int i = 1; i < n; i++) {
			spaces = repeatStr(" ", i);
			stars = repeatStr("* ", n - i);

			System.out.println(spaces + stars);

		}
		sc.close();
	}

}
