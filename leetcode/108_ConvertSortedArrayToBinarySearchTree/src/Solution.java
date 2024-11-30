public class Solution {
  public TreeNode sortedrrayToBST (int[] nums) {
    return sort(nums, 0, nums.length - 1);
  }

  private TreeNode sort (int[] nums, int start, int end) {
    if (start > end) return null;

    int mid = (start + end) / 2;
    TreeNode node = new TreeNode(nums[mid]);

    node.left = sort (nums, start, mid - 1);
    node.right = sort(nums, mid + 1, end);

    return node;
  }

  public void inorder (TreeNode root) {
    if (root != null) {
      inorder(root.left);
      System.out.println(root.val +" ");
      inorder(root.right);
    }
    

  }
}
