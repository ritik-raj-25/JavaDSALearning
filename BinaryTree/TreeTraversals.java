// T.C --> O(n)
// S.C --> O(n)

package BinaryTree;

public class TreeTraversals {
    public static void preorderTraversal(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(TreeNode root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(TreeNode root){
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(2); //root of the tree
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(11);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left=b; a.right=c; 
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.left=h;
        f.right=i;
        System.out.print("Preorder Traversal: ");
        preorderTraversal(a);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inorderTraversal(a);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postorderTraversal(a);
        System.out.println();
    }
}
