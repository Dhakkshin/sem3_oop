package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lenght: ");
        int l = input.nextInt();
        System.out.print("Enter the breadth: ");
        int b = input.nextInt();
        int area = l * b;
        System.out.println(String.format("The area is %d", area));
        input.close();
    }
    
}
