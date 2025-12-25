import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequency and return as 2D array
    public static Object[][] findCharacterFrequency(String text) {

        // Step 1: Frequency array for all ASCII characters
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark as counted
            }
        }

        // Step 3: Create 2D array for characters and frequencies
        Object[][] result = new Object[count][2];

        // Reset frequency array
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = ch;
                result[index][1] = freq[ch];
                index++;
                freq[ch] = 0; // avoid duplicate entry
            }
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = input.nextLine();

        Object[][] frequencyResult = findCharacterFrequency(input);

        System.out.println("\nCharacter\tFrequency");
      
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(
                    frequencyResult[i][0] + "\t\t" +
                    frequencyResult[i][1]
            );
        }

        input.close();
    }
}
