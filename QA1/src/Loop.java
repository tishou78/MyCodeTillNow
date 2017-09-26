import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.println("Enter number: ");
		int i = keyin.nextInt();
		System.out.println("Enter number 2: ");
		int b = keyin.nextInt();
		int c = (i < b) ? i : b;
		int d = (i < b) ? b : i;
		while (c <= d) {
			System.out.println(c);
			c++;
			
		}
		keyin.close();
	}

}
