package lambdaAndLinq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> data = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayList::new));
        int dataLength = data.size();


        String selection = sc.nextLine();

        int avg = (data.stream().mapToInt(a -> a).sum()) / dataLength;

        List<Integer> filterList = data.stream().filter(a -> a > avg).collect(Collectors.toList());

        if ("All".equals(selection)) {
            filterList.stream().sorted().forEach(a -> {
                System.out.print(a + " ");
            });
            System.out.println();
        }
        else if("Min".equals(selection)){
            System.out.println(filterList.stream().min(Integer::compareTo).get());
        }
        else if("Max".equals(selection)){
            System.out.println(filterList.stream().max(Integer::compareTo).get());
        }
    }
}
