package trees.postorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> postorderTraversal (TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode current = root;
        stack1.add(current);
        while(!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.add(node);

            if (node.left != null) stack1.add(node.left);
            if (node.right != null) stack1.add(node.right);
        }
        while(!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){}
}