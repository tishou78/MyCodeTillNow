package BertBatesTraning;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Set<Storage> data = new HashSet<>();
		Storage a1 = new Storage(10, 20);
		Storage a2 = new Storage(11, 21);
		Storage a3 = new Storage(10, 20);
		Storage a4 = new Storage(11, 21);
		Storage a5 = new Storage(10, 20);

		data.add(a1);
		data.add(a2);
		data.add(a3);
		data.add(a4);
		data.add(a5);
		data.add(a5);

		System.out.println(data.size());

	}

}

class Storage {
	private final int x;
	private final int y;
	

	public Storage(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
