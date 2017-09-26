package JavaTest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGratterThan3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[] numbers = new int[in];
		
		for (int i = 0; i < in; i++) {
			numbers[i] = sc.nextInt();
			
		}
        System.out.println(Arrays.toString(getThreeLowest(numbers)));
        sc.close();
	}
	private static int[] getThreeLowest(int[] array) {
	    int[] lowestValues = new int[3];
	    Arrays.fill(lowestValues, Integer.MAX_VALUE);

	    for(int n : array) {
	        if(n < lowestValues[2]) {
	            lowestValues[2] = n;
	            Arrays.sort(lowestValues);
	        }
	    }
	    return lowestValues;
	}

}
