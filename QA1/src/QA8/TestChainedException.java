package QA8;

public class TestChainedException {
	public static void main(String[] args) {
		String s = null;
		printStringSize(s);
		
	}

	private static void printStringSize(String s) {
		try {
			System.out.println(s.length());
			
		} catch (Exception e) {
            System.out.println("Someting went wrong");
            //throw new RuntimeException("don't like this");
        }
		
	}

}
