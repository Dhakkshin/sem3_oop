package Exp4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int year = input.nextInt();
        String leap = (year % 4 == 0) ? "a leap" : "not a leap";
        System.out.println(String.format("%d is %s year.", year, leap));
        input.close();       
    }
    
}
