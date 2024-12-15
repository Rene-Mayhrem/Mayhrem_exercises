import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  class Pair {
    TreeNode node;
    int level;

    public Pair (TreeNode node, int level) {
      this.node = node;
      this.level = level;
    }
  }

  public int MaxDepth (TreeNode root) {
    if (root == null) return 0;
    int depth = 0;
    Queue<Pair> nodes = new LinkedList<>();
    nodes.add(new Pair(root, 1));
    while(!nodes.isEmpty()) {
      Pair current = nodes.poll();
      TreeNode node = current.node;
      depth = Math.max(depth, current.level);
      if (node.left != null) nodes.add(new Pair(node.left, depth + 1));
      if (node.right != null) nodes.add(new Pair(node.right, depth + 1));
    }
    return depth;
  }
}
