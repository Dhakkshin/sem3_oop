package Exp5_arrays;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("Element %d: ", i + 1));
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the position where you want to insert element: ");
        int pos = input.nextInt();
        System.out.print("Enter the element you want to insert: ");
        int elem = input.nextInt();

        int[] newArr = new int[n + 1];
        System.out.print("After inserting: ");
        for (int i = 0, j = 0; i < n + 1; i++, j++) {
            if (i == pos - 1) {
                newArr[i] = elem;
                j--;
            } else {
                newArr[i] = arr[j];
            }
             System.out.print(newArr[i] + " ");
        }
        input.close();
    }
}
