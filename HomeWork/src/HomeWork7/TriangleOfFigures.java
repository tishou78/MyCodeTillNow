package HomeWork7;

import java.util.Scanner;

public class TriangleOfFigures {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= n; i++) {
			FigureLength(i);
		}
		for (int i = n-1; i > 0; i--) {
			FigureLength(i);
		}

		sc.close();
	}

	private static void FigureLength(int i) {
		StringBuilder sb = new StringBuilder();
		for (int j = 1; j <= i; j++) {
			sb.append(j + " ");
		}
		System.out.println(sb.toString());
	}

}
