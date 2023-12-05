package Exp11a;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String inputNumber = scanner.nextLine();

        int number = Integer.parseInt(inputNumber);
        System.out.println("Number: " + number);

        scanner.close();
    }
}
