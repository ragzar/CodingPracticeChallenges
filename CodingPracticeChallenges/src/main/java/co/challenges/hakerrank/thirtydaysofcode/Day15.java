package co.challenges.hakerrank.thirtydaysofcode;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class Day15 {

	public static Node insert(Node head, int data) {
		Node newElement = new Node(data);
		
		if (head == null)
			return newElement;
		
		if (head.next == null)
			head.next = newElement;
		else 
			insert (head.next, data);
		return head ;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
//		int N = sc.nextInt();

//		while (N-- > 0) {
//			int ele = sc.nextInt();
//			head = insert(head, ele);
//		}
		int array [] = {2 ,3, 4, 1};
		for (int i : array) {
			head = insert(head, i);
		}
		
		
		display(head);
		sc.close();
	}
}