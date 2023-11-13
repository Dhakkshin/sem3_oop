package Exp5_arrays;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.print(String.format("Enter element %d:", i + 1));
            arr[i] = input.nextInt();
        }

        int maxCount = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        System.out.println("The element that occurs most number of times is: " + maxValue);
        System.out.println("It occurs " + maxCount + " times.");
        input.close();
    }
}
