public class TreeNode {
  int val;
  TreeNode left;
  TreeNode rigth;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.rigth = right;
  }
}
