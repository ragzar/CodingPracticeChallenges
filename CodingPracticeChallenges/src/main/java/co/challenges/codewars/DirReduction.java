package co.challenges.codewars;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
       if (arr.length == 1)
			return arr;

		LinkedList<String> linkedlist = new LinkedList<String>();
		Map<String, String> opposite = new HashMap<>();
		opposite.put("NORTH", "SOUTH");
		opposite.put("SOUTH", "NORTH");
		opposite.put("WEST", "EAST");
		opposite.put("EAST", "WEST");

		String last = "";
		
		for (int i = 0; i < arr.length; i++) {
			if (linkedlist.isEmpty()) {
				linkedlist.add(arr[i]);
				continue;
			}
			
			last = linkedlist.getLast();
			
			if (opposite.get(last).equalsIgnoreCase(arr[i])) {
				linkedlist.removeLast();
			}else {
				linkedlist.add(arr[i]);
			}
		}
		String response [] = new String[linkedlist.size()];
		return linkedlist.toArray(response);
    }
}