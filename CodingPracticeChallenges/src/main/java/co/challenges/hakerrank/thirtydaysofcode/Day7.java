package co.challenges.hakerrank.thirtydaysofcode;
import java.util.Scanner;


public class Day7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        String response = "";
        for (int i = arr.length -1 ; i>=0 ; i--) {
        		response += arr[i] +" ";
        }
        System.out.println(response.trim());
    }
}
