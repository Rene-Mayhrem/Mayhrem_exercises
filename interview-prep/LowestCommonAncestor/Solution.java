package LowestCommonAncestor;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: If root is null, or it's one of the target nodes, return the root.
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search for p and q in the left and right subtrees.
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are not null, it means p and q are found in different subtrees.
        // Therefore, the current root is the lowest common ancestor.
        if (left != null && right != null) {
            return root;
        }

        // If only the left subtree returns a non-null result, it means both p and q
        // were found in the left subtree. The LCA is therefore in the left subtree.
        if (left != null) {
            return left;
        }

        // Otherwise, the LCA must be in the right subtree.
        return right;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}