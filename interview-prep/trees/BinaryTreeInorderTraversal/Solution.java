package trees.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> getInorderListTree(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> inorderList = new ArrayList<>();
        Stack<TreeNode> helperStack = new Stack<>();
        TreeNode current = root;
        while (!helperStack.isEmpty() || current != null) {
            //? Move all the elements to the left
            while (current != null) {
                helperStack.add(current);
                current = current.left;    
            }
            TreeNode poppedNode = helperStack.pop();
            inorderList.add(poppedNode.value);
            current = poppedNode.right;
        }
        return inorderList;
    }
}


class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;

    TreeNode() {

    }

}