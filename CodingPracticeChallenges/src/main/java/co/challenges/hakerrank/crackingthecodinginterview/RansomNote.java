package co.challenges.hakerrank.crackingthecodinginterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RansomNote {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int m = in.nextInt();
		// int n = in.nextInt();
		// String magazine[] = new String[m];
		// for (int magazine_i = 0; magazine_i < m; magazine_i++) {
		// magazine[magazine_i] = in.next();
		// }
		// String ransom[] = new String[n];
		// for (int ransom_i = 0; ransom_i < n; ransom_i++) {
		// ransom[ransom_i] = in.next();
		// }
		// in.close();
		// if (m < n)
		// System.out.println("No");

		// else
		String ransom[] = { "two", "times", "two", "is", "four" };
		String magazine[] = { "two", "times", "three", "is", "not", "four" };

		String ransom2[] = { "give", "one", "grand", "today" };
		String magazine2[] = { "give", "me", "one", "grand", "today", "night" };

		System.out.println(findWords(magazine, ransom));
		System.out.println(findWords(magazine2, ransom2));
		System.out.println(findWords2(magazine2, ransom2));

	}

	private static String findWords(String[] magazine, String[] ransom) {

		List<String> magazineList = Arrays.stream(magazine).collect(Collectors.toList());
		boolean match = Arrays.stream(ransom).allMatch(word -> magazineList.remove(word));

		if (match)
			return "Yes";
		return "No";
	}

	private static String findWords2(String[] magazine, String[] ransom) {

		List<String> magazineList = Arrays.stream(magazine).collect(Collectors.toList());
		for (String ramsonWord : ransom) {
			if (magazineList.contains(ramsonWord))
				magazineList.remove(ramsonWord);
			else
				return "No";
		}
		return "Yes";
	}
}
