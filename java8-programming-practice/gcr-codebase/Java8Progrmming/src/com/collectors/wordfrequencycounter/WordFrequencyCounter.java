package com.collectors.wordfrequencycounter;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {

        String paragraph = "Java is powerful and Java is popular and powerful";

        Map<String, Integer> wordCount = Arrays.stream(paragraph.split("\\s+"))

                // convert to lowercase for uniform counting
                .map(String::toLowerCase)

                // collect into map
                .collect(Collectors.toMap(
                        word -> word,      // key
                        word -> 1,         // initial value
                        Integer::sum       // merge if duplicate
                ));

        wordCount.forEach((word, count) ->
                System.out.println(word + " : " + count));
    }

}
