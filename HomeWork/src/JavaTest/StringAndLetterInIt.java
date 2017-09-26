package JavaTest;

import java.util.Scanner;

public class StringAndLetterInIt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str = sc.nextLine().toLowerCase();
		char[] name =  str.toCharArray();
		System.out.println("Enter a char: ");
		char ch = sc.next().toLowerCase().charAt(0);
		String let;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if(name[i] == ch)
				sum +=1;
		}
		if(sum >= 2)
			let = "letters of";
		else let = "letter of";
		System.out.println("\"" + str + "\"" + " contains " + sum +" "+ let +" \""+ ch +"\"");
        sc.close();
	}

}
