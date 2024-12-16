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


  //? INPUT -> Describe my tree class -> 
  //? OUTPUT -> levels of my tree
  //? SOLUTION 
  //? Use first breadth search -> traverse by levels
  //? Check if root is null -> 0
  //? Create a variable to store the maxDepth
  //? Use a queue to store nodes by level 
  //? Iterate through the queue while is not empty
  //? Reassign maxDepth variable by increasing level by level
  public int maxDepth (BinaryTree tree) {
    if (tree.root == null) return 0;
    int max = 0;
    Queue<Node> treeNodes = new LinkedList<>();
    treeNodes.add(tree.root);
    while(!treeNodes.isEmpty()) {
      Node current = treeNodes.poll();
      if (current.left != null) treeNodes.add(current.left);
      if (current.right != null) treeNodes.add(current.right);
    }
    return max;
  }
}
