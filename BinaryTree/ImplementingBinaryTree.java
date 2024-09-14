package BinaryTree;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class ImplementingBinaryTree{
    public static void printBinaryTree(TreeNode root){ //displaying the tree
        if(root == null) return; //base case
        System.out.print(root.val+" ");
        printBinaryTree(root.left); //left subtree
        printBinaryTree(root.right); //right subtree
    }
    public static void main(String[] args){
        TreeNode a = new TreeNode(1); //root of the tree
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        printBinaryTree(a);
    }
}