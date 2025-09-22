package DiameterBinaryTree;


public class Solution {

    int maxDepth = 0;

    public int getDiameterBinaryTree (TreeNode root) {
        getMaxDepth(root);
        return maxDepth;
    }

    public int getMaxDepth (TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = getMaxDepth(root.left);
            int rightDepth = getMaxDepth(root.right);
            maxDepth = Math.max(maxDepth, leftDepth + rightDepth);
            return 1 + Math.max(leftDepth, rightDepth);
        }
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
}
