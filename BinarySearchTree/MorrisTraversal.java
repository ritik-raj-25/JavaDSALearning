package BinarySearchTree;

public class MorrisTraversal {
	public static void inOrderBST(TreeNode root) {
		TreeNode curr = root;
		while(curr != null) {
			if(curr.left != null) {
				TreeNode pred = curr.left;
				while(pred.right!=null && pred.right!=curr) {
					pred = pred.right;
				}
				if(pred.right == null) {
					pred.right = curr;
					curr = curr.left;
				}
				else {
					pred.right = null;
					System.out.print(curr.val+" ");
					curr = curr.right;
				}
			}
			else {
				System.out.print(curr.val+" ");
				curr = curr.right;
			}
		}
	}

	public static void main(String[] args) {
		TreeNode a = new TreeNode(5); //root
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(8);
		TreeNode d = new TreeNode(1);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(6);
		TreeNode g = new TreeNode(9);
		TreeNode h = new TreeNode(3);
		TreeNode i = new TreeNode(7);
		
		a.left=b; a.right=c;
		b.left=d; b.right=e;
		c.left=f; c.right=g;
		e.left=h;
		f.right=i;
		
		inOrderBST(a);
	}

}
