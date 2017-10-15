import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex = "\\d+";
		String[] names = sc.nextLine().split(regex);
		for (String string : names) {
			System.out.println(string);
		}
		
		sc.close();
	}
}
