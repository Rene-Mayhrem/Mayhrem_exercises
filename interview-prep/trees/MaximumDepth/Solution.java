package trees.MaximumDepth;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int getMaximumDepthTree (Node root) {
        if (root == null) return 0;
        int maxDepth = 0;
        Queue<Node> levels = new LinkedList<>();
        levels.add(root);
        while (!levels.isEmpty()) {
            maxDepth++;
            int size = levels.size();
            for (int i = 0; i < size; i++) {
                Node current = levels.poll();
                if (current.left != null) levels.add(current.left);
                if (current.right != null) levels.add(current.right);
            }
        }
        return maxDepth;
    }
}

class Node {
    int value;
    Node right;
    Node left;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}