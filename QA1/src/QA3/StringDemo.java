package QA3;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 =new String("abc");
		
		System.out.println(s1 == s1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.indexOf("b"));
		System.out.println(s1.indexOf("ab"));
		System.out.println(s1.indexOf("z"));
		
		s1 = s1.replace("b", "y");
	//	s1.replaceAll("d", "y"); ->change all accurance
		System.out.println(s1);
		
		String s4 = "Hello" + s1 + s2 + s3;
		System.out.println(s4);
	}

}
