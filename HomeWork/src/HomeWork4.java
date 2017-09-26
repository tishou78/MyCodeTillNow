import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Колко пари имаш?: ");
		double m = sc.nextDouble();
		System.out.println("Болен ли си?: ");
		boolean healthy = sc.hasNextBoolean();
		

		if (healthy) {
			if ((m >= 1) && (m <= 10)) {
				System.out.println("Ще отида на кафе");
			}
			if (m > 10) {
				System.out.println("Party all night");
			}
			if (m < 1) {
				System.out.println("Ще стоя вкъщи и ще цъкам игри");
			}
		} else {
			System.out.println("Няма да излизам");
			if (m > 1) {
				System.out.println("Ще си купя лекарства");

			} else {
				System.out.println("Ще си стоя вкъщи и ще пия чай");
			}
			sc.close();
		}
	}
}
