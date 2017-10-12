package co.challenges.hakerrank.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array2D {

	public static void main(String[] args) {

		// Scanner in = new Scanner(System.in);
		// int arr[][] = new int[6][6];
		// for (int i = 0; i < 6; i++) {
		// for (int j = 0; j < 6; j++) {
		// arr[i][j] = in.nextInt();
		// }
		// }
		// in.close();

		int arr[][] = 
			{ { 1, 1, 1, 0, 0, 0 }, 
		      { 0, 1, 0, 0, 0, 0 }, 
		      { 1, 1, 1, 0, 0, 0 }, 
		      { 0, 0, 2, 4, 4, 0 },
			  { 0, 0, 0, 2, 0, 0 }, 
			  { 0, 0, 1, 2, 4, 0 } };

		List<Integer> response = new ArrayList<>();

		for (int i = 0, x = 0, y = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = 0;
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						if (k == 1 && (l == 0 || l == 2))
							continue;
						else if (x + k < 6 && y + l < 6)
							sum += arr[x + k][y + l];
					}
				}
				response.add(sum);
				y++;
			}
			x++;
			y = 0;
		}

		System.out.println(Collections.max(response));


		bestSolution(arr);

	}

	public static void bestSolution(int arr[][]) {

		int maxval = -9 * 6;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
				sum += arr[i + 1][j + 1];
				sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				if (sum > maxval) {
					maxval = sum;
				}
			}
		}
		System.out.println(maxval);
	}
}
