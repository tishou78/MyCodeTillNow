package lesson2;

import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		out.println("Enter some number from 1 to 10");
		int input_number = keyBoard.nextInt();
		int randomNumber = new Random().nextInt(10)+1;
		if(input_number == randomNumber){
			out.println("*****************");
			out.println("YOU WIN");
			out.println("*****************");}
		else{
			out.println("YOU LOSE");
			out.println("The winning number is:"+ randomNumber);
			
		}
		out.println("Thank You for playing!");
        keyBoard.close();
	}

}
