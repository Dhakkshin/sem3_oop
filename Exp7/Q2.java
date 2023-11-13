// Method overloading by changing data type of parameters
// Create two methods having the same name but will differ in the data type of parameters. 
// The first method sub() will receive two integer arguments and the second method sub() will receive two double arguments. 

package Exp7;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.print("Enter a num: ");
        a = input.nextDouble();
        System.out.print("Enter a num: ");
        b = input.nextDouble();

        System.out.println("Difference between a and b is " + new Dummy1().sub((int) a, (int) b));
        System.out.println("Difference between a and b is " + new Dummy1().sub(a, b));
        input.close();
    }
}

class Dummy1 {
    public int sub(int a, int b){
        return a - b;
    } 
    public double sub(double a, double b){
        return a - b;
    }
}