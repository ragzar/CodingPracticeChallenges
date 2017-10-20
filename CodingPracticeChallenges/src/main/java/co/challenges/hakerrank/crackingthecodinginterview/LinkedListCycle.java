package co.challenges.hakerrank.crackingthecodinginterview;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class LinkedListCycle {

	public static void main(String args[]) {
		Node cycleNode = new Node(500);
		Node head = new Node(0);
		Node current = head;
		int i = 1;
		while (i < 10) {
			current.next = new Node(i);
			if (i++ == 5)
				current.next = cycleNode;
			current = current.next;
		}
		// current.next = cycleNode;
		System.out.println(hasCycle(head));
	}

	public static boolean hasCycle(Node head) {
		if (head == null)
			return false;
		int count = 0;
		while (head.next != null) {
			System.out.println(head.data);
			head = head.next;

			if (count++ > 100)
				return true;
		}
		return false;
	}

}
