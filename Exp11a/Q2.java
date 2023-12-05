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
