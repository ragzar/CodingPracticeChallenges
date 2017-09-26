package co.challenges.hakerrank.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// INPUT
//3
//sam 99912222
//tom 11122222
//harry 12299933
//sam
//edward
//harry

class Day8 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> directory = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			directory.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			if (directory.containsKey(s))
				System.out.println(s + "=" + directory.get(s));
			else
				System.out.println("Not found");
		}
		in.close();
	}
}
