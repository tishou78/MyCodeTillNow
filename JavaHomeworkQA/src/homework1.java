import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner pi = new Scanner(System.in);
		System.out.println("Enter value A: ");
		double A = pi.nextDouble();

		System.out.println("Enter value B: ");
		double B = pi.nextDouble();

		System.out.println("Enter value C: ");
		double C = pi.nextDouble();

		if (C > A && C < B) {
			System.out.println(C + " is between A and B");
		} else {
			System.out.println("Value 'C' is not between A and B");
		}

		pi.close();

	}

}
