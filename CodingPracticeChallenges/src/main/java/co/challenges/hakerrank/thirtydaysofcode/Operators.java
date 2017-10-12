package co.challenges.hakerrank.thirtydaysofcode;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
	        double result = mealCost +  mealCost * tipPercent / 100  + mealCost * taxPercent/100 ;
	        
	      
	        int totalCost = (int) Math.round(result);
	      
	        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}