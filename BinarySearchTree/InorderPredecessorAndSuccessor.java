package BinarySearchTree;

public class InorderPredecessorAndSuccessor {
	public static void inorderPredAndSucc(TreeNode root, TreeNode[] prev, int key) {
		if(root == null) return;
		inorderPredAndSucc(root.left, prev, key);
		if(root.val == key) {
			if(prev[0] != null) System.out.println(prev[0].val);
		}
		if(prev[0]!=null && key==prev[0].val) {
			System.out.println(root.val);
		}
		prev[0] = root;
		inorderPredAndSucc(root.right, prev, key);
	}

	public static void main(String[] args) {
		TreeNode a = new TreeNode(50); // root node
		TreeNode b = new TreeNode(30);
		TreeNode c = new TreeNode(70);
		TreeNode d = new TreeNode(20);
		TreeNode e = new TreeNode(40);
		TreeNode f = new TreeNode(60);
		TreeNode g = new TreeNode(80);
		
		a.left=b; a.right=c;
		b.left=d; b.right=e;
		c.left=f; c.right=g;
		
		int key = 80;
		
		TreeNode[] prev = {null};
		inorderPredAndSucc(a, prev, key);
	}

}
