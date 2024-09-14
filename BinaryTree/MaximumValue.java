package BinaryTree;

public class MaximumValue {
    public static int maxVal(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        int temp1 = maxVal(root.left);
        int temp2 = maxVal(root.right);
        return Math.max(temp1, Math.max(root.val, temp2));
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

        System.out.println("Maximum Value is : "+maxVal(a));
    }
}