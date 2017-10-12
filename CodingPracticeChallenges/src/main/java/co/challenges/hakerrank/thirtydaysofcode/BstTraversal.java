package co.challenges.hakerrank.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BstTraversal {
static void levelOrder(Node23 root) {
		
		Queue<Node23> treeQueue = new LinkedList<>();
		treeQueue.add(root);
    
        while(!treeQueue.isEmpty()){
            Node23 aux = treeQueue.remove();
            System.out.print(aux.data+" ");
            if (aux.left!=null) 
                treeQueue.add(aux.left);
            if (aux.right!=null) 
                treeQueue.add(aux.right);
        }
		
	}


	public static Node23 insert(Node23 root, int data) {
		if (root == null) {
			return new Node23(data);
		} else {
			Node23 cur;
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

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node23 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		levelOrder(root);
	}
}

class Node23 {
	Node23 left, right;
	int data;

	Node23(int data) {
		this.data = data;
		left = right = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}