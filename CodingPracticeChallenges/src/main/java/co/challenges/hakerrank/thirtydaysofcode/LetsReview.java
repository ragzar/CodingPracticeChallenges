package co.challenges.hakerrank.thirtydaysofcode;
import java.util.Scanner;

public class LetsReview {

    public static void main(String[] args) {
       	Scanner in = new Scanner(System.in);
		int numberString = in.nextInt();
		
		
		for (int i =0 ; i < numberString ; i++) {
			String fullString = in.next();
			System.out.println(separateString(fullString));
		}
		in.close();
		
	}
	
	public static String separateString(String s) {
		char charString[] = s.toCharArray();
		String oddString = "";
		String evenString = "";
		for (int i = 0; i < charString.length ; i++) {
			if (i%2==0)
				evenString += charString[i];
			else
				oddString += charString[i];
		}
		return evenString + " " + oddString;
	}
}