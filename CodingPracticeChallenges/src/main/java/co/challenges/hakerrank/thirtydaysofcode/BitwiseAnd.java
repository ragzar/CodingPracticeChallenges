package co.challenges.hakerrank.thirtydaysofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitwiseAnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n-- > 0) {
			int s = sc.nextInt();
			int k = sc.nextInt();
			int j = 1;
			List<Integer> result = new ArrayList<>();
			for (int i = 1; j < s-1;) {
				
				if (++i > s) {
					j++;
					i = j + 1;
				}
				result.add((j & i));
			}
			int max = result.stream()
					.filter(value -> value < k)
					.max(Integer::compare)
					.orElse(0);
			System.out.println(max);
		}
		sc.close();

	}
}