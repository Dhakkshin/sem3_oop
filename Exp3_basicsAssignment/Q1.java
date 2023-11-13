// Find greatest of Two numbers [if,else]

package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1:");
        int a = input.nextInt();
        System.out.println("Number 2:");
        int b = input.nextInt();

        if (a > b) System.out.println(a + " is greater than " + b);
        else if (b > a) System.out.println(b + " is greater than " + a);
        else System.out.println(a + " and " + b + "are equal.");

        input.close();
    }
}
