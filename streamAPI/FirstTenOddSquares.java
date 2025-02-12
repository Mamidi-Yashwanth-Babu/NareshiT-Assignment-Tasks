package streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Use Stream.iterate or Stream.generate to create an infinite stream. 
 *Then filter and map the data to produce the first 10 odd squares.*/

public class FirstTenOddSquares {
	public static void main(String[] args) {
		List<Integer> oddNumSquares = Stream.iterate(1, n -> n+2).map(n -> n*n).limit(10)
							.collect(Collectors.toList());
		System.out.println(oddNumSquares);
		
	}
}
