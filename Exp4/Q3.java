package Exp4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int f = factorial(num);
        System.out.println(String.format("The factorial of %d is %d.", num, f));
        input.close();
    }

    public static int factorial(int n){
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }
}
