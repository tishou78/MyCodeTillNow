package TrainingTwo;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberDemo {

	public static void main(String[] args) {

		
		List<Integer> nums = new ArrayList<>();
		EvenNumbers en = new EvenNumbers();
		en.fillNimbers(nums, 10);
		System.out.println(nums);
		en.shuffleNumbers(nums);
		System.out.println(nums);
		
		System.out.println( en.findMaxNumPosition(nums));
		
	}

}
