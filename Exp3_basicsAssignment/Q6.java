package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int even = 0;
        int odd = 0;
        while (num > 0){
            int tmp = num % 10;
            int dummy = tmp % 2 == 0 ? ( even += tmp) : (odd += tmp);
            num /= 10;
        }

        System.out.println("Sum of even digits: " + even);
        System.out.println("Sum of odd digits: " + odd);
        input.close();
    }
}