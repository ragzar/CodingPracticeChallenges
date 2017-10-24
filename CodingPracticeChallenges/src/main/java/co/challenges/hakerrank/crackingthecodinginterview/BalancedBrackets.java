package co.challenges.hakerrank.crackingthecodinginterview;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedBrackets {

	public static boolean isBalanced(String expression) {
		final char squareBracket = '[';
		final char bracket = '{';
		final char parentesis = '(';

		ArrayDeque<Character> stack = new ArrayDeque<>();

		for (Character c : expression.toCharArray()) {
			switch (c) {
			case ')':
				if (stack.isEmpty() || parentesis != stack.pop())
					return false;
				break;
			case '}':
				if (stack.isEmpty() || bracket != stack.pop())
					return false;
				break;
			case ']':
				if (stack.isEmpty() || squareBracket != stack.pop())
					return false;
				break;
			default:
				stack.push(c);
				break;
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
		in.close();
	}
}
