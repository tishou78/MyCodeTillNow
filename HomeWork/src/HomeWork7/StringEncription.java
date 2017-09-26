package HomeWork7;

import java.util.Scanner;

public class StringEncription {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char someLetter = ' ';
		int[] containAllChar = new int[n];
		for (int i = 0; i < n; i++) {
			someLetter = sc.next().charAt(0);
			containAllChar[i] = Encript(someLetter);
		}
		for (int i = 0; i < containAllChar.length; i++) {
			System.out.print(containAllChar[i]);
		}
		
		System.out.println();
		sc.close();
	}
	public static int Encript(char letter){
		 
		int charToAscii = letter;
		
		return charToAscii ;
	}

}
