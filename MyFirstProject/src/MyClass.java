import java.util.Scanner;

public class MyClass {

	public static void main(String[] args){
		
		Scanner newName = new Scanner(System.in);
		System.out.println("Enter your name:");
		String who = newName.nextLine();
		mysay(who);
	
		newName.close();
	
	}
	public static void mysay(String name){
		System.out.println("Hello, " + name + "!");
	}
		
		
		
}


	
		   
	
	


