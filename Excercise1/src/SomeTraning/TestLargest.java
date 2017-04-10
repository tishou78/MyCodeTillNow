package SomeTraning;


public class TestLargest {
	
	public static void main(String[] args) {

		int[] arr = new int[3];
	    arr[0] = 8;
	    arr[1] = 9;
	    arr[2] = 1;
	    System.out.println(largest(arr));
	}
	 public static int largest(int[] list) {
		    int index, max = Integer.MIN_VALUE;
		    for (index = 0; index < list.length; index++) {
		      if (list[index] > max) {
		        max = list[index];
		      }
		    }
		    return max;
	 }
}
