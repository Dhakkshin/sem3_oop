package Exp14;

import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Apple", "Orange", "Banana", "Grapes");

        stringList.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted List: " + stringList);
    }
}
