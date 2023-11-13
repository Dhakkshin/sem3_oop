package Exp5_arrays;

public class Q2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int len = arr.length, max = arr[0], min = arr[0];
        for (int i = 0; i < len; i++){
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }  
        int sum = min + max;
        System.out.println(sum); 
    }
}