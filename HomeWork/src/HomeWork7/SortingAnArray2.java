package HomeWork7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAnArray2 {

	public static void main(String[] args) {
		int[] a = { 12, 3, 6, 7, 15 };
		int[] b = { 8, 35, 64, 123, 4 };

		
		List<Integer> ab = new ArrayList<>();
		
		
				
		for (int i : a) {
			ab.add(i);
		}
		for (int v : b) {
			ab.add(v);
		}
		Collections.sort(ab);
		for (Integer integer : ab) {
			System.out.println(integer);
		}
		System.out.println("-------------------");
		Collections.reverse(ab);
		for (Integer integerB : ab) {
			System.out.println(integerB);
		}
	}
}
