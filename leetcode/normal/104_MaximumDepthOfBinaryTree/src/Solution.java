import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  class Pair {
    TreeNode node;
    int depth;

    Pair (TreeNode node, int depth) {
      this.node = node;
      this.depth = depth;
    }
  }

  public int maxDepth (TreeNode root) {
    if (root == null) return 0;
    int depth = 1;
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(root, depth));
    while (!queue.isEmpty()) {
      Pair current = queue.poll();
      TreeNode node = current.node;
      depth = Math.max(depth, current.depth);
      if (node.left != null) queue.add(new Pair(node.left, depth + 1));
      if (node.right != null) queue.add(new Pair(node.right, depth + 1));
    }
    return depth;
  }
}
