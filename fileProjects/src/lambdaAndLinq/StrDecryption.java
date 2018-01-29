package lambdaAndLinq;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StrDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayList::new));

        List<Integer> nums1 = nums.stream().skip(m)
                .limit(n)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        int[] ints = nums1.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < ints.length; i++) {

            char a = (char) ints[i];
            if(a > 64 && a < 91) {
                System.out.print(a);
            }
        }
        System.out.println();
    }
}
/*
input1->
3 10
67 80 87 78 65 25 75 79 86 82 85 56 76 90 27 90
input2->
4 5
23 70 71 72 14 73 80 25 73 12 90 18 90 65

 */