package BinaryTree;

public class SizeOfBinaryTree {
    public static int size(TreeNode root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); //root of the tree
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(-3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(0);
        TreeNode f = new TreeNode(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        System.out.println("Size of the tree is : "+size(a));
    }
}
