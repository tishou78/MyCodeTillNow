package MyPackage;

import java.util.HashSet;
import java.util.Set;



public class ExampleList {

	public static void main(String[] args) {
		Set<MyClass> data = new HashSet<>();
		MyClass a1 = new MyClass(10, 20);
		MyClass a2 = new MyClass(11, 21);
		MyClass a3 = new MyClass(10, 20);
		MyClass a4 = new MyClass(11, 21);
		MyClass a5 = new MyClass(10, 20);

		data.add(a1);
		data.add(a2);
		data.add(a3);
		data.add(a4);
		data.add(a5);
		data.add(a5);

		System.out.println(data.size());

	}

}

class MyClass {
	private final int x;
	private final int y;

	public MyClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}


