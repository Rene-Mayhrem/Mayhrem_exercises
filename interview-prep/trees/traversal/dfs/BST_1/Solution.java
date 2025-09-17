package trees.traversal.dfs.BST_1;

public class Solution {
    public Node getNodeBST (Node root, int target) {
        Node current = root;
        while (true) {
            if (current == null) return null;
            if (current.value == target) {
                return current;
            } else if (current.value < target) {
                getNodeBST(current.left, target);
            } else {
                getNodeBST(current.right, target);
            }
        }
    } 

    public Node getNodeRBST (Node root, int target) {
        Node current = root;
        if (current == null) return null;
        if (current.value == target) {
            return current;
        } else if (current.value < target) {
            current = getNodeRBST(current.left, target);
        } else {
            current = getNodeRBST(current.right, target);
        }
        return null;
    }
    
} 


class Node {
    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}