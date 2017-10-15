package Lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MaxSequence {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = Arrays.stream(reader.readLine().split("\\s+"))
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
		LinkedHashMap<Integer, Integer> dataColect = new LinkedHashMap<>();

		for (Integer integer : list) {
			if (!dataColect.containsKey(integer)) {
				dataColect.put(integer, 0);
			}
			dataColect.put(integer, dataColect.get(integer) + 1);
		}

	
		//searching a max value of value and get the key of this value
		int position = Collections.max(dataColect.entrySet(), (e1,e2)-> e1.getValue() - e2.getValue()).getKey();

		

		for (Entry<Integer, Integer>  integer : dataColect.entrySet()) {
			if(integer.getKey().equals(position)){
			
				for (int i = 0; i < integer.getValue(); i++) {
					System.out.print(integer.getKey()+" ");
				}
				System.out.println();
			}
		}
		//input -> 3 4 4 5 5 5 2 2
		//output -> 5 5 5 
		
	}

}
