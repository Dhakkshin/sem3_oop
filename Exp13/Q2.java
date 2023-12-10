package Exp13;

public class Q2<K, V> {
    private K key;
    private V value;

    public Q2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Creating an instance with Integer and String parameters
        Q2<Integer, String> pair = new Q2<>(1, "One");
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}

