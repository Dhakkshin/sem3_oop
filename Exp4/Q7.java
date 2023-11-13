package Exp4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int reverse = 0;
        int original = n;

        while (n > 0){
            int tmp = n % 10;
            reverse = reverse * 10 + tmp;
            n /= 10;
        }
        
        String palindrome = (original == reverse) ? "" : " not";
        System.out.println(String.format("%d is%s a palindrome number.", original, palindrome));
       input.close(); 
    }
}