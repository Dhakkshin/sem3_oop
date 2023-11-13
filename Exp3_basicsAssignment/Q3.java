package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num > 0){
            System.out.println(String.format("%d is positive.", num));
        }
        else if (num < 0){
            System.out.println(String.format("%d is ngative.", num));
        }
        else {
            System.out.println(String.format("%d is zero", num));
        }

        input.close();
    }
}
