package BinaryTree;

import java.util.Stack;

public class InOrderTraveralIterative {
    public static void inOrderTraversal(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(true){
            if(temp != null){
                st.push(temp);
                temp = temp.left;
            }
            else{
                if(st.size() <= 0) break;
                TreeNode top = st.pop();
                System.out.print(top.val+" ");
                temp = top.right;
            }
        }
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

        inOrderTraversal(a);
    }
}
