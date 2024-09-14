package BinaryTree;

public class SumOfTreeNodes {
    public static int sum(TreeNode root){
        if(root == null) return 0;
        return root.val+sum(root.left)+sum(root.right);
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

        System.out.println("Sum is : "+sum(a));
    }
}
