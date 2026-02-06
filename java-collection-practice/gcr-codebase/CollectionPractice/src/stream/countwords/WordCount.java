package stream.countwords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordCountTopFive {

    public static void main(String[] args) {

        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 1: Read file
        try (
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt")
            )
        ) {
            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase and split words
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (word.isEmpty()) continue;

                    // Count word frequency
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading file.");
            return;
        }

        // Step 2: Sort words by frequency
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(wordCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a,
                               Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue(); // descending order
            }
        });

        // Step 3: Print top 5 words
        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println(
                list.get(i).getKey() + " : " + list.get(i).getValue()
            );
        }
    }
}
