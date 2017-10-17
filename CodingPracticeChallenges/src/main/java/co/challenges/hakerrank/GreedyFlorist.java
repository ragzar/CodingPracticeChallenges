package co.challenges.hakerrank;

import java.util.Scanner;


//https://www.hackerrank.com/challenges/greedy-florist?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
public class GreedyFlorist {

	static int getMinimumCost(int n, int k, int[] c) {
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] c = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		int minimumCost = getMinimumCost(n, k, c);
		System.out.println(minimumCost);
		in.close();
	}
}
