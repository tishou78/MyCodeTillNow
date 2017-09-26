import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter value a:" );
		int a = keyboard.nextInt();
		System.out.println("Enter value b: ");
		int b = keyboard.nextInt();
		
		System.out.println(a + b);
		
		if ((a + b) % 2 == 0){
			System.out.println("The number is even");
			
		}else{
			System.out.println("The number is odd");
		}
	    keyboard.close();
	}

}
