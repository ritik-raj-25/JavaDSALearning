package BinaryTree;

public class ProductOfNonZeroTreeNodes {
    static int mul = 1;
    public static int productOfNonZeroNodes(TreeNode root){
        if(root == null) return 1;
        if(root.val != 0) mul *= root.val;
        productOfNonZeroNodes(root.left);
        productOfNonZeroNodes(root.right);
        return mul;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); //root of the tree
        TreeNode b = new TreeNode(0);
        TreeNode c = new TreeNode(0);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        System.out.println("Product of non-zero nodes is : "+productOfNonZeroNodes(a));
    }
}
