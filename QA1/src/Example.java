import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner kyeboard = new Scanner(System.in);
		System.out.println("Enter number: ");
		double n = kyeboard.nextDouble();
		
		//System.out.println("Enter true or false");
		//boolean b = kyeboard.nextBoolean();
		
		if (n > 10) {
			System.out.println("The number is  > 10 ");
		}else if(n < 10){
			System.out.println("The number is < 10");
		}else{
			System.out.println("The number is = 10");
		}
			kyeboard.close();		
	}

}
