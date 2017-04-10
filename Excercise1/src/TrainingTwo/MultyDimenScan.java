package TrainingTwo;

import java.util.Arrays;
import java.util.Scanner;

public class MultyDimenScan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] multyArray = new int[5][5];
		for (int i = 0; i < multyArray.length; i++) {
			for (int j = 0; j < multyArray[i].length; j++) {
				System.out.println("Enter the matrix number");
				multyArray [i][j] = scan.nextInt();
				
				
				
				
			}
			System.out.println();
			
		}
		for(int[] x: multyArray){
			System.out.println(Arrays.toString(x));
		}
		scan.close();
	}

}
