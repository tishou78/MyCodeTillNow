import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� ����?: ");
		double m = sc.nextDouble();
		System.out.println("����� �� ��?: ");
		boolean healthy = sc.hasNextBoolean();
		

		if (healthy) {
			if ((m >= 1) && (m <= 10)) {
				System.out.println("�� ����� �� ����");
			}
			if (m > 10) {
				System.out.println("Party all night");
			}
			if (m < 1) {
				System.out.println("�� ���� ����� � �� ����� ����");
			}
		} else {
			System.out.println("���� �� �������");
			if (m > 1) {
				System.out.println("�� �� ���� ���������");

			} else {
				System.out.println("�� �� ���� ����� � �� ��� ���");
			}
			sc.close();
		}
	}
}
