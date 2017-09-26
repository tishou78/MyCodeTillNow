import java.util.Scanner;

public class exampleFor {
	public static void main(String[] args) {
		Scanner kyeboard = new Scanner(System.in);
		System.out.println("enter number");
		int pr = kyeboard.nextInt();
		
		for(int i = 0;i <= pr; i++) {
			if(i % 3 == 0){
			System.out.print(i +" ");
			}
		}
		kyeboard.close();
	}

}
// fakturel   5!= 1x2x3x4x5     n!= 1x2x3...n