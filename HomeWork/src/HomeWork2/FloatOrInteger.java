package HomeWork2;

import java.util.Scanner;

public class FloatOrInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = (int)Math.round(Double.parseDouble(sc.nextLine()));
		
		System.out.println(num);
		sc.close();
	}

}
