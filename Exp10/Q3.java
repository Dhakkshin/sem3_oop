package Exp10;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter student details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Register Number: ");
            int regNo = scanner.nextInt();

            System.out.print("Mark 1: ");
            int mark1 = scanner.nextInt();

            System.out.print("Mark 2: ");
            int mark2 = scanner.nextInt();

            System.out.print("Mark 3: ");
            int mark3 = scanner.nextInt();

            // Create a Student object
            Student student = new Student();

            // Use the getInput method to set student details, handling exceptions
            student.getInput(name, regNo, mark1, mark2, mark3);

            // Calculate total and average
            student.calculateTotalAndAverage();

            // Display student information
            student.displayStudentInfo();
            
            scanner.close();
        } catch (InvalidRegNoException | MarkOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}

class InvalidRegNoException extends Exception {
    InvalidRegNoException(String message) {
        super(message);
    }
}

class MarkOutOfBoundsException extends Exception {
    MarkOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int regNo;
    private int mark1;
    private int mark2;
    private int mark3;
    private int total;
    private double average;

    public void getInput(String name, int regNo, int mark1, int mark2, int mark3)
            throws InvalidRegNoException, MarkOutOfBoundsException {
        if (regNo > 999999) {
            throw new InvalidRegNoException("Invalid Register Number");
        }
        if (mark1 > 100 || mark2 > 100 || mark3 > 100) {
            throw new MarkOutOfBoundsException("Marks should be within 0 to 100");
        }

        this.name = name;
        this.regNo = regNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void calculateTotalAndAverage() {
        total = mark1 + mark2 + mark3;
        average = total / 3.0;
    }

    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + regNo);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
