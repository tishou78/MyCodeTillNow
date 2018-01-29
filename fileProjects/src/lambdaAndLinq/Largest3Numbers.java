package lambdaAndLinq;

import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayList::new));


        System.out.println(nums.stream().sorted((a, b) -> {    //((a, b) -> b - a)
            return b - a;
        })
                .limit(3)
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
//input1 -> 10 30 15 20 50 5
//input2 -> 20 30