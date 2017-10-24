package co.challenges.hakerrank.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyQueue<T> {

	private List<T> queue = new ArrayList<>();

	public void enqueue(T t) {
		queue.add(t);
	}

	public void dequeue() {
		if (!queue.isEmpty()) {
			queue.remove(0);
		}

	}

	public T peek() {
		if (!queue.isEmpty())
			return queue.get(0);
		else
			return null;
	}

}

public class TaleOfTwoStacks {
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}
