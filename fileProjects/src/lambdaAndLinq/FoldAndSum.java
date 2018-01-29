package lambdaAndLinq;

import java.util.*;
import java.util.stream.Collectors;

public class FoldAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::valueOf).collect(Collectors.toCollection(ArrayList::new));

        int k = numbers.size() / 4;

        ArrayList <Integer> leftPart = numbers.stream()
                .limit(k)
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.reverse(leftPart);

        ArrayList<Integer> rightPart = numbers.stream()
                .skip(3 * k).limit(k)
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.reverse(rightPart);

        ArrayList<Integer> downPart = numbers.stream()
                .skip(k)
                .limit(2 * k)
                .collect(Collectors.toCollection(ArrayList::new));

        leftPart.addAll(rightPart);
        rightPart.clear();
        rightPart.addAll(downPart);

        for (int i = 0; i < downPart.size(); i++) {
            downPart.set(i, downPart.get(i) + leftPart.get(i));
        }
        System.out.println(leftPart.stream()
                 .map(Object::toString)
                 .collect(Collectors.joining(" ")) + " +");

        System.out.println(rightPart.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")) + " =");

        System.out.println(downPart.toString()
                .replace("[","")
                .replace("]","")
                .replace(",",""));

    }
}
/*
input1->
4 3 -1 2 5 0 1 9 8 6 7 -2

input2->
5 2 3 6

input3->
1 2 3 4 5 6 7 8
 */