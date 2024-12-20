import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFSPostOrder {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
      this.val = val;
    }
  }

  public void postOrderTraversal (TreeNode root) {
    if (root == null) return;
    postOrderTraversal(root.left);
    postOrderTraversal(root.right);
    System.out.println(root.val+" ");
  }

  public void preOrderTraversal(TreeNode root) {
    if (root == null) return;
    System.out.println(root.val);
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
  }

  public void inOrderTraversal (TreeNode root) {
    if (root == null) return;
    inOrderTraversal(root.left);
    System.out.println(root.val);
    inOrderTraversal(root.right); 
  }

  public void postOrderTraversalUsingStack(TreeNode root) {
    if (root == null) return;
    Stack<TreeNode> stack1 = new Stack<>();
    Stack<TreeNode> stack2 = new Stack<>();
    stack1.push(root);
    while (!stack1.isEmpty()) {
      TreeNode node = stack1.pop();
      stack2.push(node);
      if (node.left != null) stack1.push(node.left);
      if (node.right != null) stack1.push(node.right);
    }
    while (!stack2.isEmpty()) {
      System.out.println(stack2.pop().val + " ");
    }
  }

  public void preOrderTraversalUsingStack(TreeNode root) {
    if (root == null) return;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      System.out.println(node.val + " ");
      if (node.right != null) stack.push(node.right);
      if (node.left != null) stack.push(node.left);
    }
  }

  public void inOrderTraversalUsingStack(TreeNode root) {
    if (root == null) return;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;
    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }
      current = stack.pop();
      System.out.println(current.val + " ");
      current = current.right;
    }
  }

  public void bfsWithRecursion(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    bfsRecursive(queue);
  }

  private void bfsRecursive(Queue<TreeNode> queue) {
    if (queue.isEmpty()) return;
    TreeNode node = queue.poll();
    System.out.println(node.val + " ");
    if (node.left != null) queue.add(node.left);
    if (node.right != null) queue.add(node.right);
    bfsRecursive(queue);
  }

  public void bfsWithQueue(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      System.out.println(node.val + " ");
      if (node.left != null) queue.add(node.left);
      if (node.right != null) queue.add(node.right);
    }
  }

}
