package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BfsRightToLeft {
    public static void bfs(TreeNode root){
        Queue<TreeNode> helper = new LinkedList<>();
        if(root != null) helper.add(root);
        while(helper.size() != 0){
            System.out.print(helper.peek().val+" ");
            if(helper.peek().right != null) helper.add(helper.peek().right);
            if(helper.peek().left != null) helper.add(helper.peek().left);
            helper.remove();
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

        bfs(a);
    }
}
