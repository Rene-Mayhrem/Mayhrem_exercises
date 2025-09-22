package MaximumDepthOfABinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int getMaxDepth (TreeNode root) {
        if (root == null) return 0;
        int maxDepth = 0;
        Queue<TreeNode> levels = new LinkedList<>();
        levels.add(root);
        while (!levels.isEmpty()) {
            int size = levels.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = levels.poll();
                if (current.left != null) levels.add(current.left);
                if (current.right != null) levels.add(current.right);
            }
            maxDepth++;
        }
        return maxDepth;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}