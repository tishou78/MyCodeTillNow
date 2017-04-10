package SomeTraning;

public class SomeTraining2 {

	public static void main(String[] args) {
		/*
		 * int[][] array = { {1,2,3,4,5,6}, {154,186,387,281,75,183},
		 * {155,187,390,283,76,182}, {107,186,35,208,17,188},
		 * {153,1822,353,282,78,118}, {0,1825,34,298,6,158},
		 * {13,23,43,218,5,32}};
		 * 
		 * 
		 * for (int i = 0; i < array.length; i++) { for (int j = 0; j <
		 * array[0].length; j++) { System.out.print(array [i][j] + ", "); }
		 * System.out.println(); }
		 */

		int b[][] = new int[6][];
		b[0] = new int[] { 1, 1 };
		b[1] = new int[] { 2, 2, 2 };
		b[2] = new int[] { 3, 3 };
		for (int i = 0; i < b.length; i++) {

				if (b[i] == null) {
					System.out.println("this subarray is null");
				} else {
				for (int j = 0; j < b[i].length; j++) {
					System.out.print(b[i][j] + ",");
				}
				System.out.println();
			}
		}
	}
}
