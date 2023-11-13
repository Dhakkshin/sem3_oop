package Exp4;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println(String.format("The area of circle of radius %f is %f.", radius, area));
        input.close();
    }
}
