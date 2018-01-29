package TrainingTwo;

import java.util.Scanner;

public class FormattingNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] data = scan.nextLine().split(" ");
		int a = Integer.parseInt(data[0]);
		double b = Double.parseDouble(data[1]);
		double c = Double.parseDouble(data[2]);
		
		String aToHex = Integer.toHexString(a).toUpperCase();
		String aToBinary = Integer.toBinaryString(a);
		int aToInt = Integer.parseInt(aToBinary)
;		
		System.out.format("|%-10s|%010d|%10.2f|%-10.3f|%n", aToHex, aToInt, b, c);

		scan.close();
	}

}
