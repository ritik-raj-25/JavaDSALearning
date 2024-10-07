package BinarySearchTree;

public class ShortestDistBetweenTwoNodes {
	public static int findDist(TreeNode node, int x) {
		if(node.val==x) return 0;
		int dist = 1;
		if(x > node.val) {
			dist += findDist(node.right, x);
		}
		else {
			dist += findDist(node.left, x);
		}
		return dist;
	} 
	public static int distBetweenNodes(TreeNode root, int a, int b) {
		if(a<root.val && b<root.val) {
			return distBetweenNodes(root.left, a, b);
		}
		else if(a>root.val && b>root.val) {
			return distBetweenNodes(root.right, a, b);
		}
		else { 
			return findDist(root,a) + findDist(root,b);
		}
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(10); // root node
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(12);
        TreeNode g = new TreeNode(19);
        TreeNode h = new TreeNode(13);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        f.right = h;

        int dist = distBetweenNodes(a, 5, 13);
        System.out.println(dist);
	}
}
