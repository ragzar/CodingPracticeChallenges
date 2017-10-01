package co.challenges.codility;
// you can also use imports, for example:

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MinorInteger {
	public int solution(int[] A) {
		
		List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
		Set<Integer> uniqueList = new HashSet<>(list);

		int solution = 1;
		while (uniqueList.contains(solution)) {
			solution++;
		}

		return solution++;

	}
}