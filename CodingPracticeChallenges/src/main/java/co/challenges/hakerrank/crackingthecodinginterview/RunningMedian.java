package co.challenges.hakerrank.crackingthecodinginterview;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class RunningMedian {

	public static void main(String[] args) {

		Queue<Integer> lowestHigh = new PriorityQueue<>();
		Queue<Integer> highestLow = new PriorityQueue<>(Comparator.reverseOrder());

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int a_i = 0; a_i < n; a_i++) {
			if (lowestHigh.size() <= highestLow.size()) {
				highestLow.add(in.nextInt());
				lowestHigh.add(highestLow.poll());
			} else {
				lowestHigh.add(in.nextInt());
				highestLow.add(lowestHigh.poll());
			}

			System.out.println(a_i % 2 == 0 ? (float) lowestHigh.peek() : (float) (lowestHigh.peek() + highestLow.peek()) / 2);
		}
		in.close();
	}

}
