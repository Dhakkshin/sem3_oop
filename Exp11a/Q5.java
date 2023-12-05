package Exp11a;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split("\\s+");
        int numberOfWords = words.length;

        System.out.println("Number of words: " + numberOfWords);

        scanner.close();
    }    
}
