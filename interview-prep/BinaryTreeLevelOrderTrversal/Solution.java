package BinaryTreeLevelOrderTrversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> levels = new LinkedList<>();
        levels.add(root);
        while(!levels.isEmpty()) {
            int size = levels.size();
            List<Integer> nodesLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = levels.poll();
                nodesLevel.add(current.value);
                if (current.left != null) levels.add(current.left);
                if (current.right != null) levels.add(current.right);
            }
            result.add(nodesLevel);
        }
        return result;
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
}
