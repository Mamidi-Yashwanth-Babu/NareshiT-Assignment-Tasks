package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape", "orange", "pear", "peach");

        // Sort by length first, then lexicographically
        List<String> sortedWords = words.stream()
                                        .sorted(Comparator.comparingInt(String::length)
                                                          .thenComparing(String::compareTo))
                                        .collect(Collectors.toList());

        // Print the sorted list
        System.out.println("Sorted Words: " + sortedWords);
    }
}
