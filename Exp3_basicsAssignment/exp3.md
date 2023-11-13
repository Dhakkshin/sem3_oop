<div style="display: flex; justify-content: space-between;">
    <div style="text-align: left;"><h3>Experiment 3</h3></div>
    <div style="text-align: right;"><h3>Date: 02.09.2023</h3></div>
</div>
<div style="text-align: right;"><h3>Roll number: 22Z215</h3></div>

<h1 style="text-align: center;">Basic Java Programs</h1>

### 1. Find greatest of Two numbers [ if,else]
Aim:   
To find the greatest of two numbers using if else statement. 

Code:
```java
// Find greatest of Two numbers [if,else]

package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1:");
        int a = input.nextInt();
        System.out.println("Number 2:");
        int b = input.nextInt();

        if (a > b) System.out.println(a + " is greater than " + b);
        else if (b > a) System.out.println(b + " is greater than " + a);
        else System.out.println(a + " and " + b + "are equal.");

        input.close();
    }
}

```

Output:
```
Number 1:
3
Number 2:
5
5 is greater than 
```
---

### 2. Prepare Grade sheet for a student [ if, else if ] 
Aim:   
To prepare grade sheet for a student based on the marks.   

Code:
```java
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
```

Output:
```
Enter the marks:99
Grade: 10 O 
```
---
### 3. Check whether the given number is positive, negative or zero [ f, else if] 
Aim:
To check whether the given number is positive, negative or zero using if else statement.

Code:
```java
package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num > 0){
            System.out.println(String.format("%d is positive.", num));
        }
        else if (num < 0){
            System.out.println(String.format("%d is ngative.", num));
        }
        else {
            System.out.println(String.format("%d is zero", num));
        }

        input.close();
    }
}
```

Output:
```Enter a number: 4
4 is positive.
```
---

### 4. Take the length (L) and breadth (B) of the rectangle as input and find its area
Aim:   
To take the length (L) and breadth (B) of the rectangle as input and find its area.  

Code:
```java
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
```
Output:
```
Enter the lenght: 4
Enter the breadth: 5
The area is 20
```
---
### 5. You have been given a number 'N'. Your task is to find the sum of all even numbers from 1 to N 

Aim:  
To find the sum of all even numbers from 1 to N.

Code:
```java
package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i += 2){
            sum += i;
        }
        System.out.println(sum);
        input.close();
    }  
}
```
Output:
```
Enter a number: 10
20
```
---
### 6. For the given integer just print the sum of all even digits and odd digits separately. 

Aim:
To print the sum of all even digits and odd digits separately.

Code:
```java
package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int even = 0;
        int odd = 0;
        while (num > 0){
            int tmp = num % 10;
            int dummy = tmp % 2 == 0 ? ( even += tmp) : (odd += tmp);
            num /= 10;
        }

        System.out.println("Sum of even digits: " + even);
        System.out.println("Sum of odd digits: " + odd);
        input.close();
    }
}
```

Output:
```
Enter a number: 1234
Sum of even digits: 6
Sum of odd digits: 4
```
---
### 7. Write java program to print the pattern. [Nested for loop ]
``` 
*
* *
* * *
* * * *
* * * * *
```

Aim:
To print the pattern.

Code:
```java
package Exp3_basicsAssignment;

import java.util.Scanner;

public class Q7 {
    public static void main(String main[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++){
            for (int  j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }    
}
```

Output:
```
Enter a number: 5
*
* *
* * *
* * * *
* * * * *
```
---

## Result:
All the programs are executed and the output are verified.

---
---
