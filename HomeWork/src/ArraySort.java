import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = new int[]{12,23,45,32,78,11};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
