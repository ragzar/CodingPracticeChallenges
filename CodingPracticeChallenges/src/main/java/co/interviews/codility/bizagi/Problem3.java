package co.interviews.codility.bizagi;

public class Problem3 {

	public static final int MAX_VALUE = 100000000;

	public static int solution(int A, int B) {

		String aString = ("" + A);
		String bString = ("" + B);
		char first[] = aString.toCharArray();
		char second[] = bString.toCharArray();
		int length = first.length + second.length;
		String result = "";

		for (int i = 0; i < length; i++) {
			if (second.length == i + 1) {
				result += "" + first[i] + second[i] + aString.substring(i + 1);
				break;
			} else if (first.length == i + 1) {
				result += "" + first[i] + bString.substring(i);
				break;
			} else {
				result += "" + first[i] + second[i];
			}
		}
		int answer = 0;
		try {
			answer = Integer.parseInt(result);
			if (answer >= MAX_VALUE)
				return -1;
			else
				return answer;
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static void main(String args[]) {
		int a = 123;
		int b = 67890;
		System.out.println(solution(b, a));
	}
}