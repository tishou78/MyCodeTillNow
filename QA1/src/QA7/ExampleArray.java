package QA7;

import java.util.Arrays;



public class ExampleArray {
	public static void main(String[] args) {
		//int[] array = {1,3,5,8,-1,-5};
		

		   // initializing unsorted int array
		   int iArr[] = {2, 1, 9, 6, 4};

		   // let us print all the elements available in list
		   for (int number : iArr) {
		   System.out.print(", " + number );
		   }
		   

		   // sorting array
		   Arrays.sort(iArr);

		   // let us print all the elements available in list
		   System.out.println("The sorted int array is:");
		   for (int number : iArr) {
		   System.out.print(", " + number);
		   }
		   }
		
}
