package Exp10;

import java.util.Scanner;

public class Q1_Reciprocal {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            scanner.close();
            if (number == 0) {
                throw new ArithmeticException("Cannot calculate reciprocal for zero.");
            }

            double reciprocal = 1.0 / number;
            System.out.println("Reciprocal: " + reciprocal);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}