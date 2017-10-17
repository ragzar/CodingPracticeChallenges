package co.challenges.hakerrank.thirtydaysofcode;

import java.util.Scanner;

public class RunningTimeComplexity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n-- > 0) {
			int element = sc.nextInt();
			if (element == 1 ) {
				System.out.println("Not prime");
				continue;	
			}
			boolean isPrime = true;
			for (int i = 3; i*i <= element; i++){
			    if (element % i == 0){
			    		isPrime = false;
			    		break;
			    }
			}
			
			if (!isPrime)
				System.out.println("Not prime");
			else
				System.out.println("Prime");

		}
		sc.close();
	}
}