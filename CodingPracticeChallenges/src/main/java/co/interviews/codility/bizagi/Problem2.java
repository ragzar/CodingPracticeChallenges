package co.interviews.codility.bizagi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Problem2 {
	public static int solution(int[] A) {

		int max = 0;
		for (int i = 0; i < A.length; i++) {
			int[] right = Arrays.copyOfRange(A, 0, i + 1);
			int[] left = Arrays.copyOfRange(A, i + 1, A.length);

			if (left.length == 0)
				break;

			Integer maxLeft = IntStream.of(left).boxed().reduce(Integer::max).orElse(0);
			Integer maxRight = IntStream.of(right).boxed().reduce(Integer::max).orElse(0);

			if (max < maxRight - maxLeft)
				max = maxRight - maxLeft;
		}
		return max;
	}

	public static int solutionBruteForce(int[] A) {
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			int[] left = Arrays.copyOfRange(A, 0, i + 1);
			int[] right = Arrays.copyOfRange(A, i + 1, A.length);

			List<Integer> rightList = IntStream.of(right).boxed().collect(Collectors.toList());
			List<Integer> leftList = IntStream.of(left).boxed().collect(Collectors.toList());
			if (rightList.isEmpty())
				break;

			Collections.sort(rightList);
			Collections.sort(leftList);

			int maxRight = rightList.get(rightList.size() - 1);
			int maxLeft = leftList.get(leftList.size() - 1);

			if (max < maxLeft - maxRight)
				max = maxLeft - maxRight;

		}
		return max;
	}

	public static void main(String args[]) {
		int i[] = { 1, 3, -3 };
		System.out.println(solution(i));
	}
}