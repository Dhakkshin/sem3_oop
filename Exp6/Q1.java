// Create a class Employee with the following details.
// The data members are name,address, age, gender and the method display() to show employee details.

package Exp6;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee me = new Employee();

        System.out.print("Enter name: ");
        me.name = input.nextLine();
        System.out.print("Enter address: ");
        me.address = input.nextLine();
        System.out.print("Enter age: ");
        me.age = input.nextInt();
        input.nextLine(); // to consume new line char
        System.out.print("Enter gender: ");
        me.gender = input.nextLine();

        System.out.println();
        me.display();

        input.close();
    }
}


class Employee {
    String name;
    String address;
    int age;
    String gender;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}