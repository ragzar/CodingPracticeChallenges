package co.hakerrank.challenges.crackingthecodinginterview ;

import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		in.close();

		int pos = k % n;
		a = leftCycle(a, pos);

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int[] leftCycle(int[] a, int pos) {
		int b[] = new int[a.length];
		int j = pos;
		int i = 0;
		for (; j < a.length; j++) {

			b[i++] = a[j];
		}
		for (int k = 0; k < pos; k++) {
			b[i++] = a[k];
		}
		return b;
	}
}
