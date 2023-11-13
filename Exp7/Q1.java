// Method overloading by changing the number of arguments:
// Create two methods, the first method sum() will perform addition of two numbers and second method sum() will perform addition of three numbers by overloading concept. 

package Exp7;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c;
        System.out.print("Enter a num: ");
        a = input.nextFloat();
        System.out.print("Enter a num: ");
        b = input.nextFloat();
        System.out.print("Enter a num: ");
        c = input.nextFloat();

        System.out.println("Sum of a and b is " + new Dummy().add(a, b));
        System.out.println("Sum of a, b and c is " + new Dummy().add(a, b, c));
        input.close();
    }
    
}

class Dummy {
    public float add(float a, float b){
        return a + b;
    } 
    public float add(float a, float b, float c){
        return a + b + c;
    }
}