import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        // Test case 1: Single element
        TreeNode root1 = new TreeNode(1);
        List<List<Integer>> result1 = solution.levelOrder(root1);
        System.out.println("Test case 1: " + result1); // Expected: [[1]]

        // Test case 2: Multiple levels
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);
        List<List<Integer>> result2 = solution.levelOrder(root2);
        System.out.println("Test case 2: " + result2); // Expected: [[1], [2, 3], [4, 5, 6, 7]]

        // Test case 3: Null root
        List<List<Integer>> result3 = solution.levelOrder(null);
        System.out.println("Test case 3: " + result3); // Expected: null
    }
}
