import java.util.Stack;

/*
* Given a file of currency conversion rates, write a 
* function that converts a given amount from any given 
* currency to another. 
* 
* Sample currencies file entries: 
* 
---- I am asuming
hashMap<String, List<Pair>>
* {"from":"USD", "to":"EUR", "rate":1.1}
* {"from":"GBP", "to":"COP", "rate":23.5} 
* {"from":"EUR", "to":"GBP", "rate":1.2} 
* {"from":"EUR", "to":"MXN", "rate":19} 
* 
* Means 10 USD is worth 310.20 COP 
* Means 3 EUR is worth 57 MXN 
*/

public class Solution {
  class Pair {

  }

  //? Create a stack to store nodes
  // ? Create a variable sum to track all the sum of the available nodes  
  //? Iterate using depth-first search
  public boolean hasPathSum(TreeNode root, int targetSum) {
      if (root == null) return false;
      Stack<TreeNode> stack = new Stack<>();
      stack.push(root);
      int sum = root.val;
      while (!stack.isEmpty()) {
        TreeNode current = stack.pop();
        if (current.left == null && current.right == null && sum == targetSum) return true;
        if (current.left != null) {
          stack.push(current.left);
          sum += current.left.val;
        }
        if (current.right != null) {
          stack.push(current.right); 
          sum += current.right.val;
        }
      }
      return false;
  }
}
