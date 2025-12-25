//create a class LongestWordInSetence to return the longest word in the sentence

import java.util.Scanner;

public class LongestWordInSentence {
    public static void main(String[] args) {

        //take input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}
