import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find frequency of characters
    public static String[] findCharacterFrequency(String text) {

        // Convert string to character array
        char[] characters = text.toCharArray();
        int length = characters.length;

        // Array to store frequency
        int[] frequency = new int[length];

        // Step 1: Find frequency using nested loops
        for (int i = 0; i < length; i++) {

            // Skip already counted characters
            if (characters[i] == '0') {
                continue;
            }

            frequency[i] = 1; // initialize frequency

            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // mark duplicate
                }
            }
        }

        // Step 2: Count number of unique characters
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                count++;
            }
        }

        // Step 3: Store characters and their frequencies in 1D String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = input.nextLine();

        String[] frequencyResult = findCharacterFrequency(input);

        System.out.println("\nCharacter Frequency:");
       
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i]);
        }

        input.close();
    }
}
