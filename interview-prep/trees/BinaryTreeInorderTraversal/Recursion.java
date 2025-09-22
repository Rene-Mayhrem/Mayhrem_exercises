package trees.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public List<Integer> inorderTraversal (TreeNode root) {
        List<Integer> result = new ArrayList();
        inorderTraversalHelper(root, result);
        return result;
    }

    public void inorderTraversalHelper (TreeNode root, List<Integer> result) {
        if (root == null) return;
        // left > root > right
        inorderTraversalHelper(root.left, result);
        result.add(root.value);
        inorderTraversalHelper(root.right, result);
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    
    ////
}
