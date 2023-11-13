package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q7 {
    public static void main(String main[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++){
            for (int  j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }    
}
