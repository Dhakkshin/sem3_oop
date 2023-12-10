package Exp13;

public class Q3 {
    public static <T, U> void display(T item1, U item2) {
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }

    public static void main(String[] args) {
        // Calling generic method with different types of arguments
        display(10, "Hello");
        display(3.14, true);
    }
}
