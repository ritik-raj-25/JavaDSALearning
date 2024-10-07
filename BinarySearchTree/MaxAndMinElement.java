package BinarySearchTree;

class TreeNode{
	public TreeNode left;
	public int val;
	public TreeNode right;
	public TreeNode(int val) {
		this.val = val;
	}
}

public class MaxAndMinElement {
	private static int minEle(TreeNode root) {
		if(root.left == null) return root.val;
		return minEle(root.left);
	}
	private static int maxEle(TreeNode root) {
		if(root.right == null) return root.val;
		return maxEle(root.right);
	}
	public static void main(String[] args) {
		TreeNode a = new TreeNode(10); //root node
		TreeNode b = new TreeNode(5);
		TreeNode c = new TreeNode(15);
		TreeNode d = new TreeNode(2);
		TreeNode e = new TreeNode(8);
		TreeNode f = new TreeNode(12);
		TreeNode g = new TreeNode(19);
		TreeNode h = new TreeNode(13);
		
		a.left=b; a.right=c;
		b.left=d; b.right=e;
		c.left=f; c.right=g;
		f.right=h;
		
		System.out.println("Maximum element :: "+maxEle(a));
		System.out.println("Minimum element :: "+minEle(a));
	}
}
