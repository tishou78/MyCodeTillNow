package TrainingTwo;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EvenNumbers {

	int maxNumPosition = Integer.MIN_VALUE;
	
	public void fillNimbers(List<Integer> nums, int size) {
		Random r = new Random();		
		int randNum = r.nextInt(20-6) + 6;
		
		int evenNum = 0;
		if (randNum % 2 == 0) {
			evenNum = randNum;
		}else{
			randNum = r.nextInt(20-6) + 6;
		}
		for (int i = 0; i < size; i++) {
			nums.add(evenNum);
			evenNum += 2;
		}
	}

	public void shuffleNumbers(List<Integer> nums) {
		Collections.shuffle(nums);
	}
	
	public int findMaxNumPosition(List<Integer> nums){
	
		int maxNum = nums.stream().max(Integer::compareTo).get();
		for (Integer integer : nums) {
			if(integer == maxNum){
				maxNumPosition = nums.indexOf(integer);
			}
		}
		
		return maxNumPosition;
	}

}
