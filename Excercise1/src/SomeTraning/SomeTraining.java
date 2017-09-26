package SomeTraning;

import java.util.ArrayList;
import java.util.Collection;

public class SomeTraining {

	public static void main(String[] args) {

		Collection<String> coll = new ArrayList<>();
		coll.add("Fred");coll.add("Jim");coll.add("Sheila");
		System.out.println("coll is " + coll);
		coll.remove("Jim");
		System.out.println("coll is " + coll);
	}

}
