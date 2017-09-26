package JavaTest;

public class IfNumContains1 {

	
	public static void main(String[] args) {

		long count = 0;
		for (long i = 0; i <= 10_000_000_000L; i++) {
			if (String.valueOf(i).contains("1"))
				
			count++;
		}
		System.out.println(count);
	}

}
