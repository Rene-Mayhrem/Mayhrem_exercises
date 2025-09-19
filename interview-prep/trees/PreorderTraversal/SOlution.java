package trees.PreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SOlution {
    public List<Integer> preorderTraversal (TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> preorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        stack.add(current);
        while (!stack.isEmpty()) {
            TreeNode popped = stack.pop();
            preorder.add(popped.value);
            if (popped.right != null) stack.add(popped.right);
            if (popped.left != null) stack.add(popped.left);
            current = popped;
        }
        return preorder;
    }
}

class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;

    TreeNode() {

    }

}