package co.challenges.hakerrank.thirtydaysofcode;

import java.util.Scanner;

class Node22 {
	Node22 left, right;
	int data;

	Node22(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinarySearchTrees {

	public static Node22 insert(Node22 root, int data) {
		if (root == null) {
			return new Node22(data);
		} else {
			Node22 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static int getHeight(Node22 root) {
		
		if (root == null) {
	        return -1;
	    }

	    int leftSize = getHeight(root.left);
	    int rightSize = getHeight(root.right);

	    if (leftSize > rightSize) {
	        return leftSize + 1;
	    } else {
	        return rightSize + 1;
	    }
	    
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node22 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		int height = getHeight(root);
		System.out.println(height);
	}
}