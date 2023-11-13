package Exp5_arrays;

public class Q3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int len = arr.length;
        int sum_actual = 0, sum_expected = 0;
        for (int i = 0; i < len; i++){
            sum_actual += arr[i];
        }
        for (int i = 1; i <= len+1; i++){
            sum_expected += i;
        }

        System.out.println("Missing number is " + (sum_expected - sum_actual));
    }
}
