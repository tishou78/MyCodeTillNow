package QA9;


import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest1 {
	private Calculator calculator;
	private int a;
	private int b;
	
	@Before
	public void setUp(){
		System.out.println("Before");
		calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a:");
		a = scan.nextInt();
		System.out.println("Enter b:");
		b = scan.nextInt();
		scan.close();
	}
	@After
	public void cleanUp(){
		System.out.println("Cleaning up....");
		
	}

	@Test
	public void testSum() {
		
		calculator.sum(a,b);
        System.out.println("testing sum");	
        
    }
	@Test
	public void testDiff() {
		fail("Not yet implemented");
	}
	
	

}
