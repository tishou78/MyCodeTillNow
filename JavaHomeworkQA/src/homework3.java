import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		Scanner pi = new Scanner(System.in);
	    System.out.println("Enter value A: ");
	    int a = pi.nextInt();
	 
	    System.out.println("Enter value B: ");
	    int b = pi.nextInt();
	 
	    System.out.println("Enter value C: ");
	    int c = pi.nextInt();
	    
	    if((a > b) && (b > c))
	    	System.out.println(a +", " + b + ", "+ c);
	    if((a > c) && (c > b))
	    	System.out.println(a +", " + c + ", "+ b);
	    if((b > c) && (c > a))
	    	System.out.println(b +", " + c + ", "+ a);
	    if((b > a) && (a > c))
	    	System.out.println(b +", " + a + ", "+ c);
	    if((c > a) && (a > b))
	    	System.out.println(c +", " + a + ", "+ b);
	    if((c > b) && (b > a))
	    	System.out.println(c +", " + b + ", "+ a);
	    
	    pi.close();
	  
	    	
   }    
	

}
