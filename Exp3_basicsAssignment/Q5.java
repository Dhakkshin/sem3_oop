package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i += 2){
            sum += i;
        }
        System.out.println(sum);
        input.close();
    }  
}