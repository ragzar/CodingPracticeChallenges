package co.challenges.hakerrank.thirtydaysofcode;

import java.util.Arrays;

public class Day20 {

	public static int[] responseArray;

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// int[] a = new int[n];
		// for (int a_i = 0; a_i < n; a_i++) {
		// a[a_i] = in.nextInt();
		// }
		// in.close();

		
		int a[] = { 3, 2, 1 ,7,5,9};
		int n= a.length;
		System.out.println(Arrays.toString(a));

		System.out.println("Array is sorted in " + bubbleAlgorithm(a, n) + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n-1]);
//		System.out.println(Arrays.toString(a));

	}

	public static int bubbleAlgorithm(int a[], int n) {
		int totalSwaps = 0;
		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					swap(a, j);
					numberOfSwaps++;
				}
			}
			totalSwaps += numberOfSwaps;

			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}
		return totalSwaps;
	}

	public static void swap(int a[], int j) {
		int aux = a[j];
		a[j] = a[j + 1];
		a[j + 1] = aux;

	}
}
