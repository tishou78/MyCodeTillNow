package HomeWork7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoInOne {

	public static void main(String[] args) {

		List<Integer> a = Arrays.asList(1,2,3,4);
		List<Integer> b = Arrays.asList(9,8,7,6);
		List<Integer> c = new ArrayList<>();
		c.addAll(a);
		c.addAll(b);
		Collections.sort(c);
		
		for (Integer integer : c) {
			System.out.print(String.format(" %s,", integer));
		}
		
		
	}

}
