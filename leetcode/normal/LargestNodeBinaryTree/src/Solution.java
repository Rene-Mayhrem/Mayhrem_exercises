import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  public int largestNode (TreeNode root) {
    if (root == null) return -1;
    int max = root.value;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
      TreeNode current = queue.poll();
      if (current.left != null) queue.add(current.left);
      if (current.right != null) queue.add(current.right);
      max = Math.max(max, current.value);
    }
    return max;
  }
}
