import java.util.Stack;

public class Solution {
  public boolean isSameTree (TreeNode p, TreeNode q) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(p);
    stack.push(q);
    while(!stack.isEmpty()) {
      TreeNode currentQ = stack.pop();
      TreeNode currentP = stack.pop();
      if (currentP == null && currentQ == null) continue;
      if (currentP == null || currentQ == null) return false;
      if (currentP.val != currentQ.val) return false;
      stack.push(currentP.left);
      stack.push(currentQ.left);
      stack.push(currentP.right);
      stack.push(currentQ.right);
    }
    return true;
  }
}
