<div style="display: flex; justify-content: space-between;">
    <div style="text-align: left;"><h3>Experiment 4</h3></div>
    <div style="text-align: right;"><h3>Date: 05/09/2023</h3></div>
</div>
<div style="text-align: right;"><h3>Roll number: 22z215</h3></div>

<h1 style="text-align: center;">Java Programs II</h1>

### 1. Write a program that uses a block of code as a target of a for loop and generate output as follows 
```
x : 0
y: 20
x:1
y: 18
x:2
y: 16
.
.
.
x:9
y:2
```
**Aim:**         
To write a program that uses a block of code as a target of a for loop and generate output as follows.

**Code:**      
```java
package Exp4;

public class Q1 {
    public static void main(String args[]){
        int x = 0;
        int y = 20;

        for (; y > 0; x++, y-=2){
            System.out.println(String.format("x: %d", x));
            System.out.println(String.format("y: %d", y));
            System.out.println();
        }
    }
    
}
```

**Output:**      
```
x: 0
y: 20

x: 1
y: 18

x: 2
y: 16

x: 3
y: 14

x: 4
y: 12

x: 5
y: 10

x: 6
y: 8

x: 7
y: 6

x: 8
y: 4

x: 9
y: 2
```
---

### 2. Write a java program that uses double variables to compute area of circle.
**Aim:**            
To write a java program that uses double variables to compute area of circle.

**Code:**      
```java
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
```

**Output:**      
```
Enter the radius: 4
The area of circle of radius 4.000000 is 50.240000.
```
---
### 3. Write a java program  to find factorial of a number
**Aim:**              
To write a java program  to find factorial of a number.

**Code:**      
```java
package Exp4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int f = factorial(num);
        System.out.println(String.format("The factorial of %d is %d.", num, f));
        input.close();
    }

    public static int factorial(int n){
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }
}
```

**Output:**      
```
Enter a number: 4
The factorial of 4 is 24.
```
---

### 4. Write a java program  to check whether the given year is leap year or not 
**Aim:**         
To write a java program  to check whether the given year is leap year or not.

**Code:**      
```java
package Exp4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int year = input.nextInt();
        String leap = (year % 4 == 0) ? "a leap" : "not a leap";
        System.out.println(String.format("%d is %s year.", year, leap));
        input.close();       
    }
    
}

```
**Output:**      
```
Enter a number: 2004
2004 is a leap year.
```
---
### 5. Write a java program  to check whether the number is odd or even
**Aim:**         
To write a java program  to check whether the number is odd or even.

**Code:**      
```java
package Exp4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        String oddOrEven = (n % 2 == 0) ? "even" : "odd";
        System.out.println(String.format("%d is an %s number.", n, oddOrEven));
        input.close();       
    }
    
}
```
**Output:**      
```
Enter a number: 4
4 is an even number.
```
---
### 6. Make use of break statement in a while loop to calculate sum of all positive numbers
**Aim:**              
To make use of break statement in a while loop to calculate sum of all positive numbers.

**Code:**      
```java
package Exp4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        while (true){
            System.out.print("Enter a number: ");
            int n = input.nextInt();
            if (n < 0) break;
            sum += n;
        }
        System.out.println(sum);
        input.close();       
    }   
}
```

**Output:**      
```
Enter a number: 4
Enter a number: 8
Enter a number: 5
Enter a number: -1
17
```
---
### 7. Write a java program to check palindrome number
**Aim:**              
To write a java program to check palindrome number.   
**Code:**      
```java
package Exp4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int reverse = 0;
        int original = n;

        while (n > 0){
            int tmp = n % 10;
            reverse = reverse * 10 + tmp;
            n /= 10;
        }
        
        String palindrome = (original == reverse) ? "" : " not";
        System.out.println(String.format("%d is%s a palindrome number.", original, palindrome));
       input.close(); 
    }
}
```

**Output:**      
```
Enter a number: 1234321
1234321 is a palindrome number.
```
---

## Result:
All the programs are executed and the output are verified.

---
---
