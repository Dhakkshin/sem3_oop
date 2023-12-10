package Exp14;

interface StringConcatenator {
    String concatenate(String s1, String s2);
}

public class Q3 {
    public static void main(String[] args) {
        StringConcatenator concat = (s1, s2) -> s1 + s2;

        String result = concat.concatenate("Hello, ", "World!");
        System.out.println("Concatenated String: " + result);
    }
}
