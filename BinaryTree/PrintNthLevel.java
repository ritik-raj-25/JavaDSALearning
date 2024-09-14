package BinaryTree;

public class PrintNthLevel {
    public static void displayNthLevel(TreeNode root, int currLevel, int n){
        if(root == null) return;
        if(currLevel == n) System.out.print(root.val+" ");
        displayNthLevel(root.left, currLevel+1, n);
        displayNthLevel(root.right, currLevel+1, n);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); //root of the tree
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        g.left=h;

        int n = 2; //level to be printed (0 based indexing)

        displayNthLevel(a,0,n);
    }
}
