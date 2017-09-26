package HomeWork7;

import java.util.Arrays;


public class SortingAnArray {

	public static void main(String[] args) {
		int[] a = { 12, 3, 6, 8, 15 };
		int[] b = { 8, 35, 64, 123, 3 };
		int[] hs = new int[a.length + b.length];
	
		
		for (int i = 0; i < a.length; i++) {
			hs[i] = a[i];
		}
        for (int d = 0; d < b.length; d++) {
        	hs[d + a.length] = b[d];
			
		}	
        Arrays.sort(hs);
        for (int i = 0; i < hs.length; i++) {
			System.out.println("num: " + hs[i]);
		}

	}
}
