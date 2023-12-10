package Exp14;

import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 3, 15, 7);

        // Using lambda expressions
        int max = numbers.stream().max((a, b) -> Integer.compare(a, b)).orElse(0);
        int min = numbers.stream().min((a, b) -> Integer.compare(a, b)).orElse(0);

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
