package co.challenges.hakerrank.thirtydaysofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegExPatterns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> people = new ArrayList<>();
		while (n-- > 0) {
			String name = sc.next();
			String email = sc.next();
			if (email.endsWith("@gmail.com"))
				people.add(name);
		}
		people.stream()
			.sorted()
			.forEach(System.out::println);
		sc.close();
	}
}