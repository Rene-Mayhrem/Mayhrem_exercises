import java.util.LinkedList;
import java.util.Queue;

import javax.swing.Painter;

public class Solution {

  
  //? 1. Make sure the tree is not empty
  //? 2. Create a Queue to store nodes and level (depth)
  //? -> Create a class which will be named: Pair (TreeNode, int)
  //? Iterate my queue while is not empty
  //? Create current pair -> node and depth
  //? Check if node.left and node.right are empty -> return depth
  //? Check if node.left is not null -> Add new pair with node.left and depth + 1
  //? Check if node.right is not null -> Add new pair with node.right and depth + 1
  

  public int minDepth (TreeNode root) {
    if (root == null) return 0;
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(root, 1)); //? Initialize witg root and level 1
    while (!queue.isEmpty()) {
      Pair current = queue.poll();
      TreeNode node = current.getNode();
      int level = current.getLevel();

      if (node.left == null && node.rigth == null) return level;
      if (node.left != null) queue.add(new Pair(node.left, level + 1));
      if (node.rigth != null) queue.add(new Pair(node.rigth, level + 1));
    } 
    return 0;
  }
}


