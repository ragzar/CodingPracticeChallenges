package co.interviews.codility.bizagi;
// you can also use imports, for example:

class Problem1 {

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int result = 0;
		for (int i = 0 ; i< A.length ; i++) {
			int count = 0;
			int distance = -1100;

			for (int j = i+1 ; j < A.length+1; j++) {
				if (distance == -1100 && j<A.length)  {
					distance = A[i]-A[j];
				}

				if (count >= 2) {
					result ++;
				}if ( j<A.length && distance == A[j-1]-A[j]) {
					count++;
				}else {
					break;
				}
			}
		}
		return result;
	}
	
	public static void main (String args []) {
		int i[] = {-1, 1, 3, 3, 3, 2, 1, 0}; 
		System.out.println(solution(i));
	}

}