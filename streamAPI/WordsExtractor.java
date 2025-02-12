package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of sentences (Strings), use flatMap to create a list of all unique words in lowercase.
*/

public class WordsExtractor {
	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("Hello, My name is Yashwanth Babu","Learning java is fun",
				"Have a nice day");
		List<String> words = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.toLowerCase().split("\\W+")))
				.distinct().collect(Collectors.toList());
		System.out.println(words);
	}
}
