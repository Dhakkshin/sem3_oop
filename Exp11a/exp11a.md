<div style="display: flex; justify-content: space-between;">
    <div style="text-align: left;"><h3>Experiment 11a</h3></div>
    <div style="text-align: right;"><h3>Date: 28/11/2023</h3></div>
</div>
<div style="text-align: right;"><h3>Roll number: 22z215</h3></div>

<h1 style="text-align: center;">String Handling</h1>

### 1. Write a java program to convert an array to string 
**Aim:**  
To write a java program to convert an array to string.

**Code:**
```java
package Exp11a;

public class Q1 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String arrayAsString = new String(array);
        System.out.println("Array as String: " + arrayAsString);
    }
}
```

**Output:**
```
Array as String: abcdefgh
```

---

### 2. To Print duplicate characters from the string.    
**Aim:**  
To write a java program to print duplicate characters from the string.

**Code:**
```java
package Exp11a;

import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
        String inputString = "programming";
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for (char ch : inputString.toCharArray()) {
            if (!uniqueChars.add(ch)) {
                duplicateChars.add(ch);
            }
        }

        System.out.println("Duplicate characters: " + duplicateChars);
    }
}
```

**Output:**
```
Duplicate characters: [r, g, m]
```
---

### 3. To check if two strings are anagrams of each other    
**Aim:**  
To write a java program to check if two strings are anagrams of each other.

**Code:**
```java
package Exp11a;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = areAnagrams(str1, str2);
        System.out.println("Are Anagrams: " + areAnagrams);
    }

    private static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
```

**Output:**
```
listen silent are Anagrams: true
```
--- 

### 4. To convert string to integer    
**Aim:**  
To write a java program to convert string to integer.

**Code:**
```java
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
```

**Output:**
```
Enter a number: 1234
Number: 1234
```
--- 

### 5. To count the number of words in a given string sentence  
**Aim:**  
To write a java program to count the number of words in a given string sentence.

**Code:**
```java
package Exp11a;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split("\\s+");
        int numberOfWords = words.length;

        System.out.println("Number of words: " + numberOfWords);

        scanner.close();
    }    
}
```

**Output:**
```
Enter a sentence: hello this is a test sentence to reorder
Number of words: 8
```
--- 

### 6. Write a program to get input as a string from user and arrange each word in Alphabetical Order. 
**Aim:**  
To write a java program to get input as a string from user and arrange each word in Alphabetical Order.

**Code:**

```java
package Exp11a;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split("\\s+");
        Arrays.sort(words);

        String resultSentence = String.join(" ", words);
        System.out.println("Result: " + resultSentence);

        scanner.close();
    }
}
```

**Output:**
```
Enter a sentence:  hello this is a test sentence to reorder
Result:  a hello is reorder sentence test this to
```
--- 

## Result:
All the programs are executed and the output are verified.

---
---
