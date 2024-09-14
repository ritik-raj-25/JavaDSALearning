package BinaryTree;

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PostOrderTraversalIterative {
    public static List<Integer> postOrderTraversal(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if(root != null) st.push(root);
        while(st.size() > 0){
            TreeNode temp = st.pop();
            ans.add(temp.val);
            if(temp.left != null) st.push(temp.left);
            if(temp.right != null) st.push(temp.right);
        }
        Collections.reverse(ans);
        return ans;
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

        System.out.println(postOrderTraversal(a));
    }
}
