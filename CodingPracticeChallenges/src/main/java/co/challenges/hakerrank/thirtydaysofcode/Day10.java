package co.challenges.hakerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int decimalNumber = scan.nextInt();
		int count = 0;
		int result = 0;
		String binaryNumber = Integer.toBinaryString(decimalNumber);
		for (Character bit : binaryNumber.toCharArray()) {
			if (bit.equals('1'))
				++count;
			if (count > result) {
				result = count;
			}
			if (bit.equals('0'))
				count = 0;
		}

		
		System.out.println(result);
		scan.close();
	}
}