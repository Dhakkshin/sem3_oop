package Exp10;

public class Q2 {
    public static void main(String[] args) {
        try {
            mainMethod();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in mainMethod: " + e.getMessage());
        } finally {
            System.out.println("Finally block in main");
        }
    }

    static void mainMethod() {
        try {
            p();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in mainMethod: " + e.getMessage());
        } finally {
            System.out.println("Finally block in mainMethod");
        }
    }

    static void p() {
        try {
            q();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in p: " + e.getMessage());
        } finally {
            System.out.println("Finally block in p");
        }
    }

    static void q() {
        try {
            r();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in q: " + e.getMessage());    
            throw e; // Re-throwing the exception
        } finally {
            System.out.println("Finally block in q");
        }
    }

    static void r() {
        try {
            s();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in r: " + e.getMessage());
            throw e; // Re-throwing the exception
        } finally {
            System.out.println("Finally block in r");
        }
    }

    static void s() {
        try {
            int[] array = new int[6];
            array[10] = 42; // This will generate ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in s: " + e.getMessage());
            throw e; // Re-throwing the exception
        } finally {
            System.out.println("Finally block in s");
        }
    }
}