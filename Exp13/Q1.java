package Exp13;

public class Q1<T> {
    private T data;

    public Q1(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        // Creating an instance for Integer type
        Q1<Integer> intObj = new Q1<>(10);
        System.out.println("Integer data: " + intObj.getData());

        // Creating an instance for String type
        Q1<String> strObj = new Q1<>("Hello, Generics!");
        System.out.println("String data: " + strObj.getData());
    }
}
