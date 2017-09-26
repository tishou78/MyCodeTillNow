import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner rem = new Scanner(System.in);
		System.out.println("enter number: ");
		
		int p = rem.nextInt();
		int i = 100;
		while(i > 0){
			if (i % p == 0){
			System.out.println(i);
			}
			i--;
		}
		rem.close();
	}

}
