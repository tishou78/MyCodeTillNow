package lambdaAndLinq;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShortWordsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String delimiter = "[.,:;()\\[\\]\"'\\/!? ]";
        String[] words = sc.nextLine().toLowerCase().split(delimiter);

        System.out.println(Arrays.stream(words)
                .distinct()
                .filter(w -> w.length() < 5 && !w.isEmpty())
                .sorted()
                .collect(Collectors.joining(", ")));

    }
}
/*
input ->
In SoftUni you can study Java, C#, PHP and JavaScript. JAVA and c# developers graduate in 2-3 years. Go in!
 */