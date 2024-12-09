import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
    
    // Test Case 1: Simple binary tree
    Solution.TreeNode root1 = solution.new TreeNode(3);
    root1.left = solution.new TreeNode(9);
    root1.right = solution.new TreeNode(20, solution.new TreeNode(15), solution.new TreeNode(7));
    List<Double> result1 = solution.averageOfLevels(root1);
    System.out.println(result1); // Expected output: [3.0, 14.5, 11.0]

    // Test Case 2: Single node tree
    Solution.TreeNode root2 = solution.new TreeNode(1);
    List<Double> result2 = solution.averageOfLevels(root2);
    System.out.println(result2); // Expected output: [1.0]

    // Test Case 3: Empty tree
    // Solution.TreeNode root3 = null;
    // List<Double> result3 = solution.averageOfLevels(root3);
    // System.out.println(result3); // Expected output: []

    // Test Case 4: Tree with negative values
    Solution.TreeNode root4 = solution.new TreeNode(-1);
    root4.left = solution.new TreeNode(-2);
    root4.right = solution.new TreeNode(-3);
    List<Double> result4 = solution.averageOfLevels(root4);
    System.out.println(result4); // Expected output: [-1.0, -2.5]

    // Test Case 5: Larger tree
    Solution.TreeNode root5 = solution.new TreeNode(1);
    root5.left = solution.new TreeNode(2);
    root5.right = solution.new TreeNode(3);
    root5.left.left = solution.new TreeNode(4);
    root5.left.right = solution.new TreeNode(5);
    root5.right.left = solution.new TreeNode(6);
    root5.right.right = solution.new TreeNode(7);
    List<Double> result5 = solution.averageOfLevels(root5);
    System.out.println(result5); // Expected output: [1.0, 2.5, 5.5]
  }
}
