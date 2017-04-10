package SomeTraning;

import java.util.Scanner;



public class WorkIT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you wanna to sort? ");
        int count = in.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        
        
        
        for(int i = 0; i < count; i++) {
           System.out.println("Enter a number ");
           int temp = in.nextInt();
           if(temp % 2 == 0) oddSum += temp;
           else evenSum += temp;
           
        }
 
        System.out.println("oddSum is: " + oddSum);
        System.out.println("evenSum is: " + evenSum);
        in.close();
        
    }
}
    


