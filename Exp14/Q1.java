package Exp14;

interface SumCalculator {
    int calculateSum(int a, int b);
}

public class Q1 {
    public static void main(String[] args) {
        SumCalculator sum = (a, b) -> a + b;
        
        int result = sum.calculateSum(5, 7);
        System.out.println("Sum: " + result);
    }
}
