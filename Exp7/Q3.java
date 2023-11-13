// Method overloading by changing sequence of data type of parameters
// The method multiply() must be overloaded based on the sequence of data type of parameters. 
// The overloaded methods have to calculate multiplication of two numbers based on the sequence of argument types while calling methods at runtime by JVM.

package Exp7;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        float b;
        System.out.print("Enter an int: ");
        a = input.nextInt();
        System.out.print("Enter a float: ");
        b = input.nextFloat();

        System.out.println("a * b is " + new Dummy2().mul(a, b));
        System.out.println("b * a is " + new Dummy2().mul(b, a));
        input.close();
    }
}

class Dummy2 {
    public float mul(int a, float b){
        return a * b;
    } 
    public float mul(float a, int b){
        return a * b;
    }
}