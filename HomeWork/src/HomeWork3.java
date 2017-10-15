import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter value a:" );
			int a = sc.nextInt();
			System.out.println("Enter value b: ");
			int b = sc.nextInt();
			
			System.out.println(a + b);
			
			if ((a + b) % 2 == 0){
				System.out.println("The number is even");
				
			}else{
				System.out.println("The number is odd");
			}
		} catch (InputMismatchException e) {
			System.out.println("You have not input a figure!!!");
		}
	    sc.close();
	}

}
