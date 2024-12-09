import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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

  public List<List<Integer>> levelOrder (TreeNode root) {
    if (root == null) return null;
    List<List<Integer>> result = new ArrayList<>();
    // result.add(Arrays.asList(root.value));
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(root, 0));
    while(!queue.isEmpty()) {
      Pair current = queue.poll();
      TreeNode node = current.node;
      int level = current.level;
      System.out.println("level -> "+level+" current node -> "+node.value);
      if (level == result.size()) {
        result.add(new ArrayList<>());
      }
      result.get(level).add(node.value);
      if (node.left != null) queue.add(new Pair(node.left, level + 1));
      if (node.right != null) queue.add(new Pair(node.right, level + 1));
    }
    // System.out.println(result);
    return result;
  }

  public List<List<Integer>> levelOrderWithRecursivity (TreeNode root) {
    if (root == null) return new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    helper(root, 0, result);
    return result;
  }

  public void helper (TreeNode node, int level, List<List<Integer>> result) {
    if (node == null) return;
    if (level >= result.size()) result.add(new ArrayList<>());
    result.get(level).add(node.value);
    helper(node.left, level + 1, result);
    helper(node.right, level + 1, result);
  }
}
