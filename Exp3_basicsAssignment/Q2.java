// Prepare Grade sheet for a student [ if..else if ] 

package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks:");
        int mark = input.nextInt();
        if (mark > 90) System.out.println("Grade: 10 O");
        else if ((90 >= mark) && ( mark > 80)) System.out.println("Grade: 9 A+");
        else if ((80 >= mark) && ( mark > 70)) System.out.println("Grade:  8 A");
        else if ((70 >= mark) && ( mark > 60)) System.out.println("Grade: 7 B+");
        else if ((60 >= mark) && ( mark > 50)) System.out.println("Grade: 6 B");
        else System.out.println("Grade: F");
        input.close();
    }
}
