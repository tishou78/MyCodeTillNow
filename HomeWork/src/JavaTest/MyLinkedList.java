package JavaTest;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("patrik");
		names.add("mark");
		names.add("tom");
		names.add("jhon");
		names.addFirst("MyFirst");
		names.addLast("maria");
		names.set(2, "hari");
    
		/*for (String x : names) {
			System.out.println(x);
		}*/
		
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
