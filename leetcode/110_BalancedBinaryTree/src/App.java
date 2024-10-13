import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) { 
            return true;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);

        
    }

    public int getHeight (TreeNode node) {
        if (node == null) return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        

        return Math.max(leftHeight, rightHeight) + 1;
    }   
    
    
}
