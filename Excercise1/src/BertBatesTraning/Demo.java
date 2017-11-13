package BertBatesTraning;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Set<MyClass> data = new HashSet<>();
		Demo.MyClass a1 = new Demo().new MyClass(10, 20);
		Demo.MyClass a2 = new Demo().new MyClass(11, 21);
		Demo.MyClass a3 = new Demo().new MyClass(10, 20);
		Demo.MyClass a4 = new Demo().new MyClass(11, 21);
		Demo.MyClass a5 = new Demo().new MyClass(10, 20);
		
		data.add(a1);
		data.add(a2);
		data.add(a3);
		data.add(a4);
		data.add(a5);
		data.add(a5);
		
		System.out.println(data.size());

	}

	public class MyClass {
		private final int x;
		private final int y;

		public MyClass(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
