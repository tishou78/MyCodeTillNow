package JavaTest;

public class IfNumCont1_2 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					for (int k = 0; k < 10; k++) {
						if(i==1||j==1||j2==1||k==1)sum++;
					}
				}
			}
		}
		System.out.println(sum);

	}

}
