package BinarySearchTree;

public class CntSubtree {
	public static int maxBST(TreeNode root) {
		if(root.right == null) return root.val;
		return maxBST(root.right);
	}
	
	public static int minBST(TreeNode root) {
		if(root.left == null) return root.val;
		else return minBST(root.left);
	}
	
	public static void cntSubtree(TreeNode root, int low, int high, int[] cnt) {
		if(root == null) return;
		int maxEle = maxBST(root);
		int minEle = minBST(root);
		if(minEle>=low && minEle<=high && maxEle>=low && maxEle<=high) {
			cnt[0]++;
		}
		cntSubtree(root.left, low, high, cnt);
		cntSubtree(root.right, low, high, cnt);
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
		
		int[] cnt = {0};
		int low = 5;
		int high = 16;
		cntSubtree(a, low, high, cnt);
		System.out.println(cnt[0]);
	}
}
