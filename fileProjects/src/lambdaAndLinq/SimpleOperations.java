package lambdaAndLinq;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Integer> data = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            data.add(num);
        }

        int sum = data.stream().mapToInt(Integer::valueOf).sum();

        int min = data.stream().min(Integer::compareTo).get();

        int max = data.stream().max(Integer::compareTo).get();

        double avg = data.stream().mapToDouble(Double::valueOf).average().getAsDouble();

        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Min = %d%n", min);
        System.out.printf("Max = %d%n", max);
        System.out.printf("Avg = %.1f%n", avg);
    }
}
/*
input->
5
12
20
-5
37
8

 */