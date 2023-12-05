<div style="display: flex; justify-content: space-between;">
    <div style="text-align: left;"><h3>Experiment 11</h3></div>
    <div style="text-align: right;"><h3>Date: 21/11/2023</h3></div>
</div>
<div style="text-align: right;"><h3>Roll number: 22z215</h3></div>

<h1 style="text-align: center;">String Handling</h1>

### Program to implement the String handling functions
**Aim:**  
To write a java program to implement the String handling functions.

**Code:**
```java
package exp11;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // 1. String Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + str2;
        System.out.println("1. String Concatenation: " + result);

        // 2. String Concatenation with other data types
        int num = 42;
        String str = "The answer is " + num;
        System.out.println("2. String Concatenation with other data types: " + str);

        // 3. String Conversion and toString() method
        int value = 123;
        String strValue = Integer.toString(value);
        System.out.println("3. String Conversion and toString() method: " + strValue);

        // 4. Character Extraction
        // a. charAt()
        String text = "Hello";
        char firstChar = text.charAt(0);
        System.out.println("4a. charAt(): " + firstChar);

        // b. getChars()
        String source = "Hello";
        char[] target = new char[3];
        source.getChars(0, 3, target, 0);
        System.out.println("4b. getChars(): " + new String(target));

        // c. getBytes()
        String strBytes = "Hello";
        byte[] byteArray = strBytes.getBytes();
        System.out.println("4c. getBytes(): " + Arrays.toString(byteArray));

        // d. toCharArray()
        String strToCharArray = "Hello";
        char[] charArray = strToCharArray.toCharArray();
        System.out.println("4d. toCharArray(): " + Arrays.toString(charArray));

        // 5. String Comparison
        // a. equals() and equalsIgnoreCase()
        String compStr1 = "Hello";
        String compStr2 = "hello";
        System.out.println("5a. equals() and equalsIgnoreCase(): " + compStr1.equals(compStr2) + ", " + compStr1.equalsIgnoreCase(compStr2));

        // b. regionMatches()
        String regionStr1 = "Hello";
        String regionStr2 = "llo";
        System.out.println("5b. regionMatches(): " + regionStr1.regionMatches(2, regionStr2, 0, 3));

        // c. startsWith() and endsWith()
        String startsEndsStr = "Hello World";
        System.out.println("5c. startsWith() and endsWith(): " + startsEndsStr.startsWith("Hello") + ", " + startsEndsStr.endsWith("World"));

        // d. equals() and ==
        String eqStr1 = "Hello";
        String eqStr2 = new String("Hello");
        System.out.println("5d. equals() and ==: " + eqStr1.equals(eqStr2) + ", " + (eqStr1 == eqStr2));

        // e. compareTo()
        String compareStr1 = "Hello";
        String compareStr2 = "World";
        System.out.println("5e. compareTo(): " + compareStr1.compareTo(compareStr2));

        // 6. Searching Strings
        String searchString = "Hello World";
        System.out.println("6. Searching Strings: " + searchString.indexOf("World"));

        // 7. Modifying a string
        // a. substring()
        String origStr = "Hello World";
        String subStr = origStr.substring(6);
        System.out.println("7a. substring(): " + subStr);

        // b. concat()
        String concatStr = "Hello";
        concatStr = concatStr.concat(" World");
        System.out.println("7b. concat(): " + concatStr);

        // c. replace()
        String replaceStr = "Hello World";
        String newStr = replaceStr.replace('o', '0');
        System.out.println("7c. replace(): " + newStr);

        // d. trim()
        String trimStr = "   Hello   ";
        String trimmedStr = trimStr.trim();
        System.out.println("7d. trim(): " + trimmedStr);

        // 8. Data Conversion using valueOf()
        int intValue = 42;
        String strFromInt = String.valueOf(intValue);
        System.out.println("8. Data Conversion using valueOf(): " + strFromInt);

        // 9. Changing the case of characters within a string
        String caseStr = "Hello World";
        String upperCaseStr = caseStr.toUpperCase();
        String lowerCaseStr = caseStr.toLowerCase();
        System.out.println("9. Changing the case: " + upperCaseStr + ", " + lowerCaseStr);

        // 10. StringBuffer
        // a. StringBuffer Constructors
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        System.out.println("10a. StringBuffer Constructors: " + stringBuffer1 + ", " + stringBuffer2);

        // b. length() and capacity()
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("10b. length() and capacity(): " + buffer.length() + ", " + buffer.capacity());

        // c. ensureCapacity()
        StringBuffer ensureBuffer = new StringBuffer("Hello");
        ensureBuffer.ensureCapacity(20);
        System.out.println("10c. ensureCapacity(): " + ensureBuffer.capacity());

        // d. setLength()
        StringBuffer lengthBuffer = new StringBuffer("Hello");
        lengthBuffer.setLength(3);
        System.out.println("10d. setLength(): " + lengthBuffer);

        // e. charAt() and setCharAt()
        StringBuffer charBuffer = new StringBuffer("Hello");
        char charAtIndex = charBuffer.charAt(1);
        charBuffer.setCharAt(1, 'a');
        System.out.println("10e. charAt() and setCharAt(): " + charAtIndex + ", " + charBuffer);

        // f. getChars()
        StringBuffer getCharsBuffer = new StringBuffer("Hello");
        char[] getCharsArray = new char[3];
        getCharsBuffer.getChars(0, 3, getCharsArray, 0);
        System.out.println("10f. getChars(): " + new String(getCharsArray));

        // g. append()
        StringBuffer appendBuffer = new StringBuffer("Hello");
        appendBuffer.append(" World");
        System.out.println("10g. append(): " + appendBuffer);

        // h. insert()
        StringBuffer insertBuffer = new StringBuffer("Hello");
        insertBuffer.insert(2, "123");
        System.out.println("10h. insert(): " + insertBuffer);

        // i. reverse()
        StringBuffer reverseBuffer = new StringBuffer("Hello");
        reverseBuffer.reverse();
        System.out.println("10i. reverse(): " + reverseBuffer);

        // j. delete() and deleteCharAt()
        StringBuffer deleteBuffer = new StringBuffer("Hello");
        deleteBuffer.delete(1, 3);
        deleteBuffer.deleteCharAt(2);
        System.out.println("10j. delete() and deleteCharAt(): " + deleteBuffer);

        // k. replace()
        StringBuffer replaceBuffer = new StringBuffer("Hello");
        replaceBuffer.replace(1, 3, "123");
        System.out.println("10k. replace(): " + replaceBuffer);

        // l. substring()
        StringBuffer substringBuffer = new StringBuffer("Hello World");
        StringBuffer subBuffer = new StringBuffer(substringBuffer.substring(6));
        System.out.println("10l. substring(): " + subBuffer);
    }
}
```

**Output:**
```
1. String Concatenation: HelloWorld
2. String Concatenation with other data types: The answer is 42
3. String Conversion and toString() method: 123
4a. charAt(): H
4b. getChars(): Hel
4c. getBytes(): [72, 101, 108, 108, 111]
4d. toCharArray(): [H, e, l, l, o]
5a. equals() and equalsIgnoreCase(): false, true
5b. regionMatches(): true
5c. startsWith() and endsWith(): true, true
5d. equals() and ==: true, false
5e. compareTo(): -15
6. Searching Strings: 6
7a. substring(): World
7b. concat(): Hello World
7c. replace(): Hell0 W0rld
7d. trim(): Hello
8. Data Conversion using valueOf(): 42
9. Changing the case: HELLO WORLD, hello world
10a. StringBuffer Constructors: , Hello
10b. length() and capacity(): 5, 21
10c. ensureCapacity(): 21
10d. setLength(): Hel
10e. charAt() and setCharAt(): e, Hallo
10f. getChars(): Hel
10g. append(): Hello World
10h. insert(): He123llo
10i. reverse(): olleH
10j. delete() and deleteCharAt(): Hl
10k. replace(): H123lo
10l. substring(): World
```

---

## Result:
All the programs are executed and the output are verified.

---
---
