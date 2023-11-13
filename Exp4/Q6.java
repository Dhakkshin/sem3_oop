package Exp4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        while (true){
            System.out.print("Enter a number: ");
            int n = input.nextInt();
            if (n < 0) break;
            sum += n;
        }
        System.out.println(sum);
        input.close();       
    }   
}