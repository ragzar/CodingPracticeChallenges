package co.hakerrank.challenges.crackingthecodinginterview;

import java.util.Arrays;
import java.util.Scanner;

public class MakingAnagrams {

	public static int numberNeeded(String first, String second) {
		char charA[] = first.toCharArray();
		char charB[] = second.toCharArray();
		Arrays.sort(charA);
		Arrays.sort(charB);
		int i = 0, j = 0, count = 0;

		while (i < charA.length && j < charB.length) {
			if (charA[i] == charB[j]) {
				i++;
				j++;
			} else if (charA[i] > charB[j]) {
				count++;
				j++;
			} else if (charA[i] < charB[j]) {
				i++;
				count++;
			}
		}
		count += (charA.length - i) + (charB.length - j);
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		in.close();
		System.out.println(numberNeeded(a, b));
	}
}
