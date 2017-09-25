package co.hakerrank.challenges;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LonelyInteger {

    static int lonelyinteger(int[] a) {
        if (a.length == 1)
			return a[0];
		
		Map<Integer,Integer> map = new HashMap<>();
		Set<Integer> set = new  LinkedHashSet<>();
		for (int i : a) {
			set.add(i);
			
			int aux =  map.get(i) != null ?  map.get(i) : -1 ;
			
			if (aux == -1) {
				map.put(i, aux = 1);
				continue;
			}else
				map.put(i, ++aux);
			
			if (aux > 1) 
				set.remove(i);
		}
		
		return  set.iterator().next();
    }

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        in.close();
        
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
