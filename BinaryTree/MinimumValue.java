package BinaryTree;

public class MinimumValue {
    public static int minVal(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        int leftMin = minVal(root.left);
        int rightMin = minVal(root.right);
        return Math.min(root.val, Math.min(leftMin, rightMin));
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

        System.out.println("Maximum Value is : "+minVal(a));
    }
}
