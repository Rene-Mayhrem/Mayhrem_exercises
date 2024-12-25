public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!")
        int[] nums = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        for (int num : nums) System.out.println(num);
    }
}
