<div style="display: flex; justify-content: space-between;">
    <div style="text-align: left;"><h3>Experiment 9</h3></div>
    <div style="text-align: right;"><h3>Date: 17/10/2023</h3></div>
</div>
<div style="text-align: right;"><h3>Roll number: 22z215</h3></div>

<h1 style="text-align: center;">Packages</h1>

### 1. Write a program to show the use of the ArrayList class of Java.util package [ In-built]       
**Aim:**  
To write a java program to show the use of the ArrayList class of Java.util package.        

**Code:**
```java
package Exp9;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }
        System.out.println("The elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i));
        }
        input.close();
    }
}
```

**Output:**
```
Enter the number of elements: 4
Enter the elements:
9
8
7
6
The elements are:
9
8
7
6
```
---

### 2. Create a class A in learnjava package that access it in another class B by using import keyword.
**Aim:**  
To write a java program to create a class A in learnjava package that access it in another class B by using import keyword.       

**File Structure:**     
```
exp9/
├── learnjava/
│   ├── A.java
├── Q2.java
```

**Code:**   

Main Program, Q2.java:
```java
package Exp9;

import Exp9.learnjava.A;

public class Q2 {
    
    public static void main(String[] args) {
        A objectOfA = new A();
        objectOfA.testFunction();
    }
}

```  
Package learnjava, A.java:
```java
package Exp9.learnjava;

public class A {
    public void testFunction() {
        System.out.println("This is a test function is located in A.java in the package learnjava");
    }
}
```

**Output:**  
```
This is a test function is located in A.java in the package learnjava
```
---
### 3. Create a class Calculator inside a package name Advcalculate. To create a class inside a package, declare the package name in the first statement in your program. A class can have only one package declaration. Make use of this package  Advcalculate   in another program and use the class Calculator. Create more number of classes in   Advcalculate, and import the package to make use all the classes of this package. 
**Aim:**   
To write a java program to create a package with multiple classes and use them in another program.

**File Structure:**     
```
exp9/
├── Advcalculate/
│   ├── addCalc.java
│   ├── mulCalc.java
├── Q3.java

```

**Code:**   

Main Program, Q3.java:
```java
package Exp9;

import Exp9.Advcalculate.addCalc;
import Exp9.Advcalculate.mulCalc;

public class Q3 {
    public static void main(String[] args) {
        addCalc add = new addCalc();
        mulCalc mul = new mulCalc();
        System.out.println("Addition: " + add.add(5, 6));
        System.out.println("Multiplication: " + mul.mul(5, 6));
    }
}
```  
Package Advcalculate addCalc.java:
```java
package Exp9.Advcalculate;

public class addCalc {
    public int add(int a, int b) {
        return a + b;
    }
}
```

Package Advcalculate mulCalc.java:
```java
package Exp9.Advcalculate;

public class mulCalc {
    public int mul(int a, int b) {
        return a * b;
    }
}
```

**Output:**  
```
Addition: 11
Multiplication: 30
```
---

### 4. Create user defined package university create the department sub-packages in Java. creates class Staff inside department sub package within university package. using the keyword “import”, add the user-defined packages in Java.
**Aim:**   
To write a java program to create and use user defined sub package.

**File Structure:**     
```
exp9/
|── university/
|   ├── department/
|       └── Staff.java
├── Q3.java
```

**Code:**   

Main Program, Q4.java:
```java
package Exp9;

import Exp9.universtity.department.staff;

public class Q4 {
    public static void main(String[] args) {
        staff s = new staff("This Person Doesn't Exist");
        System.out.println("Staff name: " + s.getName());
    }
}
```  
Package university, sub-package department, Staff.java:
```java
package Exp9.universtity.department;

public class staff {
    private String name;

    public staff(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

**Output:**  
```
Staff name: This Person Doesn't Exist
```
---

## Result:
All the programs are executed and the output are verified.

---
---
