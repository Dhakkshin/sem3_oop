package Exp11a;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = areAnagrams(str1, str2);
        System.out.println(str1 + " " + str2 + " are Anagrams: " + areAnagrams);
    }

    private static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
