<div style="display: flex; justify-content: space-between;">
    <div style="text-align: left;"><h3>Experiment 5</h3></div>
    <div style="text-align: right;"><h3>Date: 12/09/2023</h3></div>
</div>
<div style="text-align: right;"><h3>Roll number: 22z215</h3></div>

<h1 style="text-align: center;">Java Programs III - Arrays</h1>

### 1. Java Program to find the sum of all the elements in an array
**Aim:**  
To write a java program to find the sum of all the elements in an array.

**Code:**
```java
package Exp5_arrays;

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++){
            sum += arr[i];
        }   
        System.out.println(sum);
    }
}
```

**Output:**
```
55
```
---

### 2. Display the sum of maximum and minimum values in the given array.
**Aim:**  
To write a java program to display the sum of maximum and minimum values in the given array.

**Code:**
```java
package Exp5_arrays;

public class Q2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int len = arr.length, max = arr[0], min = arr[0];
        for (int i = 0; i < len; i++){
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }  
        int sum = min + max;
        System.out.println(sum); 
    }
}
```

**Output:**  
```
11
```
---
### 3. Find the missing element in the range from 1 to N+1 without sorting the array.
**Aim:**   
To write a java program to find the missing element in the range from 1 to N+1 without sorting the array.

**Code:**
```java
package Exp5_arrays;

public class Q3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int len = arr.length;
        int sum_actual = 0, sum_expected = 0;
        for (int i = 0; i < len; i++){
            sum_actual += arr[i];
        }
        for (int i = 1; i <= len+1; i++){
            sum_expected += i;
        }

        System.out.println("Missing number is " + (sum_expected - sum_actual));
    }
}
```

**Output:**
```
Enter a number: 4
The factorial of 4 is 24.
```
---

### 4. Find the majority element from the given array.
**Aim:**   
To write a java program to find the majority element from the given array.

**Code:**
```java
package Exp5_arrays;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.print(String.format("Enter element %d:", i + 1));
            arr[i] = input.nextInt();
        }

        int maxCount = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        System.out.println("The element that occurs most number of times is: " + maxValue);
        System.out.println("It occurs " + maxCount + " times.");
        input.close();
    }
}
```

**Output:**
```
Enter the size of the array: 10
Enter element 1:4
Enter element 2:6
Enter element 3:3
Enter element 4:5
Enter element 5:6
Enter element 6:4
Enter element 7:3
Enter element 8:5
Enter element 9:6
Enter element 10:7
The element that occurs most number of times is: 6
It occurs 3 times.
```
---
### 5. Write a java program to Insert an element in the array.
**Aim:**   
To write a java program to Insert an element in the array.

**Code:**
```java
package Exp5_arrays;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("Element %d: ", i + 1));
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the position where you want to insert element: ");
        int pos = input.nextInt();
        System.out.print("Enter the element you want to insert: ");
        int elem = input.nextInt();

        int[] newArr = new int[n + 1];
        System.out.print("After inserting: ");
        for (int i = 0, j = 0; i < n + 1; i++, j++) {
            if (i == pos - 1) {
                newArr[i] = elem;
                j--;
            } else {
                newArr[i] = arr[j];
            }
             System.out.print(newArr[i] + " ");
        }
        input.close();
    }
}
```

**Output:**
```
Enter number of elements of the array: 5 
Element 1: 1
Element 2: 2
Element 3: 3
Element 4: 4
Element 5: 5
Enter the position where you want to insert element: 2
Enter the element you want to insert: 6
After inserting: 1 6 2 3 4 5
```
---
### 6. Write a java program to print the sum of two matrices.
**Aim:**   
To write a java program to print the sum of two matrices.

**Code:**
```java
package Exp5_arrays;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrices: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns of the matrices: ");
        int cols = input.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Next element: ");
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Next element: ");
                matrix2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(String.format("%d ", sum[i][j]));
            }
            System.out.println();
        }
        input.close();
    }
}
```

**Output:**
```
Enter the number of rows of the matrices: 2
Enter the number of columns of the matrices: 3
Enter the elements of the first matrix:
Next element: 1
Next element: 2
Next element: 3
Next element: 1
Next element: 3
Next element: 4
Enter the elements of the second matrix:
Next element: 1
Next element: 2
Next element: 4
Next element: 2
Next element: 3
Next element: 2
2 4 7
3 6 6
```

---



## Result:
All the programs are executed and the output are verified.

---
---
