package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Write a program to process a list of strings. 
 *Use a custom predicate to filter strings that start with a vowel and have a length greater than 5.*/

public class VowelStringsFilter {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple", "Orange", "Banana", "Mango", "Kiwi","Guava");
		List<String> collect = words.stream().filter(word -> word.length()>5 && word.matches("(?i)^[AEIOU].*"))
											.collect(Collectors.toList());
		System.out.println(collect);
	}
}
