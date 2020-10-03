package br.com.ermig.brother_numbers;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberSearch {

	private NumberSearch() {}

	public static int getMaxBrother(final int number) {
		if (number > 0 && number < 100000000) {
			final String numStr = String.valueOf(number);
			final IntStream permutations = permutations(numStr).mapToInt(Integer::valueOf);
			return permutations.max().orElse(0);
		}
		return -1;
	}

	public static Stream<String> permutations(final String str) {
		if (str.isEmpty()) {
			return Stream.of("");
		}
		return IntStream.range(0, str.length()).boxed()
				.flatMap(i -> permutations(str.substring(0, i) + str.substring(i + 1))
						.map(t -> str.charAt(i) + t));
	}

}
