package Exp14;

import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfSquaresEven = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();

        int sumOfSquaresOdd = numbers.stream().filter(n -> n % 2 != 0).mapToInt(n -> n * n).sum();

        System.out.println("Sum of Squares of Even Numbers: " + sumOfSquaresEven);
        System.out.println("Sum of Squares of Odd Numbers: " + sumOfSquaresOdd);
    }
}
