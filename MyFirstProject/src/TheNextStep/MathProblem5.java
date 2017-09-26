package TheNextStep;

import java.util.Scanner;

public class MathProblem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some score:");
		int put_in = sc.nextInt();
		//byte, short, int, or char
	
		switch(put_in)
		{
		case 90:
			System.out.println("Very good");
			break;
		case 60:
			System.out.println("Good");
			break;
		case 40:
			System.out.println("Ok");
			break;
		default:
			System.out.println("The grades are not defined");
			break;
		}

		sc.close();
	}

}
