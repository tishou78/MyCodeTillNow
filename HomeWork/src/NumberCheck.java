import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ctrl = sc.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 1; j--) {
				if (sum >= ctrl)
					break;
				sum += i * 2 + j * 3;
				count++;
			}
		}
		System.out.printf("%d moves \n", count);
		if (sum >= ctrl) {
			System.out.printf("Score: %d >= %d \n", sum, ctrl);

			sc.close();
		}
	}

}
