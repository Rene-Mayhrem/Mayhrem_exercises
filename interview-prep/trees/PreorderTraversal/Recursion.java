package trees.PreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    // base case where node is null -> we return
    public List<Integer> printPreorderTraversal (TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalHelper(root, result);
        return result;
    }

    public void preorderTraversalHelper (TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        } else {
            result.add(root.value);
            preorderTraversalHelper(root.left, result);
            preorderTraversalHelper(root.right, result);
        }
    }

}



class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
}