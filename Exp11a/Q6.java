package Exp11a;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split("\\s+");
        Arrays.sort(words);

        String resultSentence = String.join(" ", words);
        System.out.println("Result: " + resultSentence);

        scanner.close();
    }
}
