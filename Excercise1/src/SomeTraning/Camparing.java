package SomeTraning;

public class Camparing {
	public static void main(String[] args) {
		int[] oldArray = { 1, 2, 3};
		int[] newArray = oldArray;
		 oldArray[0] = -10;
		 System.out.println(newArray[0]);
		 for (int i = 0; i < newArray.length; i++) {
			 System.out.print(newArray[i] + ", ");
			 
			
		}
	}	 

}
