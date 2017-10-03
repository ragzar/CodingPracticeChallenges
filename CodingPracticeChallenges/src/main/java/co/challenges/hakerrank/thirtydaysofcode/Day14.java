package co.challenges.hakerrank.thirtydaysofcode;

import java.util.Arrays;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		Integer max = Arrays.stream(elements).max().orElse(0);
		Integer min = Arrays.stream(elements).min().orElse(0);

		maximumDifference = max - min;

	}

	public void computeDifferenceBruteForce() {
		for (int i = 0; i < elements.length; i++) {
			if (i + 1 > elements.length)
				break;
			int left = elements[i];
			int[] subElements = Arrays.copyOfRange(elements, i + 1, elements.length);
			for (int right : subElements) {
				int difference = Math.abs(left - right);
				if (difference > maximumDifference) {
					maximumDifference = difference;
				}
			}
		}
	}

}

public class Day14 {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int[] a = new int[n];
		// for (int i = 0; i < n; i++) {
		// a[i] = sc.nextInt();
		// }
		// sc.close();
		int[] a = { 8, 19, 3, 2, 7 };

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
