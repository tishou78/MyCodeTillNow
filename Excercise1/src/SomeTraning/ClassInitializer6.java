package SomeTraning;

public class ClassInitializer6 {
	static int classField = 3;

	static {
		System.out.println(" : " + classField);

		classField = 1;
		for (int i = 2; i < 6; i++)
			classField *= i;
	}

	static {
		System.out.println(" = " + classField);
	}

	public static void main(String[] args) {
		System.out.println(classField);
	}
}
