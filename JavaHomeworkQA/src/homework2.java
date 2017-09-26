import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner pi = new Scanner(System.in);
	    System.out.println("Enter value A: ");
	    double A = pi.nextDouble();
	    
	    System.out.println("Enter value B: ");
	    double B = pi.nextDouble();
	    System.out.println("A + B = " +(A + B));
	    System.out.println("A - B = " +(A - B));
	    System.out.println("A * B = " +(A * B));
	    System.out.println("A / B = " +(A / B));
	    System.out.println("A % B = " +(A % B));
	    
	    pi.close();
	}

}
