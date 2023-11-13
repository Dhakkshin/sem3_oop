package Exp4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        String oddOrEven = (n % 2 == 0) ? "even" : "odd";
        System.out.println(String.format("%d is an %s number.", n, oddOrEven));
        input.close();       
    }
    
}
