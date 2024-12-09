import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode () {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

  }

  public List<Double> averageOfLevels (TreeNode root) {
    List<Double> averages = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()) {
      int levelSize = queue.size();
      System.out.println("Level -> "+levelSize);
      double sum = 0;

      for (int i = 0; i < levelSize; i++) {
        TreeNode node = queue.poll();
        sum += node.val;
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
      }
      averages.add(sum / levelSize);
    }
    return averages;
  }
}
