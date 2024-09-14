package BinaryTree;

public class NumberOfLevels {
    public static int noOfLevels(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(noOfLevels(root.left), noOfLevels(root.right));
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

        System.out.println("Number of levels in the given tree is : "+noOfLevels(a));
    }
}