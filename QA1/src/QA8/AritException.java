package QA8;

public class AritException {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		try{
		System.out.println(a/b);
		System.out.println("this line never get printed");
		}catch(ArithmeticException e){
			System.out.println("zero is forbiden");
			
		}
		System.out.println("hey, this is so boring");
	}

}
