package co.challenges.hakerrank.crackingthecodinginterview;

class Tree {
	int data;
	Tree left;
	Tree right;
}

public class IsBinarySearchTree {
	boolean checkBST(Tree root) {

		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean checkBST(Tree root, int min, int max) {
		return ((root == null) || 
				(min < root.data && root.data < max 
				&& checkBST(root.left, min, root.data)
				&& checkBST(root.right, root.data, max)));
	}

}
