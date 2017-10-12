package co.challenges.hakerrank.thirtydaysofcode;

import java.util.Scanner;

class Node15 {
	int data;
	Node15 next;

	Node15(int d) {
		data = d;
		next = null;
	}
}

public class LinkedList {

	public static Node15 insert(Node15 head, int data) {
		Node15 newElement = new Node15(data);
		
		if (head == null)
			return newElement;
		
		if (head.next == null)
			head.next = newElement;
		else 
			insert (head.next, data);
		return head ;
	}

	public static void display(Node15 head) {
		Node15 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node15 head = null;
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