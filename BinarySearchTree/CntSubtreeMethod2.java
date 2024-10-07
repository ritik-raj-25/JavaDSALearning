package BinarySearchTree;

public class CntSubtreeMethod2 {
    public static boolean inRange(int val, int low, int high) {
        return val >= low && val <= high;
    }

    public static boolean cntSubtree(TreeNode root, int low, int high, int[] cnt) {
        if (root == null) return true;

        boolean leftInRange = cntSubtree(root.left, low, high, cnt);
        boolean rightInRange = cntSubtree(root.right, low, high, cnt);

        if (leftInRange && rightInRange && inRange(root.val, low, high)) {
            ++cnt[0];
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10); // root node
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(12);
        TreeNode g = new TreeNode(19);
        TreeNode h = new TreeNode(13);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        f.right = h;

        int[] cnt = {0};
        int low = 5;
        int high = 16;
        cntSubtree(a, low, high, cnt);
        System.out.println(cnt[0]);
    }
}