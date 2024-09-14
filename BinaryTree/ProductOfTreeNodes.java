package BinaryTree;

public class ProductOfTreeNodes {
    public static int product(TreeNode root){
        if(root == null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1); //root of the tree
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        System.out.println("Product is : "+product(a));
    }
}
