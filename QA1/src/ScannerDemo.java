import java.util.Scanner;

public class ScannerDemo {
	static int m = 1;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        //	Ctr+Shift+o importira Scanner
		int i = scanner.nextInt();
		for (int j = 0; j < i; j++) {
			System.out.println(ScannerDemo.m);
			m++;
		}
		System.out.printf("ScannerDemom m = %d %n", ScannerDemo.m);
		for (int j = 0; j < i; j++) {
			m--;
			System.out.println(ScannerDemo.m);
		}
		scanner.close();
	}

}
