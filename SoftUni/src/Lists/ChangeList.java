package Lists;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+"))
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		String[] input = scan.nextLine().split("\\s+");
		
		while (!(input[0].equals("Odd") || input[0].equals("Even"))){
			
			if(input[0].equals("Delete")){
				int elementPos = Integer.parseInt(input[1]);
				DelEl(list, elementPos);
			}else if(input[0].equals("Insert")){
				int element = Integer.parseInt(input[1]);
				int position = Integer.parseInt(input[2]);
				InsertMethod(list, element, position);
			}
			
			
			input = scan.nextLine().split("\\s+");
		}
		if (input[0].equals("Odd")) {
			for (Integer integer : list) {
				
				if (integer % 2 != 0) {
					System.out.print(integer + " ");
				}
			}
				
		}else{
			for (Integer integer : list) {
				
				if (integer % 2 == 0) {
					System.out.print(integer + " ");
				}
			}
			
		}
		System.out.println();
		scan.close();
	}

	private static void InsertMethod(List<Integer> list, int element, int position) {

		list.add(position, element);
	}

	private static void DelEl(List<Integer> list, int elementPos) {

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(elementPos)){
				list.remove(i);
				i--;
			}
		}
	}

}
