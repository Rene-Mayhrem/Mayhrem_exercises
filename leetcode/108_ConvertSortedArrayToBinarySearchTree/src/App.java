public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] nums = {-10, -3, 0, 5, 9};
        Solution solution = new Solution();
        TreeNode root = solution.sortedrrayToBST(nums);
        solution.inorder(root);
    }
}
